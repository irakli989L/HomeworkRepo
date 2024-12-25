package N3;

public class Car extends Toy{
    private double interiorPrice;
    private double tyrePrice;
    private int numOfTyres;
    private double extraSpendings;

    public Car(double interiorPrice, double tyrePrice, int numOfTyres, double extraSpendings) {
        this.interiorPrice = interiorPrice;
        this.tyrePrice = tyrePrice;
        this.numOfTyres = numOfTyres;
        this.extraSpendings = extraSpendings;
    }

    public double getInteriorPrice() {
        return interiorPrice;
    }

    public void setInteriorPrice(double interiorPrice) {
        this.interiorPrice = interiorPrice;
    }

    public double getTyrePrice() {
        return tyrePrice;
    }

    public void setTyrePrice(double tyrePrice) {
        this.tyrePrice = tyrePrice;
    }

    public int getNumOfTyres() {
        return numOfTyres;
    }

    public void setNumOfTyres(int numOfTyres) {
        this.numOfTyres = numOfTyres;
    }

    public double getExtraSpendings() {
        return extraSpendings;
    }

    public void setExtraSpendings(double extraSpendings) {
        this.extraSpendings = extraSpendings;
    }


    @Override
    public double calculatePrice(){
        return interiorPrice + (tyrePrice*numOfTyres) + extraSpendings;
    }
}
