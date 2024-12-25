package N2;

public class Shape {
    protected double x;
    protected double y; // arvici ras nishnavs namdvili tipi

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void printData(){
        System.out.println("Shape name: Shape");
        System.out.println("X = "+x);
        System.out.println("Y = "+y);
    }

    public double getPerimeter(){
        return 0;
    }
}
