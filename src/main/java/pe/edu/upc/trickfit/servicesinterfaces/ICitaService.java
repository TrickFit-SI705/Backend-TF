package pe.edu.upc.trickfit.servicesinterfaces;

import pe.edu.upc.trickfit.entities.Cita;

import java.util.List;
import java.util.Optional;

public interface ICitaService {
    public boolean insertar(Cita cita);
    public void eliminar(int idCita);
    List<Cita> listar();
    Optional<Cita> listarId(int idCita);
    List<Cita> buscarUsuario(String nombreUsuario);
    List<Cita> buscarEspecialista(String nombreEspecialista);
}
