public class Main {
    public static void main(String[] args) {
        int n = 1467;

        int a = n/1000;
        int b = (n/100)%10;
        int c = (n/10)%10;
        int d = n%10;

        System.out.println(a+b+c+d);
    }
}