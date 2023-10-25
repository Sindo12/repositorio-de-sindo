public class Eje4{
    public static void main(String[] args){
        double num1 = 2, num2 = 4, num3 = 7, num4 = 1;
        double resulatado = numero(num1, num2, num3, num4);

        System.out.printf("El numero mas alto es %.1f",resulatado);


    }
    public static double numero(double num1, double num2, double num3,double num4){
        if (num1 > (num2, num3, num4)){
            return num1;
        } else if (num2 > (num1, num3, num4)){
            return num2;
        } else if (num3 > (num1, num2, num4)){
            return num3;
        } else {
            return num4;
        }



    }
}