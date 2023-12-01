package Tema06;

import java.util.Scanner;

public class E18 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array1 = {2, 1, 5, 7, 3, 6, 7, 9, 4, 12};
        int[] array2 = {1, 6, 3, 9, 3, 9, 13, 5, 2, 1};
        suma(array1, array2);
    }
    public static void suma(int[] array1 ,int[] array2){
        int [] rsuma = new int[array1.length];
        double[] rdivision = new double[array1.length];

        
        for (int i = 0; i < array1.length; i++) {
            rsuma[i] = array1[i] + array2[i];
        }

        for (int i = 0; i < array1.length; i++) {
            rdivision[i] = (double) array1[i] / array2[i];
        }



        for (int i = 0; i < rsuma.length; i++) {
            System.out.print(rsuma[i] + " ");
        }
        System.out.println("\n");     
        for (int i = 0; i < rdivision.length; i++) {
            System.out.print(rdivision[i] + " ");
        }

    }
}
