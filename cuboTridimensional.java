import java.util.Random;

public class cuboTridimensional {
    public static void main(String[] args) {

    int [][][] arr = new int [3][3][3];
    Random random = new Random();

    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            for (int k = 0; k < arr[i][j].length; k++) {
            arr[i][j][k] = random.nextInt(100) + 1;

            }
           
        }
    }

    System.out.println("Matriz generada:");
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            for (int k = 0; k < arr[i][j].length; k++) {
            System.out.print(arr[i][j][k] + "\t");
        }
        System.out.println();
    }  
    System.out.println();
   }  
    
 }
} 
