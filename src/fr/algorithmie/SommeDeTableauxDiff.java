package fr.algorithmie;

public class SommeDeTableauxDiff {
    public static void main(String[] args) {

        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18};

        int length;
        if (array1.length < array2.length) {
            length = array1.length;
        } else {
            length = array2.length;
        }

        // Tableau pour stocker les sommes
        int[] arraySum = new int[length];


        System.out.println("Somme des éléments correspondants des deux tableaux :");
        // Calculer la somme des éléments correspondants
        for (int i = 0; i < length; i++) {
            arraySum[i] = array1[i] + array2[i];
            System.out.println("Index " + i + ": " + array1[i] + " (array1) + " + array2[i] + " (array2) = " + arraySum[i]);
        }
    }
}
