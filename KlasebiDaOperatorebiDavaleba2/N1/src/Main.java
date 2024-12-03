import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Car N1

        String name1 = scanner.nextLine();
        String model1 = scanner.nextLine();
        int year1 = scanner.nextInt();
        scanner.nextLine();
        String carNumber1 = scanner.nextLine();


        Car car1 = new Car();

        car1.setName(name1);
        car1.setModel(model1);
        car1.setYear(year1);
        car1.setCarNumber(carNumber1);

        car1.printInfo();


        // Car N2

        String name2 = scanner.nextLine();
        String model2 = scanner.nextLine();
        int year2 = scanner.nextInt();
        scanner.nextLine();
        String carNumber2 = scanner.nextLine();

        Car car2 = new Car();

        car2.setName(name2);
        car2.setModel(model2);
        car2.setYear(year2);
        car2.setCarNumber(carNumber2);

        car2.printInfo();
    }
}