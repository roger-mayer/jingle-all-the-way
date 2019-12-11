package bookstore;

//Make a Customer subclass that inherits from person
public class Customer extends Person {

    public Customer(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void buyBook(){
        System.out.println(this.getFirstName() + " bought a book");
    }
}
