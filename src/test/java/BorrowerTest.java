import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;
    private Library library;

    @Before
    public void before(){
        borrower = new Borrower("The borrower");
        library = new Library("The library");
        book = new Book("The book", "The author", "The genre");
    }

    @Test
    public void borrowHasNoBooks(){
        assertEquals(0, borrower.bookCapacity());
    }

    @Test
    public void canBorrowBook(){
        borrower.borrow(book);
        assertEquals(1, borrower.bookCapacity());
    }

    @Test
    public void canBorrowBookFromLibrary() {
        library.addBook(book);
        borrower.borrowBookFromLibrary(library);
        assertEquals(0, library.getBooks());
        assertEquals(1, borrower.bookCapacity());
    }

    @Test
    public void cantBorrowBookFromLibrary() {
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        borrower.borrowBookFromLibrary(library);
        borrower.borrowBookFromLibrary(library);
        borrower.borrowBookFromLibrary(library);
        assertEquals(1, library.getBooks());
        assertEquals(2, borrower.bookCapacity());
    }
}
