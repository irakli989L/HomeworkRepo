import java.util.Random;

public class BookAdvisor extends Employee{
    private double adviseRating;
    private Library library;

    public BookAdvisor(String name, String surname, String id, double adviseRating, Library library) {
        super(name, surname, id);
        this.adviseRating = adviseRating;
        this.library = library;
    }

    public double getAdviseRating() {
        return adviseRating;
    }

    public void setAdviseRating(double adviseRating) {
        this.adviseRating = adviseRating;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public Book adviseBook(){
        Book[] books = library.getBooks();

        Random random = new Random();

        int rand_index = random.nextInt(books.length);

        return books[rand_index];
    }
}
