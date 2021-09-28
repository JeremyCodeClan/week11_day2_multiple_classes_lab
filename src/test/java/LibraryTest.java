import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library("The library");
        book = new Book("The book", "The author", "The genre");
    }

    @Test
    public void hasNoBooksInLibrary() {
        assertEquals(0, library.getBooks());
    }

    @Test
    public void canAddBookToLibrary() {
        library.addBook(book);
        assertEquals(1, library.getBooks());
    }

    @Test
    public void cantAddBookToLibrary(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(5, library.getBooks());
    }
}
