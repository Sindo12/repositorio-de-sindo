import java.util.Scanner;
public class producto{
    public static void main(String[] args){
        Scanner lector =new Scanner(System.in);
        int num1, num2;
        System.out.println("Indica el primer numero");
        num1 = Integer.parseInt(Scanner.nextLine());
        System.out.println("Indica el segundo numero");
        num2 = Integer.parseInt(Scanner.nextLine());
        int suma = 0;
        for (int i = 0; i <= num1; i++){
        
            suma= suma + num2;
        }
    }
}