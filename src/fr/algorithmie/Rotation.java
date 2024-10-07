package fr.algorithmie;

public class Rotation {
    public static void main(String[] args) {

        int[] array = {0, 1, 2, 3};

        int lenght = array.length;

        System.out.println("Avant rotation : ");
        for (int i = 0; i < lenght; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        if (lenght > 0) {
            int lastElement = array[lenght - 1];

            for (int i = lenght - 1; i > 0; i--) {
                array[i] = array[i - 1];
            }

            array[0] = lastElement;
        }

        System.out.println("Après rotation : ");
        for (int i = 0; i < lenght; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}