package pe.edu.upc.trickfit.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Pregunta")
public class Pregunta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPregunta;
    @Column(name = "tituloPregunta", length = 30, nullable = false)
    private String tituloPregunta;
    @Column(name = "contenidoPregunta", length = 100, nullable = false)
    private String contenidoPregunta;
    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario usuario;
    @Column(name = "respuestaPregunta", length = 500)
    private String respuestaPregunta;

    public Pregunta() {
    }

    public Pregunta(int idPregunta, String tituloPregunta, String contenidoPregunta, Usuario usuario, String respuestaPregunta) {
        this.idPregunta = idPregunta;
        this.tituloPregunta = tituloPregunta;
        this.contenidoPregunta = contenidoPregunta;
        this.usuario = usuario;
        this.respuestaPregunta = respuestaPregunta;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public String getTituloPregunta() {
        return tituloPregunta;
    }

    public void setTituloPregunta(String tituloPregunta) {
        this.tituloPregunta = tituloPregunta;
    }

    public String getContenidoPregunta() {
        return contenidoPregunta;
    }

    public void setContenidoPregunta(String contenidoPregunta) {
        this.contenidoPregunta = contenidoPregunta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getRespuestaPregunta() {
        return respuestaPregunta;
    }

    public void setRespuestaPregunta(String respuestaPregunta) {
        this.respuestaPregunta = respuestaPregunta;
    }
}
