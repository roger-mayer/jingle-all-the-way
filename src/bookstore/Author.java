package bookstore;

//Make an Author subclass that inherits from person,
public class Author extends Person {
    int counter;

    public Author(String firstName, String lastName, int counter) {
        super(firstName, lastName);
        this.counter = counter;
    }
    //add a counter for the number of books written

}
