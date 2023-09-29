import java.util.Scanner;

public class resta {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
        int num1;
        int num2;
        int resultado;
            System.out.println("Dime un numero ");
                num1 = lector.nextInt();
            System.out.println("Dime un numero ");
                num2 = lector.nextInt();
                //num2=Integer.parseInt(lector.nextLine()); (resume las dos lineas de arriba)
                resultado = num1 - num2;
            System.out.println(num1 + "-" + num2 + "=" + resultado);
    }
}