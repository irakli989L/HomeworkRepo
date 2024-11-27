import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1

        System.out.print("Enter Book Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Book Author: ");
        String author = scanner.nextLine();
        System.out.print("Enter amount of pages: ");
        int pages = scanner.nextInt();

        Book b = new Book(name, author, pages);

        b.displayBookInfo();


        // 2
        Book bk = new Book();

        bk.displayBookInfo();
    }
}