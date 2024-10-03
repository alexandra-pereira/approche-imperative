package fr.algorithmie;

public class AffichageInverse {
    public static void main(String[] args) {

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        int length = array.length;

        //Afficher l’ensemble des éléments du tableau grâce à une boucle
        System.out.println("Éléments du tableau :");
        for (int i = 0; i < length; i++) {
            System.out.println(array[i]);
        }

        // Afficher l’ensemble des éléments dans l’ordre inverse du tableau
        System.out.println("\nÉléments du tableau dans l'ordre inverse :");
        for (int i = length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

        // Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy
        int[] arrayCopy = new int[length];

        System.out.println("\nÉléments du tableau copié :");
        for (int i = 0; i < length; i++) {
            arrayCopy[i] = array[i];
            System.out.println(arrayCopy[i]);
        }
    }
}
