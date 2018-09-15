import java.util.Scanner;

public class LibraryDelete {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj numer isbn książki, która powinna zostać skasowana");
        String userInput = scanner.nextLine();

        BookDao bookDao = new BookDao();
        bookDao.delete(userInput);
        System.out.println("Książka została skasowana");
        bookDao.close();

    }
}