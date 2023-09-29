import java.util.Scanner;

public class DiasDeVida {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
            int edad;
            int dias = 365;
            int resultado;
                System.out.println("Dime cuántos años tienes ");
                    edad = lector.nextInt();
                    resultado = edad * dias;
                System.out.println(edad + " * " + dias + " = " + resultado);
    }
}