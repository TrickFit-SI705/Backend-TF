package pe.edu.upc.trickfit.entities;

import javax.persistence.*;

@Entity
@Table(name = "Plan")
public class Plan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPlan;
    @Column(name = "nombrePlan", length = 30, nullable = false)
    private String nombrePlan;
    @Column(name = "detallesPlan", length = 500, nullable = false)
    private String detallesPlan;
    @Column(name = "tiempoPlan", nullable = false)
    private int tiempoPlan;
    @Column(name = "precioPlan", nullable = false)
    private float precioPlan;

    public Plan() {
    }

    public Plan(int idPlan, String nombrePlan, String detallesPlan, int tiempoPlan, float precioPlan) {
        this.idPlan = idPlan;
        this.nombrePlan = nombrePlan;
        this.detallesPlan = detallesPlan;
        this.tiempoPlan = tiempoPlan;
        this.precioPlan = precioPlan;
    }

    public int getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(int idPlan) {
        this.idPlan = idPlan;
    }

    public String getNombrePlan() {
        return nombrePlan;
    }

    public void setNombrePlan(String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }

    public String getDetallesPlan() {
        return detallesPlan;
    }

    public void setDetallesPlan(String detallesPlan) {
        this.detallesPlan = detallesPlan;
    }

    public int getTiempoPlan() {
        return tiempoPlan;
    }

    public void setTiempoPlan(int tiempoPlan) {
        this.tiempoPlan = tiempoPlan;
    }

    public float getPrecioPlan() {
        return precioPlan;
    }

    public void setPrecioPlan(float precioPlan) {
        this.precioPlan = precioPlan;
    }
}
