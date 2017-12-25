package Present;

import Sweets.Sweet;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

/**
 * Класс формирования подарка.
 */
public class GiftBox {
    private float fTotalWeight = 0; // Общий вес
    private int iTotalCost = 0;  // Общая цена
//    Sweet[] swArray = new Sweet[0]; // Массив в котором хранятся вкусняшки
    LinkedList<Sweet> list = new LinkedList<Sweet>();

    public void addItem(Sweet sweet){
/*        int iLen = swArray.length; // Длинна существующего массива вкусняшек
        Sweet[] swNewArray = new Sweet[iLen+1]; // Новый массив на +1 количество сладостей
        for (int i = 0; i < iLen; i++) {
            swNewArray[i] = swArray[i]; // Копируем сладости в новый массив
        }
        swNewArray[iLen] = sweet; // Добавляем в конец новую сладость
        swArray = swNewArray; // Присваиваем переменной swArray ссылку на новый созданный массив длинной +1 элемент*/
        fTotalWeight += sweet.getfWeight();
        iTotalCost += sweet.getiCost();
        list.add(sweet);
    }

    /**
     * Добавление сладости в середину по индексу
     */
    public void addItemInd(Sweet sweet, int iInd){
/*        int iLen = swArray.length; // Длинна существующего массива вкусняшек
        Sweet[] swNewArray = new Sweet[iLen+1]; // Новый массив на +1 количество сладостей
        for (int i = 0; i < iInd-1; i++) {
            swNewArray[i] = swArray[i]; // Копируем сладости в новый массив
        }
        swNewArray[iInd-1] = sweet; // Добавляем по индексу новую сладость
        for (int i = iInd; i < iLen+1; i++) {
            swNewArray[i] = swArray[i-1]; // Копируем вторую часть старого массива в новый
        }
        swArray = swNewArray; // Присваиваем переменной swArray ссылку на новый созданный массив длинной +1 элемент*/
        fTotalWeight += sweet.getfWeight();
        iTotalCost += sweet.getiCost();
        list.add(iInd-1, sweet);
    }



    /**
     * Удаление сладости по индексу
     */
    public void delItemInd(int iInd){
//        int iLen = swArray.length; // Длинна существующего массива вкусняшек
        fTotalWeight -= list.get(iInd-1).getfWeight();
        iTotalCost -= list.get(iInd-1).getiCost();

/*        Sweet[] swNewArray = new Sweet[iLen-1]; // Новый массив на +1 количество сладостей
        for (int i = 0; i < iInd-1; i++) {
            swNewArray[i] = swArray[i]; // Копируем сладости в новый массив
        }
        for (int i = iInd-1; i < iLen-1; i++) {
            swNewArray[i] = swArray[i+1]; // Копируем сладости в новый массив
        }
        swArray = swNewArray; // Присваиваем переменной swArray ссылку на новый созданный массив длинной +1 элемент*/
        list.remove(iInd-1);
    }

    public void printItems(){
        for (Sweet aSwArray : list) {
            System.out.println(aSwArray.description());
        }
    }

    public float getfTotalWeight() {
        return fTotalWeight;
    }

    public int getiTotalCost() {
        return iTotalCost;
    }

    public int getiItemCount(){
        return list.size();
    }

    public Sweet getSwItem(int i) {
        return list.get(i);
    }

    public int getSwArrayElementCost(int i) {
        return list.get(i-1).getiCost();
    }

    public void reportToFile(GiftBox box){
        File file = new File("Report.txt");
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (int i = 0; i < list.size(); i++) {
                writer.write(box.getSwItem(i).description());
            }
            writer.close();

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
