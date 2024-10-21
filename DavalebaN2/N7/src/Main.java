public class Main {
    public static void main(String[] args) {
        int t = 2665;

        int hours = t / 3600;
        int mins = ((t - hours*3600)%3600)/60;
        int secs = t-hours*3600-mins*60;

        System.out.println(hours+" : "+mins+" : "+secs);

        // ეს ჩაითვალოს როგორც N8-დაც რადგან if-ების გამოყენება უბრალოდ აზრადაც არ მომსვლია.
    }
}