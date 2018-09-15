import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz jedną z opcji (dodanie książki / wyszukanie książki / aktualizacja książki / usunięcie książki");
        String userInput = scanner.nextLine();

        BookDao bookDao = new BookDao();

        if(userInput.equals("dodanie książki")){
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
            bookDao.save(book);
            System.out.println("Książka została dodana");
        } else if(userInput.equals("wyszukanie książki")){
            System.out.println("Podaj numer isbn");
            String userInput1 = scanner.nextLine();
            Book book = bookDao.read(userInput1);
            System.out.println(book.getTitle() + " " + book.getAuthor() + " " + book.getYear() + " " +  book.getIsbn());
        } else if(userInput.equals("aktualizacja książki")){
            System.out.println("Podaj numer isbn książki, którą chciałbyś zaktualizować");
            String userInput2 = scanner.nextLine();
            Book book = bookDao.read(userInput2);
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
        } else if(userInput.equals("usunięcie książki")){
            System.out.println("Podaj numer isbn książki, która powinna zostać skasowana");
            String userInput3 = scanner.nextLine();
            bookDao.delete(userInput3);
            System.out.println("Książka została skasowana");
        } else
            System.out.println("Podana opcja jest nieprawidłowa. Wybierz dodanie książki / wyszukanie książki / aktualizacja książki / usunięcie książki");
        bookDao.close();
    }
}
