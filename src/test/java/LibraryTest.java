import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book1;
    Book book2;
    Book book3;
    Book book4;

    @Before
    public void before (){
        library = new Library(4);
        book1 = new Book("The Help");
        book2 = new Book("The Hunger Games");
        book3 = new Book("The Secret");
        book4 = new Book("Life of Pi");
    }

    @Test
    public void canCountBooksInLibrary(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void addBookToLibrary(){
        library.addBookToLibrary(book1);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void dontAddBookWhenFull(){
        library.addBookToLibrary(book1);
        library.addBookToLibrary(book2);
        library.addBookToLibrary(book3);
        library.addBookToLibrary(book4);
        assertEquals(4, library.countBooks());
    }

}




