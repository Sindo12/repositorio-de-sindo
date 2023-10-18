import java.util.Scanner;
import java.util.Random;

public class Blackjack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int lanzamientos = 1;
        int porra1 = 0;
        int porra2 = 0;
        int jugador1;
        int jugador2;
        int contadorUno = 0, contadorDos = 0, contadorTres = 0, contadorCuatro = 0, contadorCinco = 0, contadorSeis = 0;
        
        boolean volverATirar = true;

        do {
            int dado = 0;
            
            for (int i = 0; i < lanzamientos; i++) {
                int tiro = random.nextInt(6) + 1;
                switch (tiro) {
                    case 1:
                    contadorUno++;
                    break;
                    case 2:
                    contadorDos++;
                    break;
                    case 3:
                    contadorTres++;
                    break;
                    case 4:
                    contadorCuatro++;
                    break;
                    case 5:
                    contadorCinco++;
                    break;
                    case 6:
                    contadorSeis++;
                    break;
                }
                dado += tiro;
            }

            System.out.println("Has sacado " + dado);

            if (dado == 11) { 
                System.out.println("¡Has ganado! (Sumas dos porras)");
                volverATirar = false; // Si sumas 11, no vuelvas a tirar
            } else if (dado < 11) {
                System.out.println("Quieres volver a probar suerte? (s/n)");
                String respuesta = scanner.next();
                if (dado > 11)
                if (respuesta.equalsIgnoreCase("n")) {
                    volverATirar = false; // Si eliges no, no vuelvas a tirar
                }
            } else {
                System.out.println("Mala suerte te has pasado");
                porra2++;
                volverATirar = false; // Si te pasas, no vuelvas a tirar
            }
        } while (volverATirar);
    }
}