package pe.edu.upc.trickfit.entities;

import javax.persistence.*;

@Entity
@Table(name = "Alimento")
public class Alimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAlimento;
    @Column(name = "nombreAlimento", length = 30, nullable = false)
    private String nombreAlimento;
    @Column(name = "kcalAlimento", nullable = false)
    private int kcalAlimento;

    public Alimento() {
    }

    public Alimento(int idAlimento, String nombreAlimento, int kcalAlimento) {
        this.idAlimento = idAlimento;
        this.nombreAlimento = nombreAlimento;
        this.kcalAlimento = kcalAlimento;
    }

    public int getIdAlimento() {
        return idAlimento;
    }

    public void setIdAlimento(int idAlimento) {
        this.idAlimento = idAlimento;
    }

    public String getNombreAlimento() {
        return nombreAlimento;
    }

    public void setNombreAlimento(String nombreAlimento) {
        this.nombreAlimento = nombreAlimento;
    }

    public int getKcalAlimento() {
        return kcalAlimento;
    }

    public void setKcalAlimento(int kcalAlimento) {
        this.kcalAlimento = kcalAlimento;
    }
}
