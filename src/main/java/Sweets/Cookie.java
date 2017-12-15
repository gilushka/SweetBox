package Sweets;

/**
 * Created by user on 15.12.2017.
 */
public class Cookie extends Sweet {
    public Cookie(){}

    public Cookie(String sName, int iCost, float fWeight){
        super(sName, iCost, fWeight);
    }

    public String description(){
        return "Печенька - " + sName + ". Веса в ней: " + fWeight + " кг. А стоит она: " + iCost + " рублей";
    }
}
