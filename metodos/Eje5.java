import java.util.Scanner; 
    public class Eje5 {
        public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);
            int veces;
            char letra = 'A';    
            System.out.println("Dome la cantidad de veces que quieras que se repita la letra");
            veces = Integer.parseInt(scanner.nextLine());
            imprimir(letra, veces);
        }
        public static void imprimir(char letra,int veces){       
            while(veces>=1){
            System.out.printf("%4c",letra);
            veces -= 1;
            }
        }
    }
