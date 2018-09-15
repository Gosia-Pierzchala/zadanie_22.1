import java.util.Scanner;

public class LibrarySave {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tytuł książki, którą chcesz dodać");
        String title = scanner.nextLine();
        System.out.println("Podaj autora");
        String author = scanner.nextLine();
        System.out.println("Podaj rok wydania");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj isbn");
        String isbn = scanner.nextLine();

        Book book = new Book(title, author, year, isbn);
        BookDao bookDao = new BookDao();
        bookDao.save(book);
        System.out.println("Książka została dodana");
        bookDao.close();
    }
}




