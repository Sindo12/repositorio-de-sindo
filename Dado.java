import java.util.Random;

    public class Dado{
        public static void main(String[] args){
        Random rnd = new Random();
        double Uno, Dos, Tres, Cuatro, Cinco, Seis;
        int ContadorUno = 0;
        int ContadorDos = 0;
        int ContadorTres = 0;
        int ContadorCuatro = 0;
        int ContadorCinco = 0;
        int ContadorSeis = 0;
        int lanzamiento = 1000000;
        int tiro;
        int duracion = 5;

        for (int i = 0; i < lanzamiento; i++){
            tiro = rnd.nextInt(6) + 1;

            if (tiro == 1){
                ContadorUno++;
            } else if (tiro == 2){
                ContadorDos++;
            }else if (tiro == 3){
                ContadorTres++;
            }else if (tiro == 4){
                ContadorCuatro++;
            }else if (tiro == 5){
                ContadorCinco++;
            }else {
                ContadorSeis++;
            }
        }

        Uno = (ContadorUno /duracion) * 100;
        Dos = (ContadorDos /duracion) * 100;
        Tres = (ContadorTres /duracion) * 100;
        Cuatro = (ContadorCuatro /duracion) * 100;
        Cinco = (ContadorCinco /duracion) * 100;
        Seis = (ContadorSeis /duracion) * 100;

        System.out.println("El numero 1 ha salido con de probabilidad del " + Uno + "%");
        System.out.println("El numero 2 ha salido con de probabilidad del " + Dos + "%");
        System.out.println("El numero 3 ha salido con de probabilidad del " + Tres + "%");
        System.out.println("El numero 4 ha salido con de probabilidad del " + Cuatro + "%");
        System.out.println("El numero 5 ha salido con la probabilidad del " + Cinco + "%");
        System.out.println("El numero 6 ha salido con la probabilidad del " + Seis + "%");
    
        }
    }