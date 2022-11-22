package pe.edu.upc.trickfit.servicesinterfaces;

import pe.edu.upc.trickfit.entities.Pregunta;
import pe.edu.upc.trickfit.entities.RespuestaEspecialistas;

import java.util.List;
import java.util.Optional;

public interface IPreguntaService {
    public boolean insertar(Pregunta pregunta);
    public void eliminar(int idPregunta);
    List<Pregunta> listar();
    Optional<Pregunta> listarId(int idPregunta);
    List<Pregunta> buscarPregunta(String tituloPregunta);
    List<Pregunta> buscarUsuario(String nombreUsuario);

    List<RespuestaEspecialistas> buscarCantidadPropietario();
}
