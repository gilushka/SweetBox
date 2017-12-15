package Sweets;

/**
 * Created by user on 15.12.2017.
 */
public class Cookie extends Sweet {
    public Cookie(){}

    public Cookie(String sName, float fCost, int iWeight){
        super(sName, fCost, iWeight);
    }

    public String description(){
        return "Печенька - " + sName + ". Веса в ней: " + iWeight + ". А стоит она: " + fCost + " рублей";
    }
}
