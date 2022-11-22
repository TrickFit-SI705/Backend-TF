package pe.edu.upc.trickfit.entities;

public class Planquery {
    private String metodo;
    private String cantidad;
    private String total;

    public Planquery() {
    }

    public Planquery(String metodo, String cantidad, String total) {
        this.metodo = metodo;
        this.cantidad = cantidad;
        this.total = total;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
