import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***************************");
        System.out.println("*** GESTION DE ALUMNOS ***");
        System.out.println("***************************");
        System.out.println("1. Nuevo alumno");
        System.out.println("2. Bajas de alumnos");
        System.out.println("3. Consultas");
        System.out.println();
        System.out.println("---------------------------");
        System.out.println();
        System.out.println("0. Salir");
        int num = scanner.nextInt();

        switch (num) {
            case 0:
                System.out.println("Saliendo del programa...");
                break;
            case 1:
                System.out.println("Opción 1 seleccionada: Nuevo alumno");
                break;
            case 2:
                System.out.println("Opción 2 seleccionada: Bajas de alumnos");
                break;
            case 3:
                System.out.println("Opción 3 seleccionada: Consultas");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

}
