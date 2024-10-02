package fr.tableaux;

public class ExerciceTableauChaines {
    public static void main(String[] args) {

        String[] villes = {"Montpellier", "Nimes", "Nantes", "Anduze", "Marseille"};

        System.out.println("\nTableau de villes  :");
        for (String ville : villes) {
            System.out.println(ville);
        }

        int longeur = villes.length;

        System.out.println("\nLongeur du tableau:" + longeur);

        villes[3] = "Reims";

        System.out.println("\nTableau de villes modifié :");
        for (String ville : villes) {
            System.out.println(ville);
        }
    }
}

