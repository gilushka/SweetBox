package Present;

import Sweets.Sweet;

/**
 * Класс формирования подарка. Даннвый класс вынесен в отдельную папку и для того, чтобы можно было получить доступ к переменным
 * класса Sweet их пришлось сделать публичными. Имеет ли это смысл или оставить их private а доступ осуществлять через геттеры и
 * сеттеры? Конструкция sweet.getiWeight будет работать?
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
        fTotalWeight += sweet.fWeight;
        iTotalCost += sweet.iCost;
    }

    public void printItems(){
        for (int i = 0; i < swArray.length; i++) {
            System.out.println(swArray[i].description());
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
