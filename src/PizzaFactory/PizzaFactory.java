package PizzaFactory;

import Pizza.Pizza;

public class PizzaFactory {
    public Pizza createPizza(String type) {
        return new Pizza();
    }
}
