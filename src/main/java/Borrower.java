import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> borrowed;

    public int countBooksBorrowed(){
        return this.borrowed.size();
    }
}
