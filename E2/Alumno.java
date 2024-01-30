public class Alumno{
    private Integer nia;
    private String nombre;
    private String apellidos;
    private String fechaNacimiento;
    private String grupo;
    private Integer numero;


    public Alumno(Integer nia, String nombre, String apellidos, String fechaNacimiento, String grupo, Integer numero) {
        this.nia = nia;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.grupo = grupo;
        this.numero = numero;
    }


    public Integer getNia() {
        return this.nia;
    }

    public void setNia(Integer nia) {
        this.nia = nia;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGrupo() {
        return this.grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Integer getNumero() {
        return this.numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    
}