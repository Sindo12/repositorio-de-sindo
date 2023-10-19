public class PiramideDe {
    public static void main(String[] args) {
        int num = 9;
            //se ejecuta si i es menor o igual que n para ir aumentando los numeros de uno en uno
            for (int i = 1; i <= num; i++) {
            //imprimir espacios en blanco
            for (int j = 1; j <= num - i; j++) 
                System.out.print("");
            //imprimir los numeros en orden
            for (int k = 1; k <= i; k++) 
                System.out.print(k + " ");
            
            System.out.println();
        }
    }
}