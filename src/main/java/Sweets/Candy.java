package Sweets;

/**
 * Класс конфетки
 */
public class Candy extends Sweet {
    public Candy(){}

    public Candy(String sName, int iCost, float fWeight){
        super(sName, iCost, fWeight);
    }

    public String description(){
        return "Конфета - " + getsName() + ". Веса в ней: " + getfWeight() + " кг. А стоит она: " + getiCost() + " рублей";
    }
}
