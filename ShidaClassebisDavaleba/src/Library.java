public class Library {
    private int id;
    private String name;

    public Library(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Library Information: ");
        System.out.println("Library ID: " + id);
        System.out.println("Library Name: " + name);

        Book book1 = new Book(101, "Harry Potter and the Prisoner of Azkaban");
        book1.printInfo();

        Book book2 = new Book(102, "Harry Potter and the Half Blood Prince");
        book2.printInfo();
    }

    private class Book {
        private int bookId;
        private String bookName;

        public Book(int bookId, String bookName) {
            this.bookId = bookId;
            this.bookName = bookName;
        }

        public void printInfo() {
            System.out.println("\nBook Information: ");
            System.out.println("Book ID: " + bookId);
            System.out.println("Book Name: " + bookName);
        }
    }
}
