package pe.edu.upc.trickfit.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Tarjeta")
public class Tarjeta implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTarjeta;
    @Column(name = "numeroTarjeta", length = 16, nullable = false)
    private String numeroTarjeta;
    @ManyToOne
    @JoinColumn(name = "idBanco", nullable = false)
    private Banco banco;

    public Tarjeta() {
    }

    public Tarjeta(int idTarjeta, String numeroTarjeta, Banco banco) {
        this.idTarjeta = idTarjeta;
        this.numeroTarjeta = numeroTarjeta;
        this.banco = banco;
    }

    public int getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(int idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
}
