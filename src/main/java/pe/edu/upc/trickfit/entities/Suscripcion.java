package pe.edu.upc.trickfit.entities;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "Suscripcion")
public class Suscripcion implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSuscripcion;
    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario usuario;
    @Column(name = "fechaSuscripcion")
    @JsonSerialize(using = ToStringSerializer.class)
    private LocalDate fechaSuscripcion;
    @ManyToOne
    @JoinColumn(name = "idTarjeta", nullable = false)
    private Tarjeta tarjeta;
    @ManyToOne
    @JoinColumn(name = "idPlan", nullable = false)
    private Plan plan;

    public Suscripcion() {
    }

    public Suscripcion(int idSuscripcion, Usuario usuario, LocalDate fechaSuscripcion, Tarjeta tarjeta, Plan plan) {
        this.idSuscripcion = idSuscripcion;
        this.usuario = usuario;
        this.fechaSuscripcion = fechaSuscripcion;
        this.tarjeta = tarjeta;
        this.plan = plan;
    }

    public int getIdSuscripcion() {
        return idSuscripcion;
    }

    public void setIdSuscripcion(int idSuscripcion) {
        this.idSuscripcion = idSuscripcion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDate getFechaSuscripcion() {
        return fechaSuscripcion;
    }

    public void setFechaSuscripcion(LocalDate fechaSuscripcion) {
        this.fechaSuscripcion = fechaSuscripcion;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }
}
