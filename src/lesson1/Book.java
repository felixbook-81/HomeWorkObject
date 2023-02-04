package lesson1;

public class Book {
    String bookTitle;
    int publication;

    public Book(String author, int publication) {
        this.bookTitle = bookTitle;
        this.publication = publication;
    }

    public String getbookTitle() {
        return this.bookTitle;
    }

    public int getPublication() {
        return this.publication;

    }

    public void setPublication(int publication) {
        // Создали сеттер — метод, который меняет значение
        this.publication = publication;
    }
