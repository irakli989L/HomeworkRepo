public class Book {
    String name;
    String author;
    int pages;

    public Book(String name, String author, int pages){
        this.name = name;
        this.author = author;
        this.pages = pages;
    }

    public Book(){
        this.name = "Harry Potter and the Prisoner of Azkaban";
        this.author = "J.K. Rowling";
        this.pages = 0;
    }

    public void displayBookInfo(){
        System.out.println("Book name: "+name);
        System.out.println("Book author: "+author);
        System.out.println("Number of pages: "+pages);
    }
}
