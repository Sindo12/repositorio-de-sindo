package libreria;

import libreria.lib.Coche;
import libreria.lib.Tipo;
import libreria.lib.lib;

public class Principal{
    public static void main(String[] args){
        Coche coche1 = new Coche("corola", "morado", true, "0669WHG", Tipo.MINI, "1522", "tercero");
        Coche coche2 = new Coche("seat", "amarillo", false, "3333ALS", Tipo.UTILITARIO, "1533", "tercero");

        System.out.println(coche1.toString());
        System.out.println(coche2.toString());

    }
}