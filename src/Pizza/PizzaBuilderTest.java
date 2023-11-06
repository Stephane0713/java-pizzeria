package Pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaBuilderTest {
    @Test
    void testBuildPizza() {
        String pate = "fine";
        String sauce = "tomate";
        String[] garnitures = {"fromage"};

        Pizza.PizzaBuilder builder = new Pizza.PizzaBuilder();
        builder.setPate(pate);
        builder.setSauce(sauce);
        builder.setGarnitures(garnitures);
        Pizza pizza = builder.build();

        // On teste si les informations de la pizza sont bien celles que l'on attend
        assertEquals(pizza.getPate(), pate);
        assertEquals(pizza.getSauce(), sauce);
        assertArrayEquals(pizza.getGarnitures(), garnitures);
    }

    @Test
    void testBuildPizzaFluentInterface() {
        String pate = "fine";
        String sauce = "tomate";
        String[] garnitures = {"fromage"};

        Pizza pizza = new Pizza.PizzaBuilder().setPate(pate).setSauce(sauce).setGarnitures(garnitures).build();

        // On teste si les informations de la pizza sont bien celles que l'on attend
        assertEquals(pizza.getPate(), pate);
        assertEquals(pizza.getSauce(), sauce);
        assertArrayEquals(pizza.getGarnitures(), garnitures);
    }

    @Test
    void testBuildPizzaEdgeCases() {
        Pizza.PizzaBuilder builder = new Pizza.PizzaBuilder();
        String sauce = "tomate";
        String[] garnitures = {"fromage"};
        String errorMessage = "Les informations pour construire la pizza sont incomplètes.";

        // On essaie de créer une pizza sans pate
        Exception e = assertThrows(RuntimeException.class, () -> builder.setSauce(sauce).setGarnitures(garnitures).build(), errorMessage);

        // On vérifie qu'une erreur de type Runtime a bien été relevée avec le message d'erreur attendu
        assertTrue(e.getMessage().contains(errorMessage));
    }
}