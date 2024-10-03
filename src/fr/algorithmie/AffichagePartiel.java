package fr.algorithmie;

public class AffichagePartiel {
    public static void main(String[] args) {

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        int length = array.length;

        // Combiner une boucle et un test de manière à n’afficher que les entiers supérieurs à 3
        System.out.println("Éléments supérieurs à 3 :");
        for (int i = 0; i < length; i++) {
            if (array[i] > 3) {
                System.out.println(array[i]);
            }
        }

        // Combiner une boucle et un test de manière à n’afficher que les entiers pairs
        System.out.println("\nÉléments pairs :");
        for (int i = 0; i < length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }

        // Combiner une boucle et un test de manière à n’afficher que les valeurs correspondant aux index pairs
        System.out.println("\nValeurs des index pairs :");
        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                System.out.println("Index " + i + ": " + array[i]);
            }
        }

        // Combiner une boucle et un test de manière à n’afficher que les entiers impairs
        System.out.println("\nÉléments impairs :");
        for (int i = 0; i < length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }

    }
}
