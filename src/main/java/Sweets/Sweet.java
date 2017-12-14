package Sweets;

/**
 * Created by user on 14.12.2017.
 */
public abstract class Sweet {
    private String sName;
    private float fCost;
    private int iWeight;
//    public Sweet() {}

    public Sweet(String sName, float fCost, int iWeight){
        this.sName = sName;
        this.fCost = fCost;
        this.iWeight = iWeight;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public float getfCost() {
        return fCost;
    }

    public void setfCost(float fCost) {
        this.fCost = fCost;
    }

    public int getiWeight() {
        return iWeight;
    }

    public void setiWeight(int iWeight) {
        this.iWeight = iWeight;
    }
}
