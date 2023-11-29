package Tema06;

public class E12 {
    public static void main(String []args){
        String cadena = "esto1234es5678bueno900";
        System.out.println(devA(cadena));
        System.out.println(devB(cadena));
    }
    public static String devA(String s1){
        return s1.replaceAll("es", "no por");
    }
    public static String devB(String s1){
        return s1.replaceAll("\\d+", "***");
    }
}

