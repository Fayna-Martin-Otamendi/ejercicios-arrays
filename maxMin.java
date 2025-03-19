import java.util.Random;

public class maxMin {
    public static void main(String[] args) {

    int [][] arr = new int [5][5];
    Random random = new Random();

    

    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
           arr[i][j] = random.nextInt(100) + 1;
            if (arr[i][j] > max) {
            max = arr[i][j];
            }
            if (arr[i][j] < min) {
                min = arr[i][j];
            }
        }
    }

    System.out.println("Matriz generada:");
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            System.out.print(arr[i][j] + "\t");
        }
        System.out.println();
    }    
    System.out.println("El valor máximo es: " + max);
    System.out.println("El valor minimo es: " + min);

 }
} 
