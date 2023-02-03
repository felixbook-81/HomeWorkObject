package lesson1;

public class Book {
    String author;
    String publication;

    public Book(String author, String publication) {
        this.author = author;
        this.publication = publication;
    }

    public String getauthor() {
        return this.author;
    }

    public String getPublication() {
        return this.publication;

    }

    public void setPublication(String publication) {
        // Создали сеттер — метод, который меняет значение
        this.publication = publication;
    }
}