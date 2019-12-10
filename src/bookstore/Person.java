package bookstore;

public class Person {

    //make a Person superclass w/ name property
    private String firstName;
    private String lastName;

    // set name w/ constructor
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;

    }
    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String toString() {
        return "Name: " + getFirstName() + " " + getLastName();
    }
}
