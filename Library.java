import java.util.ArrayList;

public class Library {
    ArrayList<Item> itemList = new ArrayList<>();

    public void addBook(Book b) {
        itemList.add(b); // Because Book IS-A Item
        System.out.println("Book added.");
    }

    public void viewAllBooks() {
        if (itemList.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }

        for (Item i : itemList) {
            i.showDetails(); // Polymorphism in action
        }
    }

    public void issueBook(String title) {
        for (Item i : itemList) {
            if (i instanceof Book) {
                Book b = (Book) i;
                if (b.title.trim().equalsIgnoreCase(title.trim()) && !b.getIsIssued()) {
                    b.markAsIssued();
                    System.out.println("Book issued.");
                    return;
                }
            }
        }
        System.out.println("Book not available to issue.");
    }

    public void returnBook(String title) {
        for (Item i : itemList) {
            if (i instanceof Book) {
                Book b = (Book) i;
                if (b.title.trim().equalsIgnoreCase(title.trim()) && b.getIsIssued()) {
                    b.markAsReturned();
                    System.out.println("Book returned.");
                    return;
                }
            }
        }
        System.out.println("Either book was not issued or not found.");
    }
}
