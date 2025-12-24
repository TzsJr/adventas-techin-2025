package lt.ng.model.library;

import java.time.LocalDate;

import static lt.ng.model.library.LoanStatus.ACTIVE;
import static lt.ng.model.library.LoanStatus.RETURNED;

public class Loan {
    private final int id;
    private final int bookId;
    private final int readerId;
    private final LocalDate loanDate;
    private LocalDate returnDate;
    private LoanStatus status;

    public Loan(int id, int bookId, int readerId, LocalDate loanDate) {
        this.id = id;
        this.bookId = bookId;
        this.readerId = readerId;
        this.loanDate = loanDate;
        status = ACTIVE;
    }

    public int getId() {
        return id;
    }

    public int getBookId() {
        return bookId;
    }

    public int getReaderId() {
        return readerId;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public LoanStatus getStatus() {
        return status;
    }

    public void setReturnedStatus() {
        status = RETURNED;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }
}
