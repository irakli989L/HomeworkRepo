public class Library {
    private Employee[] employees;
    private Book[] books;
    private String name;
    private int empIndex;
    private int bookIndex;

    public Library(String name) {
        this.name = name;
        this.employees = new Employee[10];
        this.books = new Book[10];
        this.empIndex = 0;
        this.bookIndex = 0;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        if(empIndex == employees.length){
            increaseEmpSize();
        }

        employees[empIndex++] = employee;
    }

    public void addBook(Book book) {
        if(bookIndex == books.length){
            increaseBookSize();
        }

        books[bookIndex++] = book;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private void increaseEmpSize(){
        Employee[] newEmp = new Employee[employees.length + 5];

        for(int i = 0; i<employees.length; i++){
            newEmp[i] = employees[i];
        }

        employees = newEmp;
    }

    private void increaseBookSize(){
        Book[] newBook = new Book[books.length + 5];

        for(int i = 0; i<books.length; i++){
            newBook[i] = books[i];
        }

        books = newBook;
    }
}
