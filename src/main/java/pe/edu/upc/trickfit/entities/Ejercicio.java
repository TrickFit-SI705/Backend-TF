package pe.edu.upc.trickfit.entities;

import javax.persistence.*;

@Entity
@Table(name = "Ejercicio")
public class Ejercicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEjercicio;
    @Column(name = "tituloEjercicio", length = 30, nullable = false)
    private String tituloEjercicio;
    @Column(name = "descripEjercicio", length = 500, nullable = false)
    private String descripEjercicio;

    public Ejercicio() {
    }

    public Ejercicio(int idEjercicio, String tituloEjercicio, String descripEjercicio) {
        this.idEjercicio = idEjercicio;
        this.tituloEjercicio = tituloEjercicio;
        this.descripEjercicio = descripEjercicio;
    }

    public int getIdEjercicio() {
        return idEjercicio;
    }

    public void setIdEjercicio(int idEjercicio) {
        this.idEjercicio = idEjercicio;
    }

    public String getTituloEjercicio() {
        return tituloEjercicio;
    }

    public void setTituloEjercicio(String tituloEjercicio) {
        this.tituloEjercicio = tituloEjercicio;
    }

    public String getDescripEjercicio() {
        return descripEjercicio;
    }

    public void setDescripEjercicio(String descripEjercicio) {
        this.descripEjercicio = descripEjercicio;
    }
}
