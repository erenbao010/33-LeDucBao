package OOP_java.Sell;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> items;
    private double totalItemPrices;

    public Order() {
        this.items = new ArrayList<>();
        this.totalItemPrices = 0.0d;
    }

    public void addItems(Product product) {
        items.add(product);
        totalItemPrices += product.getPrice();
    }

    public void removeItems(Product itemsOrder) {
        items.remove(itemsOrder);
        totalItemPrices -= itemsOrder.getPrice();
    }

    public List<Product> getItems() {
        return items;
    }

    public double getTotalItemPrices() {
        return totalItemPrices;
    }
}
