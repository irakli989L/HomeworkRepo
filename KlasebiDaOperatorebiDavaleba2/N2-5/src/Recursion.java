public class Recursion {
    // N2

    int kSum(int a, int b, int k){
        if(a>b) return 0;

        return a%k==0 ? a+kSum(a+1, b, k) : kSum(a+1, b, k);
    }

    // N3

    int nSum(int n){
        if(n==1) return 1;

        return n+nSum(n-1);
    }

    // N4

    int powAN(int a, int n){
        if(n==1) return a;

        return a*powAN(a, n-1);
    }

    // 5

    int numOfZeroes(int n){
        if(n<=0) return 0;

        return n%10==0 ? 1+numOfZeroes(n/10) : numOfZeroes(n/10);
    }

    void isEvenOrOdd(int n){
        System.out.println(numOfZeroes(n));
        System.out.println(numOfZeroes(n)%2==0 ? "Even" : "Odd");
    }
}
