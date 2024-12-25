package N1;

public class RegularTriangle extends RegularShape{
    public RegularTriangle(double length) {
        super(3, length);
    }

    @Override
    public double getPerimeter(){
        return 3*super.getLength();
    }
}