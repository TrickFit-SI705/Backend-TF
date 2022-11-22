package pe.edu.upc.trickfit.entities;

public class Respuesta_UQ2 {
    private String dni;
    private String nombre;
    private String alimento;
    private String cantidad;

    public Respuesta_UQ2() {
    }

    public Respuesta_UQ2(String dni, String nombre, String alimento, String cantidad) {
        this.dni = dni;
        this.nombre = nombre;
        this.alimento = alimento;
        this.cantidad = cantidad;
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

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}
