package sakankom;


import java.util.ArrayList;
import java.util.List;

public class Tenant extends User{
//Tenant T =new Tenant();
    static List<Booking> books=new ArrayList<Booking>();
    static List<Booking> booksDonne=new ArrayList<Booking>();
    static List<Booking> booksStill=new ArrayList<Booking>();

    public Tenant(String id, String name, String username, String password) {
       // super( type, id, name, username, password);
        super( id, name, username, password);

    }

    public Tenant() {

    }


    public List<Booking> getBooks() {
        return books;
    }

    public void addToTenantBookins(Booking b)
    {
        books.add(b);
    }

    public void removeBooking(int i)
    {
        books.remove(i);
    }

    public void addTobooksDonne(Booking b)
    {
        booksDonne.add(b);
    }

    

}