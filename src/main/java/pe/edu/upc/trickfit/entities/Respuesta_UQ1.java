package pe.edu.upc.trickfit.entities;

public class Respuesta_UQ1 {
    private String dni;
    private String nombre;
    private String imc;
    private String rutinas_asignadas;

    public Respuesta_UQ1() {
    }

    public Respuesta_UQ1(String dni, String nombre, String imc, String rutinas_asignadas) {
        this.dni = dni;
        this.nombre = nombre;
        this.imc = imc;
        this.rutinas_asignadas = rutinas_asignadas;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImc() {
        return imc;
    }

    public void setImc(String imc) {
        this.imc = imc;
    }

    public String getRutinas_asignadas() {
        return rutinas_asignadas;
    }

    public void setRutinas_asignadas(String rutinas_asignadas) {
        this.rutinas_asignadas = rutinas_asignadas;
    }
}
