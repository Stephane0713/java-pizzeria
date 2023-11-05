package Pizza;

/**
 * Pizza dont les propriétés sont remplie avec les ingrédients d'une pizza végétarienne
 */
public class PizzaVegetarienne extends Pizza {
    public PizzaVegetarienne() {
        this.setPate("Epaisse");
        this.setSauce("Tomate");

        String[] garnitures = {"Mozzarella", "Olives", "Courgette", "Oignon", "Poivron"};
        this.setGarnitures(garnitures);
    }
}
