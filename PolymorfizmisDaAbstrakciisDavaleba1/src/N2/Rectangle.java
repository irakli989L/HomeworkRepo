package N2;

public class Rectangle extends Shape{
    public Rectangle(double x, double y) {
        super(x, y);
    }

    @Override
    public void printData(){
        System.out.println("Shape name: Shape");
        System.out.println("X = "+x);
        System.out.println("Y = "+y);
    }

    @Override
    public double getPerimeter(){
        return 2*(x+y);
    }
}
