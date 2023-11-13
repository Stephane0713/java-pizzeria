package OrderManager;

import Pizza.Pizza;
import Pizza.PizzaFactory;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static org.junit.jupiter.api.Assertions.*;

class OrderManagerTest {

    @Test
    void testSingleInstance() {
        // TODO: Tester si CommandeManager crée une seule instance
        OrderManager instance1 = OrderManager.getInstance();
        OrderManager instance2 = OrderManager.getInstance();
        // On vérifie que les deux références pointent vers la même instance
        assertSame(instance1, instance2);
    }

    @Test
    void testMultithreading()  throws Exception {
        // TODO: Tester l'instanciation de CommandeManager dans un contexte multithread
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<OrderManager> futureOrder1 = executor.submit(OrderManager::getInstance);
        Future<OrderManager> futureOrder2 = executor.submit(OrderManager::getInstance);
        OrderManager instance1 = futureOrder1.get();
        OrderManager instance2 = futureOrder2.get();
        // On vérifie que les deux références pointent vers la même instance, même dans un contexte multithread
        assertSame(instance1, instance2);
        executor.shutdown();
    }


    @Test
    void testOrderManager() {
        // TODO: Tester l'ajout, la suppression, et la récupération de commandes dans CommandeManager
        OrderManager manager = OrderManager.getInstance();
        PizzaFactory pizzaFactory = new PizzaFactory();

        // Créer des pizzas à l'aide de PizzaFactory
        Pizza pizzaFromage = pizzaFactory.createPizza("FROMAGE");
        Pizza pizzaVegetarienne = pizzaFactory.createPizza("VEGETARIENNE");

        // Ajouter des commandes
        manager.addOrder("1", pizzaFromage, 2, "123 Rue de Jacky");
        manager.addOrder("2", pizzaVegetarienne, 3, "321 Rue de Joël");

        // Récupérer et vérifier les commandes
        Order order1 = manager.getOrder("1");
        Order order2 = manager.getOrder("2");

        assertNotNull(order1);
        assertNotNull(order2);

        assertEquals(2, order1.getQuantity());
        assertEquals(3, order2.getQuantity());

        assertEquals("123 Rue de Jacky", order1.getDeliveryAddress());
        assertEquals("321 Rue de Joël", order2.getDeliveryAddress());

        // Supprimer une commande et vérifier
        manager.deleteOrder("1");
        assertNull(manager.getOrder("1"));
    }
}