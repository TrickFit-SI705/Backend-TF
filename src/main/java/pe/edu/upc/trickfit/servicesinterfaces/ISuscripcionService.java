package pe.edu.upc.trickfit.servicesinterfaces;

import pe.edu.upc.trickfit.entities.Cantidads;
import pe.edu.upc.trickfit.entities.Suscripcion;

import java.util.List;
import java.util.Optional;

public interface ISuscripcionService {
    public boolean insertar(Suscripcion suscripcion);
    public void eliminar(int idSuscripcion);
    public Optional<Suscripcion> listarId(int idSuscripcion);
    List<Suscripcion> listar();
    List<Suscripcion> buscarUsuario(String nombreUsuario);
    List<Suscripcion> buscarTarjeta(String numeroTarjeta);
    List<Suscripcion> buscarPlan(String nombrePlan);

    List<Cantidads> buscarcantidadesuscripcionesporplan();
}
