import java.util.Random;

    public class Moneda{
        public static void main(String[] args){
        Random rnd = new Random();
        double Cara;
        double Cruz;
        int lanzamiento = 1000000;
        int ContadorCara = 0;
        int ContadorCruz = 0;
        int tiro;

        for (int i = 0; i < lanzamiento; i++){
            tiro = rnd.nextInt(2);

            if (tiro == 0){
                ContadorCara++;
            } else {
                ContadorCruz++;
            }
        }

        Cara = ((double)ContadorCara * 100)/ 1000000;
        Cruz = ((double)ContadorCruz * 100)/ 1000000;

        System.out.println("Cara  " + Cara + "%");
        System.out.println("Cruz  " + Cruz + "%");
    
        }
    }