package pe.edu.upc.trickfit.servicesinterfaces;

import pe.edu.upc.trickfit.entities.PlanUsuarioBean;
import pe.edu.upc.trickfit.entities.ReporteTipousuario;
import pe.edu.upc.trickfit.entities.Tipo_usuario;

import java.util.List;
import java.util.Optional;

public interface ITipo_usuarioService {
    public void insert(Tipo_usuario tipo_usuario);
    List<Tipo_usuario>list();
    public Optional<Tipo_usuario> listarId(int idTipoUsuario);
    public void delete(int idTipoUsuario);
    List<Tipo_usuario> search(String nombreTipoUsuario);

    List<ReporteTipousuario> BuscarCantidadUsuarios();

    public List<PlanUsuarioBean> obtenerPlanUsuario();
}
