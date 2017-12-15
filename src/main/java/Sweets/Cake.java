package Sweets;

/**
 * Created by user on 14.12.2017.
 */
public class Cake extends Sweet {
    public Cake(){}

    public Cake(String sName, int iCost, float fWeight){
        super(sName, iCost, fWeight);
    }

    public String description(){
        return "Пироженка - " + sName + ". Веса в ней: " + fWeight + ". А стоит она: " + iCost + " рублей";
    }
}
