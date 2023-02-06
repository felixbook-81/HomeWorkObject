package lesson1;

public class Book {
    private Author author;
    private int publicationYear;
    private String bookName;

    public Book(Author author, int publicationYear, String bookName) {

        this.author = author;
        this.publicationYear = publicationYear;
        this.bookName = bookName;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublicationYear() {
        return this.publicationYear;

    }

    public void setPublicationYear(int publicationYear) {     // Создали сеттер — метод, который меняет значение
        this.publicationYear = publicationYear;

    }

    public String getBookName() {
        return this.bookName;
    }

}




