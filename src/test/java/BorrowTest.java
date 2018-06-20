import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Library library;
    Borrower borrower;
    Book book1;

    @Before
    public void setup() {
        library = new Library();
        borrower = new Borrower();
        book1 = new Book("The Help");
    }

    @Test
    public void countBooksBorrowed(){
        assertEquals(0, borrower.countBooksBorrowed());
    }

}
