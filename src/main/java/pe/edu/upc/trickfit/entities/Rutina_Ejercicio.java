package pe.edu.upc.trickfit.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Rutina_Ejercicio")
public class Rutina_Ejercicio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRutina_Ejercicio;
    @ManyToOne
    @JoinColumn(name = "idRutina", nullable = false)
    private Rutina rutina;
    @ManyToOne
    @JoinColumn(name = "idEjercicio", nullable = false)
    private Ejercicio ejercicio;

    public Rutina_Ejercicio() {
    }

    public Rutina_Ejercicio(int idRutina_Ejercicio, Rutina rutina, Ejercicio ejercicio) {
        this.idRutina_Ejercicio = idRutina_Ejercicio;
        this.rutina = rutina;
        this.ejercicio = ejercicio;
    }

    public int getIdRutina_Ejercicio() {
        return idRutina_Ejercicio;
    }

    public void setIdRutina_Ejercicio(int idRutina_Ejercicio) {
        this.idRutina_Ejercicio = idRutina_Ejercicio;
    }

    public Rutina getRutina() {
        return rutina;
    }

    public void setRutina(Rutina rutina) {
        this.rutina = rutina;
    }

    public Ejercicio getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(Ejercicio ejercicio) {
        this.ejercicio = ejercicio;
    }
}
