package pe.edu.upc.trickfit.entities;

public class PlanUsuarioBean {
    private String dni;
    private String nombre;
    private String fecha;

    public PlanUsuarioBean() {
    }

    public PlanUsuarioBean(String dni, String nombre, String fecha) {
        this.dni = dni;
        this.nombre = nombre;
        this.fecha = fecha;
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
