package meal;

import meal.Meal;

public class Poke extends Meal {
    public Poke(String name, double cost) {
        this.setName(name);
        this.setCost(cost);
    }

    public void prepare(){
        System.out.println("Your poke " + this.getName() + " was assembled from tuna and rice");
    }
}
