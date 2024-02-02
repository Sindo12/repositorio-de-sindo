package E6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("  *************************");
        System.out.println("*** GESTIÓN DE BICICLETAS ***");
        System.out.println("  *************************");
        System.out.println("  1.- Añadir bicicleta");
        System.out.println("  2.- Vender bicicleta");
        System.out.println("  3.- Consultar bicicleta");
        System.out.println("  4.- Mostrar stock");
        System.out.println("-----------------------------");
        System.out.println("  0.- Salir");
        System.out.println("  Escoge una opción");
        int opcion = scanner.nextInt();
        System.out.println(opcion);
        
        switch (opcion) {
            case 1:
                System.out.println("Añadiendo bicicleta");
                break;
            case 2:
                System.out.println("Vendiendo bicicleta");
                break;
            case 3:
                System.out.println("Consultando bicicleta");
                break;
            case 4:
                System.out.println("Mostrando Stock");
                break;
            case 5:
                System.out.println("Saliendo");
                break;
        }
    }
}
