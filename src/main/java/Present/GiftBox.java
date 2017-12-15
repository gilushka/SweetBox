package Present;

import Sweets.Sweet;

/**
 * Класс формирования подарка. Даннвый класс вынесен в отдельную папку и для того, чтобы можно было получить доступ к переменным
 * класса Sweet их пришлось сделать публичными. Имеет ли это смысл или оставить их private а доступ осуществлять через геттеры и
 * сеттеры? Конструкция sweet.getiWeight будет работать?
 */
public class GiftBox {
    private int iTotalWeight = 0; // Общий вес
    private float fTotalCost = 0;  // Общая цена
    Sweet[] swArray = new Sweet[0]; // Массив в котором хранятся вкусняшки

    public void addItem(Sweet sweet){
        int iLen = swArray.length; // Длинна существующего массива вкусняшек
        Sweet[] swNewArray = new Sweet[iLen+1]; // Новый массив на +1 количество сладостей
        for (int i = 0; i < iLen; i++) {
            swNewArray[i] = swArray[i]; // Копируем сладости в новый массив
        }
        swNewArray[iLen] = sweet; // Добавляем в конец новую сладость
        swArray = swNewArray; // Присваиваем переменной swArray ссылку на новый созданный массив длинной +1 элемент
        iTotalWeight += sweet.iWeight;
        fTotalCost += sweet.fCost;
    }

    public void printItems(){
        for (int i = 0; i < swArray.length; i++) {
            System.out.println(swArray[i].description());
        }
    }

    public int getiTotalWeight() {
        return iTotalWeight;
    }

    public float getfTotalCost() {
        return fTotalCost;
    }

    public int getiItemCount(){
        return swArray.length;
    }
}
