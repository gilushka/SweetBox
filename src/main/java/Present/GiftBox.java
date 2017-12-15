package Present;

import Sweets.Sweet;

/**
 * Класс формирования подарка.
 */
public class GiftBox {
    private float fTotalWeight = 0; // Общий вес
    private int iTotalCost = 0;  // Общая цена
    Sweet[] swArray = new Sweet[0]; // Массив в котором хранятся вкусняшки

    public void addItem(Sweet sweet){
        int iLen = swArray.length; // Длинна существующего массива вкусняшек
        Sweet[] swNewArray = new Sweet[iLen+1]; // Новый массив на +1 количество сладостей
        for (int i = 0; i < iLen; i++) {
            swNewArray[i] = swArray[i]; // Копируем сладости в новый массив
        }
        swNewArray[iLen] = sweet; // Добавляем в конец новую сладость
        swArray = swNewArray; // Присваиваем переменной swArray ссылку на новый созданный массив длинной +1 элемент
        fTotalWeight += sweet.getfWeight();
        iTotalCost += sweet.getiCost();
    }

    /**
     * Добавление сладости в середину по индексу
     */
    public void addItemInd(Sweet sweet, int iInd){
        int iLen = swArray.length; // Длинна существующего массива вкусняшек
        Sweet[] swNewArray = new Sweet[iLen+1]; // Новый массив на +1 количество сладостей
        for (int i = 0; i < iInd-1; i++) {
            swNewArray[i] = swArray[i]; // Копируем сладости в новый массив
        }
        swNewArray[iInd-1] = sweet; // Добавляем по индексу новую сладость
        for (int i = iInd; i < iLen+1; i++) {
            swNewArray[i] = swArray[i-1]; // Копируем вторую часть старого массива в новый
        }
        swArray = swNewArray; // Присваиваем переменной swArray ссылку на новый созданный массив длинной +1 элемент
        fTotalWeight += sweet.getfWeight();
        iTotalCost += sweet.getiCost();
    }

    /**
     * Удаление сладости по индексу
     */
    public void delItemInd(int iInd){
        int iLen = swArray.length; // Длинна существующего массива вкусняшек
        fTotalWeight -= swArray[iInd-1].getfWeight();
        iTotalCost -= swArray[iInd-1].getiCost();
        Sweet[] swNewArray = new Sweet[iLen-1]; // Новый массив на +1 количество сладостей
        for (int i = 0; i < iInd-1; i++) {
            swNewArray[i] = swArray[i]; // Копируем сладости в новый массив
        }
        for (int i = iInd-1; i < iLen-1; i++) {
            swNewArray[i] = swArray[i+1]; // Копируем сладости в новый массив
        }
        swArray = swNewArray; // Присваиваем переменной swArray ссылку на новый созданный массив длинной +1 элемент
    }

    public void printItems(){
        for (Sweet aSwArray : swArray) {
            System.out.println(aSwArray.description());
        }
    }

    public float getiTotalWeight() {
        return fTotalWeight;
    }

    public int getfTotalCost() {
        return iTotalCost;
    }

    public int getiItemCount(){
        return swArray.length;
    }
}
