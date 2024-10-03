package fr.boucles;

public class ExerciceBouclesEtTests {
    public static void main(String[] args) {

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        int length = array.length;

        System.out.println("Tous les éléments du tableau :");
        for (int i = 0; i < length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("\nÉléments du tableau dans l'ordre inverse :");
        for (int i = length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

        System.out.println("\nÉléments supérieurs à 3 :");
        for (int i = 0; i < length; i++) {
            if (array[i] > 3) {
                System.out.println(array[i]);
            }
        }

        System.out.println("\nÉléments pairs :");
        for (int i = 0; i < length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }

        System.out.println("\nValeurs des index pairs :");
        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                System.out.println("Index " + i + ": " + array[i]);
            }
        }

        System.out.println("\nÉléments impairs :");
        for (int i = 0; i < length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }
    }
}
