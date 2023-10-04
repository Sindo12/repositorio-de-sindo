import java.util.Scanner;
    public class nota{
        public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        double nota;
        System.out.println("Que nota has sacado?");
        nota = lector.nextDouble();
        if (nota < 5)
        System.out.println("Insuficiente");
        else if (nota <= 5 && nota > 6)
        System.out.println("Suficiente");
        else if (nota <= 6 && nota > 7)
        System.out.println("Bien");
        else if (nota <= 7 && nota > 8)
        System.out.println("Notable");
        else if (nota <= 9)
        System.out.println("Sobresaliente");
        else if (nota <= 10)
        System.out.println("Sobresaliente");
        else 
        System.out.println("ERROR");


        }
    }