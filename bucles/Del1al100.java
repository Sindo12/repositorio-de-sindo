public class Del1al100{
    public static void main(String[] args){
        int suma = 0;
        for (int i = 0 ; i <=100 ; i++){
            if (i%2 == 1 ){
            System.out.println(i);
            suma=suma+1;
            }
        }
        System.out.println("hay " + suma + " impares");

    }
}