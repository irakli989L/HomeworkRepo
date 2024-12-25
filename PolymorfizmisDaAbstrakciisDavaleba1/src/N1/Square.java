package N1;

public class Square extends RegularShape {
    public Square(double length) {
        super(4, length);
    }

    @Override
    public double getPerimeter(){
        return 4*super.getLength();
    }
}