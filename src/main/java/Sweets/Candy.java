package Sweets;

/**
 * Created by user on 14.12.2017.
 */
public class Candy extends Sweet {
    public Candy(){}

    public Candy(String sName, float fCost, int iWeight){
        super(sName, fCost, iWeight);
    }

    public String description(){
        return "Конфета - " + sName + ". Веса в ней: " + iWeight + ". А стоит она: " + fCost + " рублей";
    }
}
