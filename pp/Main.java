import java.util.Scanner;

enum ColorEnum {
    RED, GREEN, BLUE
}

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        ColorEnum colorSeleccionado = ColorEnum.BLUE;

        switch (colorSeleccionado) {
            case RED:
                System.out.println("El color seleccionado es RED.");
                break;
            case GREEN:
                System.out.println("El color seleccionado es GREEN.");
                break;
            case BLUE:
                System.out.println("El color seleccionado es BLUE.");
                break;
            default:
                System.out.println("Color no reconocido.");
        }
    }
}