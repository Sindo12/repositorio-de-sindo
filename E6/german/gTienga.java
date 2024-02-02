package E6.german;

import E6.Bicicleta;

public class gTienga {
    private Bicicleta[] referencias;
    private int numreferencias;
    private int numReferencias;
    public Tienda(int tamanyoInicial){
        referencias = new Bicicleta[tamanyoInicial];
        numReferencias = 0;
    }
    public Bicicleta comprarReferencia(String referencia){

    }
    public bicicleta buscarPorReferencia(String referencia){
        for(bint i = 0; i < numReferencias; i++){
            if (bicicleta.getReferencia().equalsIgnoreCase(referencia)){
                return bicicleta;
            }
        }
    }
}
