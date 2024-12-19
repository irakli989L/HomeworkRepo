public class Main {
    public static void main(String[] args) {
        Library library = new Library("State Library");

        BookAdvisor employee1 = new BookAdvisor("Irakli", "Kakabadze", "1238", 10, library);
        Bookkeeper employee2 = new Bookkeeper("Nikoloz", "Gogoberishvili", "1854");
        BookGiver employee3 = new BookGiver("Nicolas", "Augustus", "3718", 9, 22);
        NoiseControl employee4 = new NoiseControl("Maya", "Intskirveli", "1397", 9.5);

        library.addEmployee(employee1);
        library.addEmployee(employee2);
        library.addEmployee(employee3);
        library.addEmployee(employee4);

        AdventureBook book1 = new AdventureBook("The Hobbit", 310, "J.R.R. Tolkien", true);
        ScienceBook book2 = new ScienceBook("A Brief History of Time", 256, "Stephen Hawking", false, "Physics");
        FantasyBook book3 = new FantasyBook("Percy Jackson", 400, "Rick Riordan", true, "Greek");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);


        // -------

        Book recommendedBook = employee1.adviseBook();

        while (recommendedBook == null) {
            recommendedBook = employee1.adviseBook();
        }

        System.out.println("Recommended book: " + recommendedBook);
    }
}