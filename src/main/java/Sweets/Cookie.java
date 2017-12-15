package Sweets;

/**
 * Класс печеньки
 */
public class Cookie extends Sweet {
    public Cookie(){}

    public Cookie(String sName, int iCost, float fWeight){
        super(sName, iCost, fWeight);
    }

    public String description(){
        return "Печенька - " + getsName() + ". Веса в ней: " + getfWeight() + " кг. А стоит она: " + getiCost() + " рублей";
    }
}
