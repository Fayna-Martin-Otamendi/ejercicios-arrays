import java.util.Random;

public class juegoLaberinto {
    public static void main(String[] args) {
        Random random = new Random();
        int evento = random.nextInt(4) + 1;

        int energia = 100;
        String sala1, sala2, sala3, sala4, posicionInicial = "Sala 1";
        boolean salirJuego = false;

        while (!salirJuego) {

        switch (evento) {
            case 1:
            energia += 10;
            System.out.println ("Has encontrado moneda! Ganas +10 puntos de energía! Ahora tu energía es " + energia + " puntos");                
                break;
            case 2:
            energia -= 15;
            System.out.println("Has caído en una trampa! Pierdes 15 puntos de energía. Ahora tu energía es " + energia + " puntos");                
                break;
            case 3:
            System.out.println("ooohhh... no has encontrado nada");    
                break;
            case 4:
            salirJuego = true;
                System.out.println();
                break;
            default:
        }
    }   
    
 }
} 
