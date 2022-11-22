package pe.edu.upc.trickfit.entities;

import javax.persistence.*;

@Entity
@Table(name = "Receta")
public class Receta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReceta;
    @Column(name = "tituloReceta", length = 30, nullable = false)
    private String tituloReceta;
    @Column(name = "descripReceta", length = 500, nullable = false)
    private String descripReceta;

    public Receta() {
    }

    public Receta(int idReceta, String tituloReceta, String descripReceta) {
        this.idReceta = idReceta;
        this.tituloReceta = tituloReceta;
        this.descripReceta = descripReceta;
    }

    public int getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(int idReceta) {
        this.idReceta = idReceta;
    }

    public String getTituloReceta() {
        return tituloReceta;
    }

    public void setTituloReceta(String tituloReceta) {
        this.tituloReceta = tituloReceta;
    }

    public String getDescripReceta() {
        return descripReceta;
    }

    public void setDescripReceta(String descripReceta) {
        this.descripReceta = descripReceta;
    }
}
