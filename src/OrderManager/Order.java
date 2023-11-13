package OrderManager;

import Pizza.Pizza;

public class Order {

    private Pizza pizza;
    private int quantity;
    private String deliveryAddress;

    public Order(Pizza pizza, int quantity, String deliveryAddress) {
        this.pizza = pizza;
        this.quantity = quantity;
        this.deliveryAddress = deliveryAddress;
    }
    public Pizza getPizza() {
        return pizza;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }
}