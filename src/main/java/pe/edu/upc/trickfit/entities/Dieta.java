package pe.edu.upc.trickfit.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Dieta")
public class Dieta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDieta;
    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "idNutricionista", nullable = false)
    private Usuario nutricionista;
    @Column(name = "tituloDieta", length = 30, nullable = false)
    private String tituloDieta;
    @Column(name = "contenidoDieta", length = 500, nullable = false)
    private String contenidoDieta;
    @Column(name = "vigente", nullable = false)
    private boolean vigente;

    public Dieta() {
    }

    public Dieta(int idDieta, Usuario usuario, Usuario nutricionista, String tituloDieta, String contenidoDieta, boolean vigente) {
        this.idDieta = idDieta;
        this.usuario = usuario;
        this.nutricionista = nutricionista;
        this.tituloDieta = tituloDieta;
        this.contenidoDieta = contenidoDieta;
        this.vigente = vigente;
    }

    public int getIdDieta() {
        return idDieta;
    }

    public void setIdDieta(int idDieta) {
        this.idDieta = idDieta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getNutricionista() {
        return nutricionista;
    }

    public void setNutricionista(Usuario nutricionista) {
        this.nutricionista = nutricionista;
    }

    public String getTituloDieta() {
        return tituloDieta;
    }

    public void setTituloDieta(String tituloDieta) {
        this.tituloDieta = tituloDieta;
    }

    public String getContenidoDieta() {
        return contenidoDieta;
    }

    public void setContenidoDieta(String contenidoDieta) {
        this.contenidoDieta = contenidoDieta;
    }

    public boolean isVigente() {
        return vigente;
    }

    public void setVigente(boolean vigente) {
        this.vigente = vigente;
    }
}
