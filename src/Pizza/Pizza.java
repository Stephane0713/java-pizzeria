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
        // Attributs pour construire une Pizza
        Pizza pizza;

        // TODO: Créer des méthodes pour définir chaque attribut du Builder
        // Chaque méthode doit renvoyer l'instance du Builder pour permettre le chaînage des méthodes

        public Pizza build() {
            // TODO: Utiliser les attributs du Builder pour créer une nouvelle Pizza
            // Assurez-vous de valider les attributs avant de créer la Pizza
            return pizza;
        }
    }

}
