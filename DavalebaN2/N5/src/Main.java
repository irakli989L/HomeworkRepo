public class Main {
    public static void main(String[] args) {
        float a = 15.6f;

        int n = (int) a;

        float res = a-n;

        System.out.println(res>=0.5 ? (n+1) : n);
    }
}