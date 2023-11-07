import java.util.Scanner;

    public class Eje20{
            public static void main(String[] args){
                Scanner lector = new Scanner(System.in);
                String fechas;
                System.out.println("Dime el dia que naciste en este formato (dd-mm-aaaa)");
                String fechas = lector.nextLine();

                String suma = fechas(fecha);
                System.out.println("El dia de la suerte es " + suma);

            }
            public static String fecha(String fechas){
                int sumaNumeros = 0;
                fechas.replace('-', '0')
                for (int i = 0; i < fechas.length(); i++) {
                    char c = fechas.charAt(i);
                    if (getNumericValue(c)) {
                        sumaNumeros += Character.getNumericValue(c);
                    }
                }
                return sumaNumeros;

            }

    }