import java.util.Scanner;

public class Prueba {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int num1,num2;
		int opcion;
		int resultado;
		System.out.println("Dime un numero ");
		num1 = lector.nextInt();
		System.out.println("dime otro numero ");
		num2 = lector.nextInt();
		System.out.println("1. suma");
		System.out.println("2. resta");
		System.out.println("3. multiplicacion");
		System.out.println("4. division");
		opcion = lector.nextInt()
		if (opcion == 1){
			//codigo para la suma
			resultado = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + resultado);
		} else if (opcion == 2) {
			//codigo para la resta
			resultado = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + resultado);
		} else if (opcion == 3) {
			//codigo para la multiplicacion
			resultado = num1 * num2;
			System.out.println(num1 + " * " + num2 + " = " + resultado);
		} else if (opcion == 4) {
			//codifo de la division
			resultado = num1 / num2;
			System.out.println(num1 + " / " + num2 + " = " + resultado);
	}	
	}
}