package OOP_java.Sell;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args){
        Product product = new Product("BOOK",100.00);
        Product product1 = new Product("MAD",10.00);
        product.getNameItems();
        product.getPrice();
        System.out.println("Thong tin san pham: "+product.getNameItems()+ " Gia" +product.getPrice());
        Order order = new Order();
        List<Product> productList = order.getItems();
        order.addItems(product);
        order.addItems(product1);
        System.out.println(order.getTotalItemPrices());
        for (Product items : productList){
            System.out.println("Ten san pham hien co "+items.getNameItems()+"Gia san pham hien co "+ items.getPrice());
        }

        Customer customer = new Customer(1,"Bao","TPhcm");
        System.out.println(customer.getName()+customer.getAddress()+customer.getCustomerIDs());
    }
}
