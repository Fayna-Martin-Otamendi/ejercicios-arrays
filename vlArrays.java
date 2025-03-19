import java.util.Scanner;

public class vlArrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] arr = new int[10];
        int positivos = 0, negativos = 0, ceros = 0;

        for (int i = 0; i < arr.length; i++) {
        System.out.println("Introduce el número " + i + ": ");
        arr[i] = scn.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
        if (arr[i] > 0) {
            positivos++;
        } else if (arr[i] < 0) {
            negativos++;
        } else {
            ceros++;
        }
    
    }

        System.out.println("El número de números positivos es: " + positivos);
        System.out.println("El número de números negativos es: " + negativos);
        System.out.println("El número de ceros es: " + ceros);
        





    
 }
}