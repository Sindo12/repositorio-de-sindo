package libreria.lib;

public class Coche {
    private String modelo;
    private String color;
    private boolean pinturaMetalizada;
    private String matricula;
    private Tipo tipo;
    private String anyo;
    private String modalidad;

//Constructor
    public Coche(String modelo, String color, boolean pinturaMetalizada, String matricula, Tipo tipo, String anyo, String modalidad) {
        this.modelo = modelo;
        this.color = color;
        this.pinturaMetalizada = pinturaMetalizada;
        this.matricula = matricula;
        this.tipo = tipo;
        this.anyo = anyo;
        this.modalidad = modalidad;
    }


    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPinturaMetalizada() {
        return this.pinturaMetalizada;
    }

    public boolean getPinturaMetalizada() {
        return this.pinturaMetalizada;
    }

    public void setPinturaMetalizada(boolean pinturaMetalizada) {
        this.pinturaMetalizada = pinturaMetalizada;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Tipo getTipo() {
        return this.tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getAnyo() {
        return this.anyo;
    }

    public void setAnyo(String anyo) {
        this.anyo = anyo;
    }

    public String getModalidad() {
        return this.modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }
    


    @Override
    public String toString() {
        return "{" +
            " modelo='" + getModelo() + "'" +
            ", color='" + getColor() + "'" +
            ", pinturaMetalizada='" + isPinturaMetalizada() + "'" +
            ", matricula='" + getMatricula() + "'" +
            ", tipo='" + getTipo() + "'" +
            ", anyo='" + getAnyo() + "'" +
            ", modalidad='" + getModalidad() + "'" +
            "}";
    }

}
