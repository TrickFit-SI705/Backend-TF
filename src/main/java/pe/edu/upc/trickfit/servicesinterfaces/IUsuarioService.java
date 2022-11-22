package pe.edu.upc.trickfit.servicesinterfaces;

import pe.edu.upc.trickfit.entities.Respuesta_UQ1;
import pe.edu.upc.trickfit.entities.Respuesta_UQ2;
import pe.edu.upc.trickfit.entities.Usuario;

import java.util.List;
import java.util.Optional;

public interface IUsuarioService {
    public boolean insertar(Usuario usuario);
    public void eliminar(int idUsuario);
    List<Usuario> listar();
    Optional<Usuario> listarId(int idUsuario);
    List<Usuario> buscarDni(String dni);

    List<Respuesta_UQ1> buscarUsuarioSobrepeso();

    List<Respuesta_UQ2> buscarAlimentoMasConsumido();
}
