import N1.*;
import N2.*;
import N3.*;

public class Main {
    public static void main(String[] args) {
        // N1

//        Writer author1 = new Writer("J.K.", "Rowling");
//        Writer author2 = new Writer("George", "Orwell");
//
//        Book book1 = new Book("Harry Potter and the Prisoner of Azkaban", 500, "Fantasy", author1);
//        Book book2 = new Book("1984", 328, "Dystopian", author2);
//
//        Book[] books = {book1, book2};
//
//        for (Book book : books) {
//            System.out.println(book);
//            System.out.println();
//        }


        // N2

//        Fraction[] fractions = {
//                new Fraction(1, 2),
//                new Fraction(2, 4),
//                new Fraction(3, 6),
//                new Fraction(5, 10),
//                new Fraction(3, 4)
//        };
//
//        for (Fraction fraction : fractions) {
//            System.out.println(fraction);
//        }
//
//        int count = 0;
//        for (int i = 0; i < fractions.length; i++) {
//            for (int j = i + 1; j < fractions.length; j++) {
//                if (fractions[i].equals(fractions[j])) {
//                    count++;
//                }
//            }
//        }
//
//        System.out.println("Number of equal fractions: " + count);


        // N3

        QuadraticEquation[] equations = {
                new QuadraticEquation(1, -3, 2),
                new QuadraticEquation(1, -2, 1),
                new QuadraticEquation(1, -3, 2),
                new QuadraticEquation(1, 0, -4),
                new QuadraticEquation(1, 1, 1)
        };

        for (QuadraticEquation eq : equations) {
            System.out.println(eq);
        }

        int count = 0;
        for (int i = 0; i < equations.length; i++) {
            for (int j = i + 1; j < equations.length; j++) {
                if (equations[i].equals(equations[j])) {
                    count++;
                }
            }
        }

        System.out.println("Number of equal equations: " + count);
    }
}