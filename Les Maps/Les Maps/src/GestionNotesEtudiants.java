import java.util.HashMap;
import java.util.Map;

public class GestionNotesEtudiants {
    public static void main(String[] args) {
        // Création d'une HashMap pour stocker les notes des étudiants
        Map<String, Double> notesEtudiants = new HashMap<>();

        // Insérer des notes des étudiants
        notesEtudiants.put("Alice", 15.5);
        notesEtudiants.put("Bob", 17.0);
        notesEtudiants.put("Charlie", 12.8);

        // Afficher la liste initiale
        afficherListeNotes(notesEtudiants);

        // Augmenter la note d'un étudiant
        notesEtudiants.put("Bob", notesEtudiants.get("Bob") + 1.5);
        System.out.println("Après l'augmentation de la note de Bob :");
        afficherListeNotes(notesEtudiants);

        // Supprimer la note d'un étudiant
        notesEtudiants.remove("Charlie");
        System.out.println("Après la suppression de la note de Charlie :");
        afficherListeNotes(notesEtudiants);

        // Afficher la taille du map
        System.out.println("Taille du map : " + notesEtudiants.size());

        // Afficher la note moyenne, max et min
        double sommeNotes = 0;
        double noteMax = Double.MIN_VALUE;
        double noteMin = Double.MAX_VALUE;
        for (double note : notesEtudiants.values()) {
            sommeNotes += note;
            if (note > noteMax) {
                noteMax = note;
            }
            if (note < noteMin) {
                noteMin = note;
            }
        }
        double moyenne = sommeNotes / notesEtudiants.size();
        System.out.println("Note moyenne : " + moyenne);
        System.out.println("Note maximale : " + noteMax);
        System.out.println("Note minimale : " + noteMin);

        // Vérifier s'il y a une note égale à 20
        System.out.println("Est-ce qu'il y a une note égale à 20 ? " + notesEtudiants.containsValue(20.0));
    }

    // Méthode utilitaire pour afficher la liste des notes des étudiants
    private static void afficherListeNotes(Map<String, Double> notesEtudiants) {
        notesEtudiants.forEach((nom, note) -> System.out.println(nom + " : " + note));
    }
}
