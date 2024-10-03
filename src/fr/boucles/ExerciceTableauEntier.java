package fr.boucles;

public class ExerciceTableauEntier {
    public static void main(String[] args) {

        // Création d'un tableau avec une taille de 10
        int[] entiers = new int[10];

        // Ajout des nombres de 1 à 10 dans le tableau
        for (int i = 0; i < entiers.length; i++) {
            entiers[i] = i + 1;
        }

        System.out.println("Premier élément du tableau: " + entiers[0] + "\n");

        System.out.println("Longueur du tableau: " + entiers.length + "\n");

        System.out.println("Dernier élément du tableau: " + entiers[entiers.length - 1] + "\n");

        entiers[4] = 8;
        System.out.println("Nouvelle valeur à l’index 4: " + entiers[4]);
    }
}
