import java.util.Scanner;
   public class Eje3 {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int num1 ,num2;
            System.out.println("Dime un numero");
            num1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Dime otro numero");
            num2 = Integer.parseInt(scanner.nextLine());

            mayor(num1 ,num2);

            scanner.close();
        }
        public static Integer mayor(int num1, int num2){
            if (num1 > num2){
                System.out.println(num1 + " es el numero mas alto");
                return num1;
            } else{
                System.out.println(num2 + " es el numero mas alto");
                return num2;

            }
        }
    }
