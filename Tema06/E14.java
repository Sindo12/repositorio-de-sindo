package Tema06;

import java.util.Scanner;

public class E14{
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        char[] array = new char[10];
        letra(array);
        pares (array);
        impares (array);
    }
    public static void letra(char[] array){
        for (int i = 0; i < 10; i++){
            System.out.printf("a[%d]\n", i);
            array[i] = scanner.nextLine().charAt(0);
        }
    }
    public static void pares(char[] array) {
        for (int i = 0; i < array.length; i += 2){
            System.out.println("Los caracteres pares son estos " + array[i]);
        }
    }
    public static void impares(char[] array) {
        for (int i = 1; i < array.length; i += 2){
            System.out.println("Los caracteres impares son estos " + array[i]);
        }
    }
}