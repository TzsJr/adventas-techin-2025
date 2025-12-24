package lt.ng.model.library;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static lt.ng.model.library.LoanStatus.ACTIVE;
import static lt.ng.util.constant.ChristmasConstants.BORROW_FAIL;
import static lt.ng.util.constant.ChristmasConstants.BORROW_OK;
import static lt.ng.util.constant.ChristmasConstants.RETURN_FAIL;
import static lt.ng.util.constant.ChristmasConstants.RETURN_OK;

public class Library {
    private final List<Book> books;
    private final List<Reader> readers;
    private final List<Loan> loans;

    public Library() {
        books = new ArrayList<>();
        readers = new ArrayList<>();
        loans = new ArrayList<>();
    }

    public void addBook(Book book) {
        if (book.getTotalCopies() <= 0) {
            System.out.printf("Cannot add book with %d total copies!\n", book.getTotalCopies());
            return;
        }
        Book optBook = getBookById(book.getId());
        if (optBook != null) {
            System.out.printf("Book with id=%d already exists, cannot add new!\n", book.getId());
            return;
        }

        books.add(book);
        System.out.printf("Book '%s' added to system!\n", book.getTitle());
    }

    public void registerReader(Reader reader) {
        if (reader.getBorrowLimit() < 0) {
            System.out.printf("Cannot create reader with %d borrow limit!\n", reader.getBorrowLimit());
            return;
        }
        Reader optReader = getReaderById(reader.getId());
        if (optReader != null) {
            System.out.printf("Reader with id=%d already exists, cannot add new!\n", reader.getId());
            return;
        }

        readers.add(reader);
        System.out.printf("Reader %s added to system!\n", reader.getName());
    }

    public Loan borrowBook(int readerId, int bookId, LocalDate date) {
        Reader reader = getReaderById(readerId);
        if (reader == null) {
            System.out.printf("%s Reader with id=%d not found!\n", BORROW_FAIL, readerId);
            return getFailedLoan();
        }
        Book book = getBookById(bookId);
        if (book == null) {
            System.out.printf("%s Book with id=%d not found!\n", BORROW_FAIL, bookId);
            return getFailedLoan();
        }
        if (!reader.canBorrow()) {
            System.out.printf(
                    "%s %s cannot borrow '%s' (reader reached borrow limit)!\n",
                    BORROW_FAIL,
                    reader.getName(),
                    book.getTitle());
            return getFailedLoan();
        }
        if (!book.isAvailable()) {
            System.out.printf(
                    "%s %s cannot borrow '%s' (no copies available)!\n",
                    BORROW_FAIL,
                    reader.getName(),
                    book.getTitle());
            return getFailedLoan();
        }

        Loan loan = new Loan(loans.size() + 1, bookId, readerId, date);
        loans.add(loan);
        readers.get(readers.indexOf(reader)).addBorrowedBookId(bookId);
        books.get(books.indexOf(book)).borrowBook();
        System.out.printf("%s %s borrowed '%s'\n", BORROW_OK, reader.getName(), book.getTitle());

        return loan;
    }

    public void returnBook(int loanId, LocalDate date) {
        Loan loan = getLoanById(loanId);
        if (loan == null) {
            System.out.printf("%s Loan with id=%d not found!\n", RETURN_FAIL, loanId);
            return;
        }
        if (loan.getLoanDate().isAfter(date)) {
            System.out.printf("%s Loan return date cannot be before loan date!\n", RETURN_FAIL);
            return;
        }

        Reader reader = getReaderById(loan.getReaderId());
        Book book = getBookById(loan.getBookId());
        loans.get(loans.indexOf(loan)).setReturnedStatus();
        loans.get(loans.indexOf(loan)).setReturnDate(date);
        readers.get(readers.indexOf(reader)).returnBorrowedBookId(loan.getBookId());
        books.get(books.indexOf(book)).returnBook();

        System.out.printf("%s '%s' returned by %s\n", RETURN_OK, book.getTitle(), reader.getName());
    }

    public void getActiveLoans() {
        System.out.println("ACTIVE LOANS");
        int count = 0;
        for (Loan loan : loans) {
            if (loan.getStatus() == ACTIVE) {
                Reader reader = getReaderById(loan.getReaderId());
                Book book = getBookById(loan.getBookId());
                System.out.printf("%s borrowed '%s' on %s\n", reader.getName(), book.getTitle(), loan.getLoanDate());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No active loans at this moment!");
        }
    }

    public void printChristmasReport() {
        System.out.println("CHRISTMAS LIBRARY REPORT");
        if (books.isEmpty()) {
            System.out.println("No books in library!");
        } else {
            for (Book book : books) {
                System.out.printf(
                        "%s: %d / %d available\n",
                        book.getTitle(),
                        book.getAvailableCopies(),
                        book.getTotalCopies());
            }
        }
    }

    private Reader getReaderById(int readerId) {
        for (Reader reader : readers) {
            if (readerId == reader.getId()) {
                return reader;
            }
        }
        return null;
    }

    private Book getBookById(int bookId) {
        for (Book book : books) {
            if (bookId == book.getId()) {
                return book;
            }
        }
        return null;
    }

    private Loan getLoanById(int loanId) {
        for (Loan loan : loans) {
            if (loanId == loan.getId()) {
                return loan;
            }
        }
        return null;
    }

    private Loan getFailedLoan() {
        return new Loan(-1, -1, -1, LocalDate.now());
    }
}
