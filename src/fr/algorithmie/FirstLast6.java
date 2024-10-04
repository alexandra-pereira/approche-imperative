package fr.algorithmie;

public class FirstLast6 {
    public static void main(String[] args) {

        int[] array = {6, 1, 2, 3};

        boolean hasFirstOrLast6 = (array.length > 0) && (array[0] == 6 || array[array.length - 1] == 6);

        System.out.println("Le tableau a 6 au premier ou au dernier élément : " + hasFirstOrLast6);


//        if (hasFirstOrLast6) {
//            System.out.println("Le tableau a 6 au premier ou au dernier élément.");
//        } else {
//            System.out.println("Le tableau n'a pas 6 au premier ou au dernier élément.");
//        }
    }
}
