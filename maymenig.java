import java.util.Scanner;
    public class maymenig{
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Dime un numero");
        num1 = lector.nextInt();
        System.out.println("Dime un numero");
        num2 = lector.nextInt();
        if (num1 > num2)
            System.out.println("El primer numero es mas grande que el segundo");
        else if (num1 < num2)
            System.out.println("El primer numero es mas pequeño que el segundo");
        else
            System.out.println("Los numeros son iguales");

    lector.close();
    }
}