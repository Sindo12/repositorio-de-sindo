import java.util.Scanner;
    public class Eje1{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int num1, num2;
            System.out.println("Dime un numero");
            num1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Dime un numero");
            num2 = Integer.parseInt(scanner.nextLine());
            
            System.out.println(suma(num1, num2));

            scanner.close();
        }
        public static Integer suma(int num1, int num2){
            int resultado;
            resultado = num1 + num2;
            return resultado;
        }          
    }