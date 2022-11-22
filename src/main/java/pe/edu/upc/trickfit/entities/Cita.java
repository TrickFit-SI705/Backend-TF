package pe.edu.upc.trickfit.entities;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "Cita")
public class Cita implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCita;
    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "idEspecialista", nullable = false)
    private Usuario especialista;
    @Column(name = "fechaCita")
    @JsonSerialize(using = ToStringSerializer.class)
    private LocalDate fechaCita;
    @Column(name = "horaCita")
    private String horaCita;

    public Cita() {
    }

    public Cita(int idCita, Usuario usuario, Usuario especialista, LocalDate fechaCita, String horaCita) {
        this.idCita = idCita;
        this.usuario = usuario;
        this.especialista = especialista;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getEspecialista() {
        return especialista;
    }

    public void setEspecialista(Usuario especialista) {
        this.especialista = especialista;
    }

    public LocalDate getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(LocalDate fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(String horaCita) {
        this.horaCita = horaCita;
    }
}
