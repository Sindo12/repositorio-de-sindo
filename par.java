import java.util.Scanner;
public class par{
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero;
        System.out.println("Dime un numero y te digo si es par o impar");
        numero = lector.nextInt();
        if (numero%2 == 0)
        System.out.println("es par");
        else
        System.out.println("es impar");



    }
}