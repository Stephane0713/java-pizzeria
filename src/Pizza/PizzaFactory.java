package Pizza;

public class PizzaFactory {
    /**
     * Créer une pizza en fonction du type qu'on lui passe.
     *
     * @param type
     * @return Pizza
     */
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("VEGETARIENNE")) {
            pizza = new PizzaVegetarienne();
        } else if (type.equals("FROMAGE")) {
            pizza = new PizzaFromage();
        } else {
            throw new RuntimeException("Cette pizza ne figure pas dans notre liste de pizza disponible");
        }
        return pizza;
    }
}
