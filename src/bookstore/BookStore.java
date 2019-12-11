package bookstore;
import java.util.ArrayList;
import java.util.List;
public class BookStore {
    public static void main(String[] args) {
        Author henderson = new Author("Smith", "Henderson", 1);
        Author yoshikawa = new Author("Eiji", "Yoshikawa", 1);
        Author moshfegh = new Author("Otessa", "Moshfegh",3);
        Author ng = new Author("Celeste", "Ng",2);


        Book fourth = new Book("Fourth of July Creek", 18.00, henderson);
        Book musashi = new Book("Musashi", 30.00,  yoshikawa);

        Book eileen = new Book("Eileen", 25.00,  moshfegh);
        Book yearsOfRest = new Book("My Year of Rest and Relaxation", 25.00,  moshfegh);
        Book homesick = new Book("Homesick for Another World", 25.00,  moshfegh);

        Book everything = new Book("Everything I Never Told You", 25.00,  ng);
        Book littleFires = new Book("Little Fires Everywhere", 20.00,  ng);

        List<Customer> customers = new ArrayList<>();
        Customer roger = new Customer("Roger", "Mayer");
        Customer katie = new Customer("Katie", "Mayer");
        Customer riley = new Customer("Riley", "West");
        Customer asher = new Customer("Asher", "Evan");
        Customer bryan = new Customer("Bryan", "Walsh");
        Customer barrack = new Customer("Barrack", "Obama");


        customers.add(roger);
        customers.add(katie);
        customers.add(riley);
        customers.add(asher);
        customers.add(bryan);
        customers.add(barrack);


        for (Customer customer : customers){
            customer.buyBook();
        }
        //print out book details
        System.out.println(fourth.bookInfo());
        System.out.println(musashi.bookInfo());
        System.out.println(eileen.bookInfo());
        System.out.println(yearsOfRest.bookInfo());
        System.out.println(homesick.bookInfo());
        System.out.println(everything.bookInfo());
        System.out.println(littleFires.bookInfo());






        System.out.println(fourth.authorInfo());







    }
}
