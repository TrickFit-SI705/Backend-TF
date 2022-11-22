package pe.edu.upc.trickfit.servicesinterfaces;

import pe.edu.upc.trickfit.entities.Rutina_Ejercicio;

import java.util.List;
import java.util.Optional;

public interface IRutina_EjercicioService {
    public boolean insertar(Rutina_Ejercicio rutina_ejercicio);
    public void eliminar(int idRutina_Ejercicio);
    List<Rutina_Ejercicio> listar();
    Optional<Rutina_Ejercicio> listarId(int idRutina_Ejercicio);
    List<Rutina_Ejercicio> buscarRutina(String tituloRutina);
    List<Rutina_Ejercicio> buscarEjercicio(String tituloEjercicio);
}
