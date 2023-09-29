import java.util.Scanner;

public class Japatillas {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		double num1 = 85;
		double num2 = 15;
		double resultado;
		double resultado2;
		System.out.println("Las zapatillas cuanto cuastan?, tienes un descuento del 15% ");
		num1 = lector.nextInt();
	resultado = num1 * num2 / 100;
	System.out.println(num1 + " * " + num2 + " / " + 100 + " = " + resultado);
	resultado2 = num1 - resultado;
	System.out.println(num1 + " - " + resultado + " = " + resultado2);
	}
}