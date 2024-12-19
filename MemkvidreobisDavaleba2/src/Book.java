public class Book {
    private String title;
    private int pages;
    private String author;
    private boolean isSolidCover;

    public Book(String title, int pages, String author, boolean isSolidCover) {
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.isSolidCover = isSolidCover;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isSolidCover() {
        return isSolidCover;
    }

    public void setSolidCover(boolean solidCover) {
        isSolidCover = solidCover;
    }

    private void read(){
        System.out.println("მე ვკითხულობ "+title+" წიგნს");
    }


    public String toString() {
        return "title: '" + title + '\'' +
                ", numberOfPages: " + pages +
                ", author: " + author +
                ", isHardcover: " + (isSolidCover ? "Yes" : "No");
    }
}
