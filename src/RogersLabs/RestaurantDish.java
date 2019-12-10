package RogersLabs;

public class RestaurantDish {

    private double costInDollars;
    private  String nameOfDish;
    private boolean wouldRecommend;


    public void eat(){
        System.out.println("Nom nom");
    }
    //constructor
    protected RestaurantDish(double costInDollars, String nameOfDish, boolean wouldRecommend){
        this.costInDollars = costInDollars;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;
    }
    public String toString() {
        return "Name: " + getNameOfDish() + "\nCost: $" + getCostInDollars() + "\nWould Recommend: " + getWouldRecommend();
    }

    public double getCostInDollars() {
        return costInDollars;
    }

    public void setCostInCents(double costInDollars) {
        this.costInDollars = costInDollars;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public boolean getWouldRecommend() {
        return wouldRecommend;
    }


}
