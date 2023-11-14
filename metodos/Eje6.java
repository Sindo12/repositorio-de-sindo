import java.util.Scanner; 
        public class Eje6 {
            public static void main(String[] args){
                    Scanner scanner = new Scanner(System.in);
                    int vecesLinea;
                    int vecesColumna;
                    char letra = 'A';    
                    System.out.println("Dome la cantidad de veces que quieras que se repita la letra en lineas");
                    vecesColumna = Integer.parseInt(scanner.nextLine());
                    System.out.println("Dome la cantidad de veces que quieras que se repita la letra en columnas");
                    vecesLinea = Integer.parseInt(scanner.nextLine());
                    imprimir(letra, vecesColumna, vecesLinea);
            }
            public static void imprimir(char letra, int vecesColumna, int vecesLinea){       
                for(int i = 1; i <= vecesColumna; i++){
                    for(int j = 1; j <= vecesLinea; j++){
                    System.out.print(letra);
                    }
                System.out.println();
                }
            }
        }