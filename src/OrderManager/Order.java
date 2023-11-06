package OrderManager;

import Pizza.Pizza;

public class Order {

    private Pizza pizza;
    private int quantite;
    private String deliveryAddress;

    public Order(Pizza pizza, int quantite, String deliveryAddress) {
        this.pizza = pizza;
        this.quantite = quantite;
        this.deliveryAddress = deliveryAddress;
    }
    public Pizza getPizza() {
        return pizza;
    }

    public int getQuantite() {
        return quantite;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }
}