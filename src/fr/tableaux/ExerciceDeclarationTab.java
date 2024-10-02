package fr.tableaux;

public class ExerciceDeclarationTab {
    public static void main(String[] args) {

        int[] chiffres = {8, -7, 12, 1, -2, 14, 17, 9};

        System.out.println("Index 0: " + chiffres[0]);

        int longeur = chiffres.length;

        System.out.println("\nLongeur: " + longeur);

        System.out.println("\nEntier positionné au dernier index: " + chiffres[longeur-1]);

        System.out.println("\nEntier d’index 10: " + chiffres[10]);
        //cela échoue car l'index max du tableau est 8
    }
}
