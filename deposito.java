import java.util.Scanner;

public class deposito{
    public static void main(String[] atgs) {
        Scanner lector = new Scanner(System.in);
        double combustible;
        double pagado;
        double cuentaquilometros;
        double combustible2;
        double pagado2;
        double cuentaquilometros2;
        double cienKm;
        double totKm;

        //primer repostaje
        System.out.println("precio del litro del combustible");
        combustible = Double.parseDouble(lector.nextLine());
        System.out.println("total pagado al llenar el depósito");
        pagado = Double.parseDouble(lector.nextLine());
        System.out.println("número de kilómetros que marcaba el cuentakilómetros");
        cuentaquilometros = Double.parseDouble(lector.nextLine());

        //segundo repostaje
        System.out.println("precio del litro del combustible");
        combustible2 = Double.parseDouble(lector.nextLine());
        System.out.println("total pagado al llenar el depósito");
        pagado2 = Double.parseDouble(lector.nextLine());
        
        //tercer repostaje
        System.out.println("precio del litro del combustible");
        cuentaquilometros2 =  Double.parseDouble(lector.nextLine());

        //Calculo
        cienKm = combustible + combustible2;
        totKm = (cienKm * 100) / cuentaquilometros2;

        System.out.println("El total de Km son " + cienKm + " y el coste por Km" + totKm);


       


    } 
}