import java.util.Random;

public class copiarArray {
    public static void main(String[] args) {

        int [] arr1 = new int [3];
        int [] arr2 = new int [3];
        int i = 0;
        Random random = new Random();

        System.out.println("Array generado:");
        for (i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(100) + 1;
            System.out.print(arr1[i] + "\t");
            
        }
        
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);
        
        System.out.println();
        System.out.println("Array copiado:");
        for (i = 0; i < arr1.length; i++) {
            System.out.print(arr2[i] + "\t");
        }
        

        System.out.println();
 }
}  
