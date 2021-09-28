import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> book;

    public Borrower(String name){
        this.name = name;
        this.book = new ArrayList<>();
    }

    public int bookCapacity() {
        return this.book.size();
    }

    public void borrow(Book book) {
        this.book.add(book);
    }

    public void borrowBookFromLibrary(Library library) {
       if (bookCapacity() < 2 ) {
           Book removedBook = library.removeBook();
           this.borrow(removedBook);
       }
    }
}
