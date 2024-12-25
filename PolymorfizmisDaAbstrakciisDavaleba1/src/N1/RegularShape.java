package N1;

public class RegularShape {
    private int numOfSides;
    private double length;

    public RegularShape(int numOfSides, double length) {
        this.numOfSides = numOfSides;
        this.length = length;
    }

    public int getNumOfSides() {
        return numOfSides;
    }

    public void setNumOfSides(int numOfSides) {
        this.numOfSides = numOfSides;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


    public double getPerimeter(){
        return length*numOfSides;
    }
}