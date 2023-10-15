import java.util.Scanner;
import java.util.Random;

public class Aleatorio {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Random rnd = new Random();
        int intentos;
        int intentosRealizados = 0;
        int numeroAdivinar;
        int numero;

        numeroAdivinar = rnd.nextInt(100) + 1;

        System.out.println("¿Cuántos intentos quieres tener?");
        intentos = Integer.parseInt(lector.nextLine());

        do {
            System.out.println("Adivina un número del 1 al 100:");
            numero = Integer.parseInt(lector.nextLine());
            intentosRealizados++;

            if (numero == numeroAdivinar) {
                System.out.println("Has adivinado el numeroooo Vamooos!!! Felicidades");
                break;
            } else if (numero < numeroAdivinar) {
                System.out.println("El numero es mayor.");
            } else {
                System.out.println("El numero es menor.");
            }
        } while (intentosRealizados < intentos);

        if (intentosRealizados == intentos) {
            System.out.println("Has agotado todos los intentos. El numero era " + numeroAdivinar);
        }
    }
}