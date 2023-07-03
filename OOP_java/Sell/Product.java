package OOP_java.Sell;

public class Product {
    private String nameItems;
    private double price;

    public Product(String nameItem, double price) {
        this.nameItems = nameItem;
        this.price = price;
    }
    public String getNameItems(){
        return nameItems;
    }

    public double getPrice() {
        return price;
    }

}
