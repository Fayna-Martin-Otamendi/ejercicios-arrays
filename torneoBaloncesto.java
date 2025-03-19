import java.util.Scanner;

public class torneoBaloncesto {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String [] arr1 = new String [8];
        String [] ganadorRonda1 = new String [4];
        String [] ganadorRonda2 = new String [3];
        String [] ganadorRonda3 = new String [2];
        String ganadorFinal;
        int ganador;
        int indexGanador;
        

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Introduce el nombre del equipo " + (i + 1) + ": ");
            arr1[i] = scn.nextLine(); 
        }

        System.out.println("Primera ronda:");
        System.out.println();
        indexGanador = 0;
        for (int i = 0; i < arr1.length; i += 2) {
         System.out.println("1. " + arr1[i] + " - " + "2. " + arr1[i+1]);
         do { 
            System.out.println("Ingrese el ganador (1 para " + arr1[i] + " o 2 para " + arr1[i + 1] + "):");
            ganador = scn.nextInt();
            scn.nextLine(); // Consumir el salto de línea

            if (ganador == 1) {
                ganadorRonda1[indexGanador] = arr1[i];
            } else if (ganador == 2) {
                ganadorRonda1[indexGanador] = arr1[i + 1];
            } else {
                System.out.println("Opción inválida. Introduzca 1 o 2.");
            }
        } while (ganador != 1 && ganador != 2);

        indexGanador++; // Avanzamos en el array de ganadores
    }
    System.out.println("\nEquipos que avanzan a la siguiente ronda:");
        for (String equipo : ganadorRonda1) {
            System.out.println("- " + equipo);
        }


        System.out.println();
        System.out.println("Segunda ronda:");
        System.out.println();
        indexGanador = 0;
        for (int i = 0; i < ganadorRonda1.length; i += 2) {
         System.out.println("1. " + ganadorRonda1[i] + " - " + "2. " + ganadorRonda1[i+1]);
         do { 
            System.out.println("Ingrese el ganador (1 para " + ganadorRonda1[i] + " o 2 para " + ganadorRonda1[i + 1] + "):");
            ganador = scn.nextInt();
            scn.nextLine(); // Consumir el salto de línea

            if (ganador == 1) {
                ganadorRonda2[indexGanador] = ganadorRonda1[i];
            } else if (ganador == 2) {
                ganadorRonda2[indexGanador] = ganadorRonda1[i + 1];
            } else {
                System.out.println("Opción inválida. Introduzca 1 o 2.");
            }
        } while (ganador != 1 && ganador != 2);

        indexGanador++; // Avanzamos en el array de ganadores
    }
    System.out.println("\nEquipos que avanzan a la siguiente ronda:");
        for (String equipo : ganadorRonda2) {
            System.out.println("- " + equipo);
        }

        System.out.println();
        System.out.println("Tercera ronda:");
        System.out.println("1. " + ganadorRonda2[0] + " - " + "2. " + ganadorRonda2[1]);
         do { 
            System.out.println("Ingrese el ganador (1 para " + ganadorRonda2[0] + " o 2 para " + ganadorRonda2[1] + "):");
            ganador = scn.nextInt();
            scn.nextLine(); // Consumir el salto de línea

            if (ganador == 1) {
                ganadorRonda3[0] = ganadorRonda2[0];
            } else if (ganador == 2) {
                ganadorRonda3[0] = ganadorRonda2[1];
            } else {
                System.out.println("Opción inválida. Introduzca 1 o 2.");
            }
        } while (ganador != 1 && ganador != 2);

        ganadorFinal = ganadorRonda3[0];
    

        System.out.println();
        System.out.println("GRAN FINAL:");
        System.out.println(ganadorFinal);

        System.out.println();
        System.out.println("\n¡Equipo Ganador!");
        System.out.println(ganadorFinal);  


    
 }
}