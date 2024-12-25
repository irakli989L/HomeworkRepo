package N3;

public class Dolly extends Toy{
    private double hairPrice;
    private double clothingPrice;
    private double extraSpendings;

    public Dolly(double hairPrice, double clothingPrice, double extraSpendings) {
        this.hairPrice = hairPrice;
        this.clothingPrice = clothingPrice;
        this.extraSpendings = extraSpendings;
    }

    public double getHairPrice() {
        return hairPrice;
    }

    public void setHairPrice(double hairPrice) {
        this.hairPrice = hairPrice;
    }

    public double getClothingPrice() {
        return clothingPrice;
    }

    public void setClothingPrice(double clothingPrice) {
        this.clothingPrice = clothingPrice;
    }

    public double getExtraSpendings() {
        return extraSpendings;
    }

    public void setExtraSpendings(double extraSpendings) {
        this.extraSpendings = extraSpendings;
    }


    @Override
    public double calculatePrice(){
        return hairPrice+clothingPrice+extraSpendings;
    }
}
