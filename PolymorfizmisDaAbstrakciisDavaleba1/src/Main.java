import java.util.Scanner;
import N1.*;
import N2.*;
import N3.*;
import N4.*;
import N5.*;

public class Main {
    public static void main(String[] args) {
        // 1

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the number of sides for the regular shape: ");
//        int numOfSides = scanner.nextInt();
//        System.out.print("Enter the length of each side for the regular shape: ");
//        double nLength = scanner.nextDouble();
//        RegularShape regShape = new RegularShape(numOfSides, nLength);
//
//        System.out.print("Enter the length of the side for the square: ");
//        double squareLength = scanner.nextDouble();
//        Square square = new Square(squareLength);
//
//        System.out.print("Enter the length of the side for the regular triangle: ");
//        double triangleLength = scanner.nextDouble();
//        RegularTriangle triangle = new RegularTriangle(triangleLength);
//
//        System.out.println("Perimeter of the regular shape: " + regShape.getPerimeter());
//        System.out.println("Perimeter of the square: " + square.getPerimeter());
//        System.out.println("Perimeter of the regular triangle: " + triangle.getPerimeter());


        // 2

//        Triangle triangle = new Triangle(0.9, 1.2, 1.5);
//        triangle.printData();
//        System.out.println("Triangle Perimeter: " + triangle.getPerimeter());
//        System.out.println();
//
//        Rectangle rectangle = new Rectangle(5.8, 7.2);
//        rectangle.printData();
//        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
//        System.out.println();
//
//        Shape shape = new Shape(0, 0);
//        shape.printData();
//        System.out.println("Shape Perimeter: " + shape.getPerimeter());


        // 3

//        Car car = new Car(100.0, 25.0, 4, 50.0);
//        System.out.println("Price of the car: $" + car.calculatePrice());
//
//        Dolly dolly = new Dolly(30.0, 40.0, 20.0);
//        System.out.println("Price of the dolly: $" + dolly.calculatePrice());


        // 4

//        FixedSalaryEmployee fixedEmployee = new FixedSalaryEmployee("Irakli", "Kakabadze", "123-456-7890", 3000.0);
//        System.out.println("Fixed Salary Employee:");
//        System.out.println();
//        fixedEmployee.printData();
//
//        System.out.println();
//        System.out.println();
//
//        DailySalaryEmployee dailyEmployee = new DailySalaryEmployee("Avto", "Ukhurgunashvili", "987-654-3210", 20, 150.0);
//        System.out.println("Daily Salary Employee:");
//        System.out.println();
//        dailyEmployee.printData();


        // 5

        N5.Car car = new N5.Car();

        car.start();
        car.right();
        car.left();
        car.stop();
    }
}