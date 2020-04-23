package wrapper;

import meal.Meal;
import oreder.type.OrderType;

import java.util.ArrayList;

public class OrderWrapper {
    private OrderType orderType;
    private ArrayList<Meal> mealList;
    private double totalPrice = 0;

    public OrderWrapper(OrderType orderType, ArrayList<Meal> mealList){
        this.mealList = mealList;
        this.orderType = orderType;
    }

    public void executeOrder(){
        for (Meal m: mealList) {
            m.prepare();
            totalPrice += m.getCost();
        }
        orderType.wrapOrder();

        System.out.println(totalPrice + " dollars, please. Cash or by card?");
    }


    public ArrayList<Meal> getMealList() {
        return mealList;
    }

    public void setMealList(ArrayList<Meal> mealList) {
        this.mealList = mealList;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
