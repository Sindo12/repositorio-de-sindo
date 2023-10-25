import java.util.Scanner;
import java.util.Random;
    public class Blackjack{
        public static void main(String[] args){
            Scanner lector = new Scanner(System.in);
            Random random = new Random();
            int dado = 0;
            int tiro;
            int porra1 = 0;
            int porra2 = 0;
            int jugador1, jugador2;
            int lanzamiento;
            int contadorUno = 0, contadorDos = 0, contadorTres = 0, contadorCuatro = 0, contadorCinco = 0, contadorSeis = 0;

            for (int i = 0; i < lanzamiento; i++){
                tiro = random.nextInt(6) + 1;

                if (tiro == 1){
                    contadorUno++;
                } else if (tiro == 2){
                    contadorDos++;
                }else if (tiro == 3){
                    contadorTres++;
                }else if (tiro == 4){
                    contadorCuatro++;
                }else if (tiro == 5){
                    contadorCinco++;
                }else {
                    contadorSeis++;
                }
            }
            dado = contadorUno + contadorDos + contadorTres + contadorCuatro + contadorCinco + contadorSeis;
            System.out.println("Has sacado " + dado);





            if (dado == 11)
                System.out.println("Has sacado 11, Felicicades!! Sumas 2 porras");




        }
    }
