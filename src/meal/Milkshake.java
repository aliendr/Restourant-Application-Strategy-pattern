package meal;

import meal.Meal;

public class Milkshake extends Meal {
    public Milkshake(String name, double cost) {
        this.setName(name);
        this.setCost(cost);
    }

    public void prepare(){
        System.out.println("Your " + this.getName() + " milkshake is done from pure love and pieces of strawberries");
    }
}
