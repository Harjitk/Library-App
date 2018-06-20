import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private int capacity;


    public Library(int capacity) {
        this.books = new ArrayList<Book>();
        this.capacity = 4;
    }

    public int countBooks() {
        return this.books.size();
    }

    public void addBookToLibrary(Book book) {
        int count = countBooks();
        if (count < this.capacity) {
            this.books.add(book);
        }
    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }
}
