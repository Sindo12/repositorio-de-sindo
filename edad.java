import java.util.Scanner;
    public class edad{
        public static void main(String[] args){
            Scanner lector = new Scanner(System.in);
            int edad;
            System.out.println("Dime tu edad");
            edad = lector.nextInt();
            if (edad > 18)
                System.out.println("Es mayor de edad");
            else 
                System.out.println("Es menor de edad");
            lector.close();
        }
    }