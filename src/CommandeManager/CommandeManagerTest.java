package CommandeManager;

import Pizza.Pizza;
import Pizza.PizzaFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommandeManagerTest {

    @Test
    void testSingleInstance() {
        // TODO: Tester si CommandeManager crée une seule instance
        CommandeManager instance1 = CommandeManager.getInstance();
        CommandeManager instance2 = CommandeManager.getInstance();
        // On vérifie que les deux références pointent vers la même instance
        assertSame(instance1, instance2);
    }

    @Test
    void testMultithreading() {
        // TODO: Tester l'instanciation de CommandeManager dans un contexte multithread
    }

    @Test
    void testCommandeManagement() {
        // TODO: Tester l'ajout, la suppression, et la récupération de commandes dans CommandeManager
        CommandeManager manager = CommandeManager.getInstance();
        PizzaFactory pizzaFactory = new PizzaFactory();

        // Créer des pizzas à l'aide de PizzaFactory
        Pizza pizzaFromage = pizzaFactory.createPizza("FROMAGE");
        Pizza pizzaVegetarienne = pizzaFactory.createPizza("VEGETARIENNE");

        // Ajouter des commandes
        manager.ajouterCommande("1", pizzaFromage, 2, "123 Rue de Jacky");
        manager.ajouterCommande("2", pizzaVegetarienne, 3, "321 Rue de Joël");

        // Récupérer et vérifier les commandes
        Commande commande1 = manager.recupererCommande("1");
        Commande commande2 = manager.recupererCommande("2");

        assertNotNull(commande1);
        assertNotNull(commande2);

        assertEquals(2, commande1.getQuantite());
        assertEquals(3, commande2.getQuantite());

        assertEquals("123 Rue de Jacky", commande1.getAdresseLivraison());
        assertEquals("321 Rue de Joël", commande2.getAdresseLivraison());

        // Supprimer une commande et vérifier
        manager.supprimerCommande("1");
        assertNull(manager.recupererCommande("1"));
    }
}