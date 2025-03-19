import java.util.Random;

public class PositivoNegativo {

    public static void main(String[] args) {

        int [] arr1 = new int [20];
        int i = 0, positivos = 0, negativos = 0, sumaPositivos = 0, sumaNegativos = 0;
        Random random = new Random();

        System.out.println("Array generado:");
        for (i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(201) - 100;
            System.out.print(arr1[i] + "\t");
        }
        System.out.println();

        for (i = 0; i < arr1.length; i++) {
            if (arr1[i] >= 0) {
                positivos++;
                sumaPositivos += arr1[i];
            } else { 
                negativos++;
                sumaNegativos += arr1[i];
                
            }    
        }

        System.out.println("Los números positivos son: " + positivos);
        System.out.println("Los números negativos son: " + negativos);
        System.out.println("La suma de los positivos es: " + sumaPositivos);
        System.out.println("La suma de los negativos es: " + sumaNegativos);
    
 }
} 
