package pe.edu.upc.trickfit.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Receta_Alimento")
public class Receta_Alimento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReceta_Alimento;
    @ManyToOne
    @JoinColumn(name = "idReceta", nullable = false)
    private Receta receta;
    @ManyToOne
    @JoinColumn(name = "idAlimento", nullable = false)
    private Alimento alimento;

    public Receta_Alimento() {
    }

    public Receta_Alimento(int idReceta_Alimento, Receta receta, Alimento alimento) {
        this.idReceta_Alimento = idReceta_Alimento;
        this.receta = receta;
        this.alimento = alimento;
    }

    public int getIdReceta_Alimento() {
        return idReceta_Alimento;
    }

    public void setIdReceta_Alimento(int idReceta_Alimento) {
        this.idReceta_Alimento = idReceta_Alimento;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    public Alimento getAlimento() {
        return alimento;
    }

    public void setAlimento(Alimento alimento) {
        this.alimento = alimento;
    }
}
