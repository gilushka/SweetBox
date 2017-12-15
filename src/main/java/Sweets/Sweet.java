package Sweets;

/**
 * Родительский класс сладостей
 */
public abstract class Sweet {
    private String sName;
    private int iCost;
    private float fWeight;
    public Sweet() {}

    public Sweet(String sName, int iCost, float fWeight){
        this.sName = sName;
        this.iCost = iCost;
        this.fWeight = fWeight;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) throws Exception {
        if (sName.equals(null)){
            throw new Exception("Вы не указали название");
        }
        this.sName = sName;
    }

    public int getiCost() {
        return iCost;
    }

    public void setiCost(int iCost) throws Exception {
        if (iCost < 0){
            throw new Exception("Цена не может быть отрицательной");
        }
        this.iCost = iCost;
    }

    public float getfWeight() {
        return fWeight;
    }

    public void setfWeight(float fWeight) throws Exception {
        if (fWeight <= 0){
            throw new Exception("Вес должен быть больше нуля");
        }
        this.fWeight = fWeight;
    }

    public abstract String description();
}
