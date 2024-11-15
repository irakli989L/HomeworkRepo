import java.util.Scanner;
import java.util.SortedMap;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1
        // b;


        // 2
        // c;


        // 3
        // d; -


        // 4
        // c;


        // 5
        // a;


        // 6
        // c;


        // 7
        // a;


        // 8
        // a;


        // 9
        // a;


        // 10
        // c;


        // 11
        // c;


        // 12
        // c;


        // 13
        // a;


        // 14
        // a;


        // 15
        // b;


        // 16
//        int[] arr = {1,5,9,2,10,7};
//
//        int cIndex = 0;
//        int eIndex = 0;
//
//
//        for(int i = 1; i<arr.length; i++){
//            if(arr[i]<arr[cIndex]) cIndex = i;
//            if(arr[i]>arr[eIndex]) eIndex = i;
//        }
//
//        System.out.println(cIndex+" მაღაზიაში ყველაზე იაფია და ღირს "+arr[cIndex]);
//        System.out.println(eIndex+" მაღაზიაში ყველაზე ძვირია და ღირს "+arr[eIndex]);



        // 17
//        for(int i = 1; i<=100; i++){
//            if(i%5==0 && i%7==0){
//                System.out.println("HEYHOW");
//            }
//            else if(i%5==0) System.out.println("HEY");
//            else if(i%7==0) System.out.println("HOW");
//        }



        // 18
//        System.out.print("Enter rows: ");
//        int r = scanner.nextInt();
//        System.out.print("Enter columns: ");
//        int c = scanner.nextInt();
//
//        int[][] arr = new int[r][c];
//
//        Random random = new Random();
//
//        for(int i = 0; i<r; i++){
//            for(int j = 0; j<c; j++){
//                arr[i][j] = random.nextInt(100)+1;
//            }
//        }
//
//        for(int i = 0; i<r; i++){
//            for(int j = 0; j<c; j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//        int min1 = 0;
//        int min2 = 0;
//        int max1 = 0;
//        int max2 = 0;
//
//        for(int i = 0; i<r; i++){
//            for(int j = 0; j<c; j++){
//                if(arr[i][j]<arr[min1][min2]){
//                    min1 = i;
//                    min2 = j;
//                }
//                if(arr[i][j]>arr[max1][max2]){
//                    max1 = i;
//                    max2 = j;
//                }
//            }
//        }
//
//        System.out.println("Biggest element: "+arr[max1][max2]+" at index: "+max1+", "+max2);
//        System.out.println("Smallest element: "+arr[min1][min2]+" at index: "+min1+", "+min2);



        // 19
//        System.out.print("Enter length: ");
//        int r = scanner.nextInt();
//
//        int[][] arr = new int[r][r];
//
//        Random random = new Random();
//
//        for(int i = 0; i<r; i++){
//            for(int j = 0; j<r; j++){
//                arr[i][j] = random.nextInt(100)+1;
//            }
//        }
//
//        int c = 0;
//
//        for(int i = 0; i<r; i++){
//            for(int j = 0; j<r; j++){
//                if(i==j){
//                    c+=arr[i][j];
//                    if(arr[i][j]!=arr[i][r-j-1]){
//                        c+=arr[i][r-j-1];
//                    }
//                }
//            }
//        }
//
//        for(int i = 0; i<r; i++){
//            for(int j = 0; j<r; j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//        System.out.println(c);



        // 20
        System.out.print("Enter rows: ");
        int r = scanner.nextInt();
        System.out.print("Enter columns: ");
        int c = scanner.nextInt();

        int[][] arr = new int[r][c];

        Random random = new Random();

        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                arr[i][j] = random.nextInt(100)+1;
            }
        }

        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                System.out.print(arr[i][j]+", ");
            }
            System.out.println();
        }

        System.out.println();


        int[][] arr1 = new int[c][r];

        for(int i = 0; i<c; i++){
            for(int j = 0; j<r; j++){
                arr1[i][j] = arr[r-j-1][i];
            }
        }

        for(int i = 0; i<c; i++){
            for(int j = 0; j<r; j++){
                System.out.print(arr1[i][j]+", ");
            }
            System.out.println();
        }
    }
}