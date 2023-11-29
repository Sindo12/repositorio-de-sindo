package Tema06;

import java.util.Scanner;

public class E15 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = new int[20];
        numero(array);
        orden(array);

    }
    public static void numero(int[] array){
        for (int i = 0; i < 20; i++){
            System.out.printf("a[%d]\n", i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }
    }
    public static void orden(int[] array) {
            System.out.println(array[0] + " " + array[1] + " " + array[2] + " " + array[3] + " " + array[4]);
            System.out.println(array[5] + " " + array[6] + " " + array[7] + " " + array[8] + " " + array[9]);
            System.out.println(array[10] + " " + array[11] + " " + array[12] + " " + array[13] + " " + array[14]);
            System.out.println(array[15] + " " + array[16] + " " + array[17] + " " + array[18] + " " + array[19]);
    }
}
