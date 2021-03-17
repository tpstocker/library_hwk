import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library();
        book = new Book();
    }

    @Test
    public void canAddBook(){
        library.addPaperback(book);
        assertEquals(1, library.paperbackCount());
    }

    @Test
    public void canGetBook(){
        library.addPaperback(book);
        library.removePaperback();
        assertEquals(0, library.paperbackCount());
    }

}