package oreder.type;

import oreder.type.OrderType;

public class Reservation implements OrderType {

    private String time;

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
    public void wrapOrder() {
        System.out.println("It is " + time + " o`clock. Here is your meal on table №5");
    }
}
