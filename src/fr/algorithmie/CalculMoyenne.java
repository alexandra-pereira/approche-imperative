package fr.algorithmie;

public class CalculMoyenne {
    public static void main(String[] args) {

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // Quelle est la moyenne des éléments du tableau ?

        double sum = 0; // Initialisation de 'sum' en tant que double dès le début pour obtenir un résultat avec décimales et assurer la moyenne exacte

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double moyenne = (double) sum / array.length;

        System.out.println("La moyenne des éléments du tableau est : " + moyenne);
    }
}

