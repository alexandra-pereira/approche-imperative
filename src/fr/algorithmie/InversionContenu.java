package fr.algorithmie;

public class InversionContenu {
    public static void main(String[] args) {

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        int lenght = array.length;

        // Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy mais dans l’ordre inverse

        int[] arrayCopy = new int[lenght];

        for (int i = 0; i < lenght; i++) {
            arrayCopy[i] = array[lenght - 1 - i];
        }

        // Afficher l’ensemble des éléments des 2 tableaux

        System.out.println("Éléments du tableau original :");
        for (int i = 0; i < lenght; i++) {
            System.out.println(array[i]);
        }

        System.out.println("\nÉléments du tableau inversé (arrayCopy) :");
        for (int i = 0; i < lenght; i++) {
            System.out.println(arrayCopy[i]);
        }
    }
}
