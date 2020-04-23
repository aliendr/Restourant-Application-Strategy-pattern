package oreder.type;

import oreder.type.OrderType;

public class Reservation implements OrderType {

    private String time;
    private double additionalCosts = 2.0;

    public Reservation(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public void wrapOrder(double price) {
        System.out.println("It is " + time + " o`clock. Here is your meal on table №5");
        System.out.println(price + " dollars. And also you need to add $" + additionalCosts + " to waitress");
    }
}
