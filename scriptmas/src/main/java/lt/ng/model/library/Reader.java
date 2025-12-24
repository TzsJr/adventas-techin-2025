package lt.ng.model.library;

import java.util.ArrayList;
import java.util.List;

public class Reader {
    private final int id;
    private final String name;
    private final int borrowLimit;
    private final List<Integer> borrowedBookIds;

    public Reader(int id, String name, int borrowLimit) {
        this.id = id;
        this.name = name;
        this.borrowLimit = borrowLimit;
        borrowedBookIds = new ArrayList<>();
    }

    public boolean canBorrow() {
        return borrowLimit > borrowedBookIds.size();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBorrowLimit() {
        return borrowLimit;
    }

    public void addBorrowedBookId(int bookId) {
        borrowedBookIds.add(bookId);
    }

    public void returnBorrowedBookId(Integer bookId) {
        borrowedBookIds.remove(bookId);
    }
}
