public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        System.out.println(r.perimeter());
        System.out.println(r.area());
        System.out.println(r.diagonal());

        // 4

        System.out.println(r.isSquare() ? "True" : "False");
    }
}