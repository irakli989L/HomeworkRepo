import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Object N1

        System.out.print("Enter first name: ");
        String firstName1 = scanner.next();

        System.out.print("Enter last name: ");
        String lastName1 = scanner.next();

        System.out.print("Enter age: ");
        int age1 = scanner.nextInt();

        Human human1 = new Human(firstName1, lastName1, age1);

        human1.walk();

        // Object N2

        System.out.print("Enter first name: ");
        String firstName2 = scanner.next();

        System.out.print("Enter last name: ");
        String lastName2 = scanner.next();

        System.out.print("Enter age: ");
        int age2 = scanner.nextInt();

        Human human2 = new Human(firstName2, lastName2, age2);
        human2.walk();

        human1.hangOut(human2);


        scanner.close();
    }
}