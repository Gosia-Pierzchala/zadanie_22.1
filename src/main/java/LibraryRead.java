import java.util.Scanner;

public class LibraryRead {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj numer isbn");
        String userInput = scanner.nextLine();

        BookDao bookDao = new BookDao();
        Book book = bookDao.read(userInput);
        System.out.println(book.getTitle() + " " + book.getAuthor() + " " + book.getYear() + " " +  book.getIsbn());
        bookDao.close();
    }
}