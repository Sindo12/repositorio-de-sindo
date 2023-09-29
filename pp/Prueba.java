import java.util.Scanner;

public class Prueba {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int num1,num2;
		int resultado;
		System.out.println("Dime un numero ");
		num1 = lector.nextInt();
		System.out.println("dime otro numero ");
		num2 = lector.nextInt();
		resultado =num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " resultado);
		lector.close();
	}
}