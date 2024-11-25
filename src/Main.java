public class Main {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Фёдор", "Достоевский");
        Author secondAuthor = new Author("Александр", "Пушкин");

        Book firstBook = new Book("Преступление и наказание", firstAuthor, 1833);
        Book secondBook = new Book("Евгений Онегин", secondAuthor, 1833);

        firstBook.setYearPublication(1866);

        /*System.out.println("firstBook.nameBook = " + firstBook.getNameBook());
        System.out.println("firstBook.Author = " + firstBook.getAuthor());
        System.out.println("firstBook.yearPublication = " + firstBook.getYearPublication());
        System.out.println("secondBook.nameBook = " + secondBook.getNameBook());
        System.out.println("secondBook.Author = " + secondBook.getAuthor());
        System.out.println("secondBook.yearPublication = " + secondBook.getYearPublication());*/

        //System.out.println(firstAuthor.equals("Фёдор","Достоевский"));
        System.out.println(firstBook.hashCode());





    }
}