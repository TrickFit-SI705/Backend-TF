package pe.edu.upc.trickfit.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Rutina")
public class Rutina implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRutina;
    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "idEntrenador", nullable = false)
    private Usuario entrenador;
    @Column(name = "tituloRutina", length = 30, nullable = false)
    private String tituloRutina;
    @Column(name = "contenidoRutina", length = 500, nullable = false)
    private String contenidoRutina;
    @Column(name = "vigente", nullable = false)
    private boolean vigente;
    @Column(name = "nivelRutina", length = 20, nullable = false)
    private String nivelRutina;

    public Rutina() {
    }

    public Rutina(int idRutina, Usuario usuario, Usuario entrenador, String tituloRutina, String contenidoRutina, boolean vigente, String nivelRutina) {
        this.idRutina = idRutina;
        this.usuario = usuario;
        this.entrenador = entrenador;
        this.tituloRutina = tituloRutina;
        this.contenidoRutina = contenidoRutina;
        this.vigente = vigente;
        this.nivelRutina = nivelRutina;
    }

    public int getIdRutina() {
        return idRutina;
    }

    public void setIdRutina(int idRutina) {
        this.idRutina = idRutina;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Usuario entrenador) {
        this.entrenador = entrenador;
    }

    public String getTituloRutina() {
        return tituloRutina;
    }

    public void setTituloRutina(String tituloRutina) {
        this.tituloRutina = tituloRutina;
    }

    public String getContenidoRutina() {
        return contenidoRutina;
    }

    public void setContenidoRutina(String contenidoRutina) {
        this.contenidoRutina = contenidoRutina;
    }

    public boolean isVigente() {
        return vigente;
    }

    public void setVigente(boolean vigente) {
        this.vigente = vigente;
    }

    public String getNivelRutina() {
        return nivelRutina;
    }

    public void setNivelRutina(String nivelRutina) {
        this.nivelRutina = nivelRutina;
    }
}
