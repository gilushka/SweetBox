package Sweets;

/**
 * Родительский класс сладостей
 */
public abstract class Sweet {
    public String sName;
    public int iCost;
    public float fWeight;
    public Sweet() {}

    public Sweet(String sName, int iCost, float fWeight){
        this.sName = sName;
        this.iCost = iCost;
        this.fWeight = fWeight;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getiCost() {
        return iCost;
    }

    public void setiCost(int iCost) {
        this.iCost = iCost;
    }

    public float getfWeight() {
        return fWeight;
    }

    public void setfWeight(float fWeight) {
        this.fWeight = fWeight;
    }

    public abstract String description();
}
