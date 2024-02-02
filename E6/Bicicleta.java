package E6;

public class Bicicleta {
    private String referencia;
    private String marca;
    private String modelo;
    private Integer peso;
    private Integer pulgadas;
    private boolean motor;
    private Integer fecha;
    private Integer precio;
    private Integer referencias;


    public Bicicleta(String referencia, String marca, String modelo, Integer peso, Integer pulgadas, boolean motor, Integer fecha, Integer precio, Integer referencias) {
        this.referencia = referencia;
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
        this.pulgadas = pulgadas;
        this.motor = motor;
        this.fecha = fecha;
        this.precio = precio;
        this.referencias = referencias;
    }


    public String getReferencia() {
        return this.referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getPeso() {
        return this.peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getPulgadas() {
        return this.pulgadas;
    }

    public void setPulgadas(Integer pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isMotor() {
        return this.motor;
    }

    public boolean getMotor() {
        return this.motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    public Integer getFecha() {
        return this.fecha;
    }

    public void setFecha(Integer fecha) {
        this.fecha = fecha;
    }

    public Integer getPrecio() {
        return this.precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getReferencias() {
        return this.referencias;
    }

    public void setReferencias(Integer referencias) {
        this.referencias = referencias;
    }

    
}
