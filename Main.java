import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library myLibrary = new Library();

        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Issue a Book");
            System.out.println("4. Return a Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String bTitle = sc.nextLine();
                    System.out.print("Enter author name: ");
                    String bAuthor = sc.nextLine();
                    Book newBook = new Book(bTitle, bAuthor);
                    myLibrary.addBook(newBook);
                    break;

                case 2:
                    myLibrary.viewAllBooks();
                    break;

                case 3:
                    System.out.print("Enter book title to issue: ");
                    String issueBook = sc.nextLine();
                    myLibrary.issueBook(issueBook);
                    break;

                case 4:
                    System.out.print("Enter book title to return: ");
                    String returnBook = sc.nextLine();
                    myLibrary.returnBook(returnBook);
                    break;

                case 5:
                    keepRunning = false;
                    System.out.println("Library System closed.");
                    break;

                default:
                    System.out.println("Invalid input. Please try again.");
            }
        }

        sc.close();
    }
}
