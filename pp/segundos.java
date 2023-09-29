import java.util.Scanner;

public class segundos {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int segundos;
        int dias;
        int horas;
        int minutos;
        System.out.println("Dime una cantidad de segundos");
        segundos = lector.nextInt();
        minutos = segundos / 60;
        System.out.println(segundos + "/" + 60 + "=" + minutos);
        horas = minutos / 60;
        System.out.println(minutos + "/" + 60 + "=" + horas);
        dias = horas / 24;
        System.out.println(horas + "/" + 24 + "=" + dias);

        System.out.println(dias + " días, " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos"); // Corrige la concatenación
    }
}