package Sweets;

/**
 * Created by user on 14.12.2017.
 */
public class Candy extends Sweet {
    public Candy(){}

    public Candy(String sName, int iCost, float fWeight){
        super(sName, iCost, fWeight);
    }

    public String description(){
        return "Конфета - " + sName + ". Веса в ней: " + fWeight + " кг. А стоит она: " + iCost + " рублей";
    }
}
