package pe.edu.upc.trickfit.servicesinterfaces;

import pe.edu.upc.trickfit.entities.ReporteEntrenador;
import pe.edu.upc.trickfit.entities.Rutina;

import java.util.List;
import java.util.Optional;

public interface IRutinaService {
    public boolean insertar(Rutina rutina);
    public void eliminar(int idRutina);
    List<Rutina> listar();
    Optional<Rutina> listarId(int idRutina);
    List<Rutina> buscarRutina(String tituloRutina);
    List<Rutina> buscarUsuario(String nombreUsuario);
    List<Rutina> buscarEntrenador(String nombreEntrenador);

    List<ReporteEntrenador> ReporteRutinaEntrenadores();
}
