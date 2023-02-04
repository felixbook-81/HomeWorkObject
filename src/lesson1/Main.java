package lesson1;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Лев", "Tолстой");
        Author author2 = new Author("Александр", "Пушкин");
        Book book1 = new Book("Война и Мир", 1867);
        Book book2 = new Book("Онегин", 1833);
        System.out.println("Название книги = " + book1.getbookTitle());
        System.out.println("Название книги = " + book2.getbookTitle());
        System.out.println("Автор = " + author1.getName()+ " " + author1.getSurname());
        System.out.println("Автор = " + author2.getName()+ " " + author2.getSurname());
        System.out.println("Год Публикации = " + book1.getPublication());
        System.out.println("Год Публикации = " + book2.getPublication());

        book1.setPublication(1938);
        // Вызываем сеттер
        System.out.println("Год Публикации =  " + book1.getPublication());
        
    }
}
