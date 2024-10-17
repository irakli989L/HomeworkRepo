public class Main {
    public static void main(String[] args) {
        int year = 1900;

        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }else{
                System.out.println("Yes");
            }
        }
    }
}