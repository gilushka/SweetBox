package Sweets;

/**
 * Created by user on 14.12.2017.
 */
public class Candy extends Sweet {
//    public Candy(){}

    public Candy(String sName, float fCost, int iWeight){
        super(sName, fCost, iWeight);
    }

    public String description(){
        System.out.println("Конфета - " + sName + );
    }
}
