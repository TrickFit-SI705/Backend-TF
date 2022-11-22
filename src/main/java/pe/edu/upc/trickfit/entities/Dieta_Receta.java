package pe.edu.upc.trickfit.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Dieta_Receta")
public class Dieta_Receta implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDieta_Receta;
    @ManyToOne
    @JoinColumn(name = "idDieta", nullable = false)
    private Dieta dieta;
    @ManyToOne
    @JoinColumn(name = "idReceta", nullable = false)
    private Receta receta;

    public Dieta_Receta() {
    }

    public Dieta_Receta(int idDieta_Receta, Dieta dieta, Receta receta) {
        this.idDieta_Receta = idDieta_Receta;
        this.dieta = dieta;
        this.receta = receta;
    }

    public int getIdDieta_Receta() {
        return idDieta_Receta;
    }

    public void setIdDieta_Receta(int idDieta_Receta) {
        this.idDieta_Receta = idDieta_Receta;
    }

    public Dieta getDieta() {
        return dieta;
    }

    public void setDieta(Dieta dieta) {
        this.dieta = dieta;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }
}
