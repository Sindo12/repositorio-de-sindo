import java.util.Scanner;
    public class Eje2 {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            Double radio;
            System.out.println("Dime de cuanto es el radio de tu circunferencia");
            radio = scanner.nextDouble();
            
            Double area = calculoArea(radio);
            Double longitud = calculoLongitud(radio);
            
            System.out.println("El area de tu circunferencia es " + area);
            System.out.println("El longitud de tu circunferencia es " + longitud);

            scanner.close();
        }//calculo del area 
        public static Double calculoArea(Double radio){
            Double resultado = Math.PI * (radio * radio);;
            return resultado;
        }//calculo de la longitud
        public static Double calculoLongitud(Double radio){
            Double resultado2 = (2 * Math.PI) * radio;
            return resultado2;
        }    
    }