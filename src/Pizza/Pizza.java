package Pizza;

public class Pizza {
    // TODO: Créer des setters pour tous les attributs afin de pouvoir les modifier via le builder
    private String pate, sauce;
    private String[] garnitures;

    public String getPate() {
        return pate;
    }

    public void setPate(String pate) {
        this.pate = pate;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String[] getGarnitures() {
        return garnitures;
    }

    public void setGarnitures(String[] garnitures) {
        this.garnitures = garnitures;
    }

    static class PizzaBuilder {
        Pizza pizza;

        public PizzaBuilder() {
            this.pizza = new Pizza();
        }

        public PizzaBuilder setPate(String pate) {
            pizza.pate = pate;
            return this;
        }

        public PizzaBuilder setSauce(String sauce) {
            pizza.sauce = sauce;
            return this;
        }

        public PizzaBuilder setGarnitures(String[] garnitures) {
            pizza.garnitures = garnitures;
            return this;
        }

        public Pizza build() {
            // Assurez-vous de valider les attributs avant de créer la Pizza
            if (
                    this.pizza.sauce == null
                            || this.pizza.pate == null
                            || this.pizza.garnitures.length == 0
            ) {
                throw new RuntimeException("Les informations pour construire la pizza sont incomplètes.");
            }

            return pizza;
        }
    }

}
