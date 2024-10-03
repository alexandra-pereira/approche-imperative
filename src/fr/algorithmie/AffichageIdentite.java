package fr.algorithmie;

public class AffichageIdentite {
    public static void main(String[] args) {

        String name = "Alexandra";
        String surname = "Pereira";

        //Utiliser une boucle for pour afficher 10 fois votre identité
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ": " + name + " " + surname);
        }
    }
}