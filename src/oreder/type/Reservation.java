package oreder.type;

public class Reservation implements OrderType {

    private String time;
    private double additionalCosts;

    public Reservation(String time) {
        this.time = time;
        this.additionalCosts = 2.0;
    }

    @Override
    public void wrapOrder(double price) {
        System.out.println("It is " + time + " o`clock. Here is your meal on table №5");
        System.out.println(price + " dollars. And also you need to add $" + additionalCosts + " to waitress");
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getAdditionalCosts() {
        return additionalCosts;
    }
}
