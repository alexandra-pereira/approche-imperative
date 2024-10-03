package fr.algorithmie;

public class AffichageSuite {
    public static void main(String[] args) {

        // Utiliser une boucle for pour afficher tous les nombres de 1 à 10 inclus
        System.out.println("Tous les nombres de 1 à 10 :");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Utiliser une boucle for pour afficher tous les nombres pairs entre 0 et 10 inclus
        System.out.println("\nTous les nombres pairs entre 0 et 10 :");
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }

        // Utiliser une boucle for pour afficher tous les nombres impairs entre 0 et 9 inclus
        System.out.println("\nTous les nombres impairs entre 0 et 9 :");
        for (int i = 1; i <= 9; i += 2) {
            System.out.println(i);
        }

        // Utiliser une boucle while pour afficher tous les nombres de 1 à 10 inclus
        System.out.println("\nTous les nombres de 1 à 10 (while) :");
        int x = 1;
        while (x <= 10) {
            System.out.println(x);
            x++;
        }

        // Utiliser une boucle while pour afficher tous les nombres pairs entre 0 et 10 inclus
        System.out.println("\nTous les nombres pairs entre 0 et 10 (while) :");
        int y = 0;
        while (y <= 10) {
            System.out.println(y);
            y += 2;
        }

        // Utiliser une boucle while pour afficher tous les nombres impairs entre 0 et 9 inclus
        System.out.println("\nTous les nombres impairs entre 0 et 9 (while) :");
        int z = 1;
        while (z < 10) {
            System.out.println(z);
            z += 2;
        }
    }
}
