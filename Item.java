// This is the parent class for all library items
public abstract class Item {
    String title;

    public Item(String title) {
        this.title = title;
    }

    // All items must have this method
    public abstract void showDetails();
}
