package Pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaFactoryTest {

    @Test
    void testCreatePizzaFromage() {
        // TODO: Tester la méthode createPizza pour une PizzaFromage
        PizzaFactory factory = new PizzaFactory();
        Pizza pizza = factory.createPizza("FROMAGE");

        // On teste que pizza est bien une instance de PizzaFromage
        assertInstanceOf(PizzaFromage.class, pizza);

        // On vérifie que la garniture est correcte
        String[] garnitures = {"Mozzarella", "Olives"};
        assertArrayEquals(garnitures, pizza.getGarnitures());

        // On vérifie que la pate est correcte
        assertEquals(pizza.getPate(), "Fine");
    }

    @Test
    void testCreatePizzaVegetarienne() {
        // TODO: Tester la méthode createPizza pour une PizzaVegetarienne
        PizzaFactory factory = new PizzaFactory();
        Pizza pizza = factory.createPizza("VEGETARIENNE");

        // On teste que pizza est bien une instance de PizzaFromage
        assertInstanceOf(PizzaVegetarienne.class, pizza);

        // On vérifie que la garniture est correcte
        String[] garnitures = {"Mozzarella", "Olives", "Courgette", "Oignon", "Poivron"};
        assertArrayEquals(garnitures, pizza.getGarnitures());

        // On vérifie que la pate est correcte
        assertEquals(pizza.getPate(), "Epaisse");
    }

    @Test
    void testCreatePizzaUnknownType() {
        // TODO: Tester la méthode createPizza pour un type inconnu
        PizzaFactory factory = new PizzaFactory();
        String errorMessage = "Cette pizza ne figure pas dans notre liste de pizza disponible";

        // On execute le code de création de pizza avec un type inconnu
        Exception e = assertThrows(RuntimeException.class, () -> factory.createPizza("CANNIBAL"), errorMessage);

        // On vérifie qu'une erreur de type Runtime a bien été relevée avec le message d'erreur attendu
        assertTrue(e.getMessage().contains(errorMessage));
    }

}