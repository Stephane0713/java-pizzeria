package Pizza;

public class Pizza {
    // Attributs (pâte, sauce, garnitures, etc.)

    // TODO: Créer des setters pour tous les attributs afin de pouvoir les modifier via le builder

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

// Exemple d'utilisation du builder (à compléter par les étudiants)
// Pizza myPizza = new Pizza.PizzaBuilder().setPate(...).setSauce(...).build();
