package lesson1;

public class Book {
    String author;
    int publication;

    public Book(String author, int publication) {
        this.author = author;
        this.publication = publication;
    }

    public String getauthor() {
        return this.author;
    }

    public int getPublication() {
        return this.publication;

    }

    public void setPublication(int publication) {
        // Создали сеттер — метод, который меняет значение
        this.publication = publication;
    }
}
