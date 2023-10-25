import java.util.Scanner;
    public class DosDecimales{
        public static void main(String[] args){
            Scanner lector = new Scanner(System.in);
            float num = 0f;
            System.out.println("Dime un numero");
            num = lector.nextFloat();
            System.out.printf("%.2f", num);




        }
    }