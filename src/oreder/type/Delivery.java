package oreder.type;

public class Delivery implements OrderType {

    private String address;
    private double additionalCosts;


    public Delivery(String address) {
        this.address = address;
        this.additionalCosts = 1.0;
    }

    @Override
    public void wrapOrder(double price) {
        System.out.println("Delivery guy is at your door in " + address);
        System.out.println(price + " dollars. And also $" + additionalCosts + " will be charged for delivery");
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
