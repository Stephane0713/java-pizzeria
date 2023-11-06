package OrderManager;

import Pizza.Pizza;

import java.util.HashMap;
import java.util.Map;

public class OrderManager {

    private static OrderManager instance;
    private final Map<String, Order> orders = new HashMap<>();

    private OrderManager() {
        // Constructeur privé pour empêcher l'instanciation externe
    }

    public static OrderManager getInstance() {
        if (instance == null) {
            instance = new OrderManager();
        }
        return instance;
    }

    public void addOrder(String id, Pizza pizza, int quantite, String deliveryAddress) {
        Order order = new Order(pizza, quantite, deliveryAddress);
        orders.put(id, order);
    }

    public Order getOrder(String id) {
        return orders.get(id);
    }

    public void deleteOrder(String id) {
        orders.remove(id);
    }
}