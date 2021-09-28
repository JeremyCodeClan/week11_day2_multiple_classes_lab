import java.util.ArrayList;

public class Library {

    private String name;
    private ArrayList<Book> book;
    private Integer capacity;

    public Library(String name){
        this.name = name;
        this.book = new ArrayList<>();
        this.capacity = 5;
    }

    public int getBooks(){
        return this.book.size();
    }


    public void addBook(Book book) {
        if (this.book.size() < this.capacity) {
            this.book.add(book);
        }
    }

    public Book removeBook() {
        return this.book.remove(0);
    }
}
