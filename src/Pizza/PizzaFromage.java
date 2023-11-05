package Pizza;

/**
 * Pizza dont les propriétés sont remplie avec les ingrédients d'une pizza fromage
 */
public class PizzaFromage extends Pizza {
    public PizzaFromage() {
        this.setPate("Fine");
        this.setSauce("Tomate");

        String[] garnitures = {"Mozzarella", "Olives"};
        this.setGarnitures(garnitures);
    }
}
