import java.util.Scanner;

public class mediaNumeros {
     public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] arr = new int[5];
        int positivos = 0, negativos = 0, ceros = 0, sumaPositivos = 0, sumaNegativos = 0, mediaPositivos = 0, mediaNegativos = 0;

        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Introduce el número " + i + ": ");
            arr[i] = scn.nextInt(); 
        }
        
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0){
                positivos++;
                sumaPositivos += arr[i];
            } else if (arr[i] < 0) {
                negativos++;
                sumaNegativos += arr[i];
            } else {
                ceros++;
            }
        }

        if (positivos == 0) {
            System.out.println ("No se puede realizar la media de números positivos");
        } else {
            System.out.println ("La media de los números positivos es: " + ((float)sumaPositivos / positivos));
        }

        if (negativos == 0) {
            System.out.println ("No se puede realizar la media de números negativos");
        } else {
            System.out.println ("La media de los números negativos es: " + ((float) sumaNegativos / negativos));
            System.out.println("El número de ceros es: " + ceros);
        }
 
    
    
 }
} 
