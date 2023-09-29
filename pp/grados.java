import java.util.Scanner;

public class grados {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double grados;
        double kelvin;
        double fahrenheit;
        System.out.println("Dime una cantidad de grados");
        grados = Double.parseDouble(lector.nextLine());
        kelvin = grados + 273.15;
        fahrenheit = grados * 9.0 / 5.0 + 32;
        System.out.println("hacen " + grados + " grados Celsius, " + kelvin + " grados Kelvin y " + fahrenheit + " grados Fahrenheit");
    }
}