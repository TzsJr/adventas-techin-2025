package lt.ng.model.library;

public class Book {
    private final int id;
    private final String title;
    private final String author;
    private final int totalCopies;
    private int availableCopies;

    public Book(int id, String title, String author, int totalCopies) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.totalCopies = totalCopies;
        availableCopies = totalCopies;
    }

    public boolean isAvailable() {
        return availableCopies > 0;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getTotalCopies() {
        return totalCopies;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void borrowBook() {
        availableCopies--;
    }

    public void returnBook() {
        availableCopies++;
    }
}
