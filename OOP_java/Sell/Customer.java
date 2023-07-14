package OOP_java.Sell;

public class Customer {
    private int customerIDs;
    private String name;
    private String address;

    public Customer(int customerIDs, String name, String address) {
        this.customerIDs = customerIDs;
        this.name = name;
        this.address = address;
    }

    public int getCustomerIDs() {
        return customerIDs;
    }

    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
}
