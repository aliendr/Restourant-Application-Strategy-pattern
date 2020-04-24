package customer;

import meal.Meal;
import oreder.type.OrderType;
import wrapper.OrderWrapper;

import java.util.ArrayList;

public class Customer {
    private OrderType orderType;
    private ArrayList<Meal> meals;

    public Customer(OrderType orderType, ArrayList<Meal> meals) {
        this.orderType = orderType;
        this.meals = meals;
    }

    public void makeOrder() {
        OrderWrapper orderWrapper = new OrderWrapper(this.orderType, this.meals);
        orderWrapper.executeOrder();
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public void setMeals(ArrayList<Meal> meals) {
        this.meals = meals;
    }

    public ArrayList<Meal> getMeals() {
        return meals;
    }
}
