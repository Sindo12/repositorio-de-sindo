public class Mayor2{
    public static void main(String[] args){
        double num1 = 2, num2 = 4;
        double resulatado = numero(num1, num2);

        System.out.printf("El numero mas alto es %.1f",resulatado);


    }
    public static double numero(double num1, double num2){
        if (num1 > num2){
            return num1;
        } else {
            return num2;
        }



    }
}