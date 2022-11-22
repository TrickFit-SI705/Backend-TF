package pe.edu.upc.trickfit.entities;

public class CantidadT {
        private String banco;
        private String cantidad;

    public CantidadT() {
    }

    public CantidadT(String banco, String cantidad) {
        this.banco = banco;
        this.cantidad = cantidad;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}
