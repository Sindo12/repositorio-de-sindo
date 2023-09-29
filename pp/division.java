import java.util.Scanner;

public class division {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
        double num1;
        double num2;
        double resultado;
            System.out.println("Dime un numero ");
                num1 = lector.nextInt();
                lector.nextLine();
            System.out.println("Dime un numero ");
                num2 = lector.nextInt();
                lector.nextLine();
                //num2=Integer.parseInt(lector.nextLine()); (resume las dos lineas de arriba)
                resultado = num1 / num2;
            System.out.println(num1 + "/" + num2 + "=" + resultado);
    }
}