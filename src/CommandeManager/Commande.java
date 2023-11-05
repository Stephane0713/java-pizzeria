package CommandeManager;

import Pizza.Pizza;

public class Commande {

    private Pizza pizza;
    private int quantite;
    private String adresseLivraison;

    public Commande(Pizza pizza, int quantite, String adresseLivraison) {
        this.pizza = pizza;
        this.quantite = quantite;
        this.adresseLivraison = adresseLivraison;
    }
    public Pizza getPizza() {
        return pizza;
    }

    public int getQuantite() {
        return quantite;
    }

    public String getAdresseLivraison() {
        return adresseLivraison;
    }
}