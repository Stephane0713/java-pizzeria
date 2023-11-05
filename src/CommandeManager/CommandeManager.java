package CommandeManager;

public class CommandeManager {
    private static CommandeManager instance;

    private CommandeManager() {
        // Constructeur privé pour empêcher l'instanciation externe
    }

    public static CommandeManager getInstance() {
        // TODO: Implémenter le pattern Singleton pour assurer une seule instance de CommandeManager
        return instance;
    }

    // Méthodes pour ajouter, supprimer, récupérer des commandes, etc.
}
