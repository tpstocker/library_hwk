import java.util.ArrayList;

public class Library {

    private ArrayList<Book> paperback;

    public Library(){
        this.paperback = new ArrayList<>();
    }

    public void addPaperback(Book book){
        this.paperback.add(book);
    }

    public int paperbackCount(){
        return this.paperback.size();
    }

    public Book removePaperback(){
        return this.paperback.remove(0);
    }

}
