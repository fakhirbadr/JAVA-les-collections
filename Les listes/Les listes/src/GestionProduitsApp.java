import java.util.ArrayList;
import java.util.Scanner;

public class GestionProduitsApp {
    public static void main(String[] args) {
        // Création de la liste de produits
        ArrayList<Produit> produits = new ArrayList<>();

        // Ajout de quelques produits
        produits.add(new Produit(1, "Produit 1", 10.99));
        produits.add(new Produit(2, "Produit 2", 20.49));
        produits.add(new Produit(3, "Produit 3", 15.75));

        // Affichage de la liste des produits
        System.out.println("Liste des produits :");
        afficherListeProduits(produits);

        // Suppression d'un produit par indice
        produits.remove(1); // Suppression du deuxième produit
        System.out.println("Liste des produits après suppression :");
        afficherListeProduits(produits);

        // Modification d'un produit par indice
        Produit produitAModifier = produits.get(0); // On prend le premier produit
        produitAModifier.setNom("Nouveau nom");
        produitAModifier.setPrix(30.0);
        System.out.println("Liste des produits après modification :");
        afficherListeProduits(produits);

        // Recherche d'un produit par nom
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nom du produit à rechercher : ");
        String nomProduitRecherche = scanner.nextLine();
        boolean produitTrouve = false;
        for (Produit produit : produits) {
            if (produit.getNom().equalsIgnoreCase(nomProduitRecherche)) {
                System.out.println("Produit trouvé : " + produit);
                produitTrouve = true;
                break;
            }
        }
        if (!produitTrouve) {
            System.out.println("Aucun produit trouvé avec ce nom.");
        }
    }

    // Méthode utilitaire pour afficher la liste des produits
    private static void afficherListeProduits(ArrayList<Produit> produits) {
        for (Produit produit : produits) {
            System.out.println(produit);
        }
    }
}