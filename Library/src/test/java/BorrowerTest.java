import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;
    private Library library;

    @Before
    public void before(){
        borrower = new Borrower("Tom");
        book = new Book();
        library = new Library();
        library.addPaperback(book);
    }

    @Test
    public void collectionStartsEmpty(){
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void canBorrowBook(){
        borrower.ckeckOutBookFromLibrary(library);
        assertEquals(0, library.paperbackCount());
    }

    @Test
    public void canReturnBook(){
        borrower.ckeckOutBookFromLibrary(library);
        borrower.checkIn();
        assertEquals(0,borrower.bookCount());
    }


}
