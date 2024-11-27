public class Rectangle {
    double len;
    double wid;

    public Rectangle(){
        this.len = 14.8;
        this.wid = 11.1;
    }

    public double perimeter(){
        return 2*(len+wid);
    }

    public double area(){
        return len*wid;
    }

    public double diagonal(){
        return Math.sqrt(len*len+wid*wid);
    }

    // 4

    public boolean isSquare(){
        return len==wid;
    }
}
