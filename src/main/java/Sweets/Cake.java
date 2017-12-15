package Sweets;

/**
 * Класс пироженки
 */
public class Cake extends Sweet {
    public Cake(){}

    public Cake(String sName, int iCost, float fWeight){
        super(sName, iCost, fWeight);
    }

    public String description(){
        return "Пироженка - " + getsName() + ". Веса в ней: " + getfWeight() + " кг. А стоит она: " + getiCost() + " рублей";
    }
}
