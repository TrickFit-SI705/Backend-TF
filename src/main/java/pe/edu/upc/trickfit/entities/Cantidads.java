package pe.edu.upc.trickfit.entities;

public class Cantidads {

    private String plan;
    private String mes;
    private String cantidad;

    public Cantidads() {
    }

    public Cantidads(String plan, String mes, String cantidad) {
        this.plan = plan;
        this.mes = mes;
        this.cantidad = cantidad;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}
