import java.util.Scanner;
    public class Hasta0{
        public static void main(String[] args){
            Scanner lector = new Scanner(System.in);
            int num1, resultado;
            int num2 = 0;
                        
            do {
                System.out.println("Dime un numero ");
                num1 = lector.nextInt();
                resultado = num2 + num1;

            } while (num1 !=0 );
            System.out.println(resultado);



        }
    }