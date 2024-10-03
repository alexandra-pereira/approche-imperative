package fr.boucles;

public class ExerciceBoucleBase {
    public static void main(String[] args) {

        System.out.println("Nombres de 1 à 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("\n20 fois mon nom et prénom:");
        for (int i = 0; i < 20; i++) {
            System.out.println("Alexandra Pereira");
        }

        System.out.println("\nÉléments pairs de 2 à 100:");
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }

        System.out.println("\nÉléments impairs de 1 à 99:");
        for (int i = 1; i < 100; i += 2) {
            System.out.println(i);
        }
    }
}
