import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1

        /*
        int sum = 0;

        for(int i = 10; i<=100; i+=5){
            sum+=i;
        }

        System.out.println(sum);
        */


        // 2

        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = scanner.nextInt();

        int ctr = 0;

        do{
            a /= 10;
            ctr++;
        }while(a>0);

        System.out.println(ctr);
        */


        // 3

        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = scanner.nextInt();

        boolean check = false;

        for(int i = 2; i<=Math.sqrt(a); i++){
            if(a%i==0){
                System.out.println("არ არის მარტივი");
                check = true;
                break;
            }
        }

        if(!check && a!=1) System.out.println("მარტივია");
        if(a==1) System.out.println("არ არის მარტივი");
         */


        // 4

        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number a: ");
        int a = scanner.nextInt();
        System.out.print("Enter number b: ");
        int b = scanner.nextInt();

        int res = 1;

        for(int i = (int) Math.sqrt(Math.min(a, b)); i>=1; i--){
            if(a%i==0 && b%i==0){
                System.out.println(i);
                break;
            }
        }
        */


        // 5

        /*
        for(int i = 100; i<=999; i++){
            int a = i/100;
            int b = (i/10)%10;
            int c = i%10;

            if(i%(a+b+c)==0) System.out.println(i);
        }
        */


        // 6

        int a = 0;
        int b = 1;

        System.out.println(a);
        System.out.println(b);

        for(int i = 0; i<8; i++){
            System.out.println(a+b);
            int temp = a;

            a = b;
            b += temp;
        }
    }
}