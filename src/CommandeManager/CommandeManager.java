package CommandeManager;

import Pizza.Pizza;

import java.util.HashMap;
import java.util.Map;

public class CommandeManager {

    private static CommandeManager instance;
    private final Map<String, Commande> commandes = new HashMap<>();

    private CommandeManager() {
        // Constructeur privé pour empêcher l'instanciation externe
    }

    public static CommandeManager getInstance() {
        if (instance == null) {
            instance = new CommandeManager();
        }
        return instance;
    }

    public void ajouterCommande(String id, Pizza pizza, int quantite, String adresseLivraison) {
        Commande commande = new Commande(pizza, quantite, adresseLivraison);
        commandes.put(id, commande);
    }

    public Commande recupererCommande(String id) {
        return commandes.get(id);
    }

    public void supprimerCommande(String id) {
        commandes.remove(id);
    }
}