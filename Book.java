public class Book extends Item {
    private String author;
    private boolean isIssued;

    public Book(String title, String author) {
        super(title);
        this.author = author;
        this.isIssued = false;
    }

    public void markAsIssued() {
        isIssued = true;
    }

    public void markAsReturned() {
        isIssued = false;
    }

    public boolean getIsIssued() {
        return isIssued;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void showDetails() {
        System.out.println("Title: " + title + " | Author: " + author + " | Issued: " + isIssued);
    }
}
