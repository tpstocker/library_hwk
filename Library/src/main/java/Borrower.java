import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> collection;

    public Borrower(String name) {
        this.collection = new ArrayList<Book>();
        this.name = name;
    }

    public int bookCount(){
        return collection.size();
    }

    public void ckeckOutBookFromLibrary(Library library);{
        Book book = library.removePaperback();
        collection.add(book);
    }

    public void checkIn(){
        collection.clear();
    }
}
