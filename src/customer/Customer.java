package customer;

import meal.Meal;
import meal.Milkshake;
import meal.Poke;
import oreder.type.Delivery;
import oreder.type.OrderType;
import wrapper.OrderWrapper;

import java.util.ArrayList;

public class Customer {


    public static void main(String[] args) {
        OrderType orderType = new Delivery("White house");

        ArrayList<Meal> mealList = new ArrayList<>();

        mealList.add(new Poke("Hawaiian", 3.0));
        mealList.add(new Milkshake("The biggest", 2.5));

        OrderWrapper orderWrapper = new OrderWrapper(orderType, mealList);

        orderWrapper.executeOrder();


    }


}
