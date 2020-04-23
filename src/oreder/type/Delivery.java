package oreder.type;

import oreder.type.OrderType;

public class Delivery implements OrderType {

    private String address;

    public Delivery(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void wrapOrder() {
        System.out.println("Delivery guy is at your door in " + address);
    }
}
