package N2;

public class Triangle extends Shape{
    private double z;

    public Triangle(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }


    @Override
    public void printData(){
        System.out.println("Shape name: Triangle");
        System.out.println("X = "+x);
        System.out.println("Y = "+y);
        System.out.println("Z = "+z);
    }

    @Override
    public double getPerimeter(){
        return x+y+z;
    }
}
