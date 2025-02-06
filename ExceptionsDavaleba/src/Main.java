import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N1

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        try {
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }


        // N2

        scanner.nextLine();
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input); // gadaiyvans int shi
            int result = 100 / number; // ratomgac double-shi ro gadaviyvane infinity-s werda
            System.out.println("100 divided by " + number + " is " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }


        // N3

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        try {
            checkIfNegative(n);
            System.out.println("You are good to go pal.");
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }


        // N4

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        try {
            double sqrtResult = calculateSquareRoot(number);
            System.out.println("Square root: " + sqrtResult);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }


    // N3 - method

    public static void checkIfNegative(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed.");
        }
    }

    // N4 - method

    public static double calculateSquareRoot(double number){
        if(number < 0){
            throw new IllegalArgumentException("Numbers below 0 are not allowed.");
        }

        return Math.sqrt(number);
    }
}