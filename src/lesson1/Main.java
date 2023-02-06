package lesson1;

public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Лев", "Tолстой");

        Author author2 = new Author("Алексндр", "Пушкин");

        Book bookName1 = new Book(author1, 1837, "Война и Мир");
        Book bookName2 = new Book(author2, 1835, "Онегин");

        System.out.println("Автор = " + author1.getName() + " " + author1.getSurname());
        System.out.println("Автор = " + author2.getName() + " " + author2.getSurname());

        System.out.println("Название книги = " + bookName1.getBookName());
        System.out.println("Название книги = " + bookName2.getBookName());

        System.out.println("Год Публикации = " + bookName1.getPublicationYear());
        System.out.println("Год Публикации = " + bookName2.getPublicationYear());


        bookName1.setPublicationYear(1645);
        System.out.println("Год Публикации =  " + bookName1.getPublicationYear());

    }
}
