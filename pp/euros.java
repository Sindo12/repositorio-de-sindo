import java.util.Scanner;

public class euros{
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Double euros;
        Double dolares;
        Double libras;
    System.out.println("Pon una cantidad de Euros ");
    euros = Double.parseDouble(lector.nextLine());
    dolares = euros * 1.06;
    libras = euros * 0.87;
    System.out.println("Tienes " + euros + "euros, que es lo mismo que " + dolares + "dolares y " + libras + "libras");

    }
}