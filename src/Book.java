public class Book {
    private String nameBook;
    private Author author;
    private int yearPublication;

    public Book(String nameBook, Author author, int yearPublication) {
        this.nameBook = nameBook;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public String getAuthor() {
        return this.author.toString();
    }

    public int getYearPublication() {
        return this.yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    public String toString() {
        return "Автор: " + this.author + " Произведение: " + this.nameBook;
    }

    public boolean equals (String nameBook){
        return this.getNameBook() == nameBook;
    }

    public int hashCode() {
        return 31*this.getYearPublication();
    }
}
