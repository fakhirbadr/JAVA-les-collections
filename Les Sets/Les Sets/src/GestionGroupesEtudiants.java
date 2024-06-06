import java.util.HashSet;
import java.util.Set;

public class GestionGroupesEtudiants {
    public static void main(String[] args) {
        // Création de deux HashSet pour les groupes A et B
        Set<String> groupeA = new HashSet<>();
        Set<String> groupeB = new HashSet<>();

        // Ajout de noms d'étudiants à chaque HashSet
        groupeA.add("Alice");
        groupeA.add("Bob");
        groupeA.add("Charlie");

        groupeB.add("Charlie");
        groupeB.add("David");
        groupeB.add("Eve");

        // Affichage des noms dans le groupe A
        System.out.println("Noms dans le groupe A : " + groupeA);

        // Affichage des noms dans le groupe B
        System.out.println("Noms dans le groupe B : " + groupeB);

        // Affichage de l'intersection des deux groupes
        Set<String> intersection = new HashSet<>(groupeA); // Copie de groupeA
        intersection.retainAll(groupeB); // Intersection des deux ensembles
        System.out.println("Intersection des groupes A et B : " + intersection);

        // Affichage de l'union des deux groupes
        Set<String> union = new HashSet<>(groupeA); // Copie de groupeA
        union.addAll(groupeB); // Union des deux ensembles
        System.out.println("Union des groupes A et B : " + union);
    }
}
