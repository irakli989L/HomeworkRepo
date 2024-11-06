import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1

//        int n = scanner.nextInt();
//
//        int a = 0;
//
//        for(int i = 1; i<=n; i++){
//            a+=i;
//        }
//
//        double res = (double) a / n;
//
//        System.out.println(res);


        // 2

//        int n = scanner.nextInt();
//
//        int i = 0;
//
//        while(n!=0){
//            if(Math.pow(2, i) <= n){
//                i++;
//            }else{
//                System.out.print((int) Math.pow(2, i-1)+" ");
//                n -= (int) Math.pow(2, i-1);
//                i=0;
//            }
//        }


        // 3

//        for(int i = 1; i<=15; i+=2){
//            if(i == 5 || i == 7 || i == 11) continue;
//            System.out.println(i);
//        }


        // 4

//        int binary = scanner.nextInt();
//
//        int decimal = 0;
//
//        int c = 0;
//
//        while(binary>0){
//            if(binary%10!=0){
//                decimal += (int) Math.pow(2, c);
//            }
//
//            binary /= 10;
//            c++;
//        }
//
//        System.out.println(decimal);


        // 5

//        int decimal = scanner.nextInt();
//
//        int binary = 0;
//
//        int c = 1;
//
//        while(decimal>0){
//            binary += (decimal%2)*c;
//            c*=10;
//            decimal/=2;
//        }
//
//        System.out.println(binary);


        // 6

        Random random = new Random();

        int x = random.nextInt(100)+1;

        int n = -1;

        while (n!=x){
            n = scanner.nextInt();

            if(x<n){
                System.out.println("მეტია");
            }else if(x>n){
                System.out.println("ნაკლებია");
            }else{
                System.out.println("სწორია! ეს რიცხვი იყო: "+x);
                break;
            }
        }
    }
}