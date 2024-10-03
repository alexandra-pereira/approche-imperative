package fr.tableaux;

public class ExerciceTableauChaines {
    public static void main(String[] args) {

        String[] villes = {"Montpellier", "Nimes", "Nantes", "Anduze", "Marseille"};

        System.out.println("Tableau de villes: ");
        System.out.println(villes[0]);
        System.out.println(villes[1]);
        System.out.println(villes[2]);
        System.out.println(villes[3]);
        System.out.println(villes[4]);

        /*System.out.println("\nTableau de villes  :");
        for (String ville : villes) {
            System.out.println(ville);
        }*/

        int longeur = villes.length;

        System.out.println("\nLongeur du tableau:" + longeur);

        villes[3] = "Reims";

        System.out.println("\nTableau de villes modifié :");
        for (String ville : villes) {
            System.out.println(ville);
        }
    }
}

