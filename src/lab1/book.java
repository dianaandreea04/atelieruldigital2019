package lab1;

public class book {
    private String name;
    public int price;
    public book(int price) {this.price = price;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void  rentalcost(int numDays){price=numDays*10;}


}
