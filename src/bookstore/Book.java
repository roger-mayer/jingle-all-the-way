package bookstore;


//Create a Book class that inherits from product and adds an author property
public class Book extends Product {
    public Author author;

    public Book(String title, double price, Author author) {
        super(title, price);
        this.author=author;
    }

    public Author getAuthor() {
        return author;
    }

    public String bookInfo(){
        return this.title + " by " + this.author.getLastName() + ", " + this.author.getFirstName() + "\nPrice = $" + this.price;
    }

    public String authorInfo(){
//        for (Author author : author{
//            return this.author.title;
//        }



        return this.author.getFirstName() + " " + this.author.getLastName();
    }


}