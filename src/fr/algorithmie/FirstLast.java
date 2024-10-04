package fr.algorithmie;

public class FirstLast {
    public static void main(String[] args) {

        int[] array = {5, 1, 2, 5};

        boolean isFirstLastEqual = (array.length >= 1) && (array[0] == array[array.length - 1]);

        System.out.println("Le premier et le dernier élément sont égaux : " + isFirstLastEqual);


//        if (isFirstLastEqual) {
//            System.out.println("Le premier et le dernier élément sont égaux.");
//        } else {
//            System.out.println("Le premier et le dernier élément ne sont pas égaux.");
//        }
    }
}