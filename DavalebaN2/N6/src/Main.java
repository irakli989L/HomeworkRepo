public class Main {
    public static void main(String[] args) {
        double a = 6;
        double b = 13;

        double k = 4;

        double res = (a*b)/(k*k);

        int n = (int) res;

        System.out.println(res==n ? n : (n+1));
    }
}