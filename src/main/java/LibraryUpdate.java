import java.util.Scanner;

public class LibraryUpdate {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj numer isbn książki, którą chciałbyś zaktualizować");
        String userInput = scanner.nextLine();

        BookDao bookDao = new BookDao();
        Book book = bookDao.read(userInput);
        System.out.println("Podaj tytuł, który powinien widnieć po aktualizacji");
        String title = scanner.nextLine();
        book.setTitle(title);
        System.out.println("Podaj autora");
        String author = scanner.nextLine();
        book.setAuthor(author);
        System.out.println("Podaj rok wydania");
        int year = scanner.nextInt();
        scanner.nextLine();
        book.setYear(year);
        System.out.println("Podaj numer isbn");
        String isbn = scanner.nextLine();
        book.setIsbn(isbn);
        bookDao.update(book);
        bookDao.close();
    }
}