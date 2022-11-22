package pe.edu.upc.trickfit.servicesinterfaces;

import pe.edu.upc.trickfit.entities.CantidadT;
import pe.edu.upc.trickfit.entities.Tarjeta;

import java.util.List;
import java.util.Optional;

public interface ITarjetaService {
    public boolean insertar(Tarjeta tarjeta);
    public void eliminar(int idTarjeta);
    List<Tarjeta> listar();
    Optional<Tarjeta> listarId(int idTarjeta);
    List<Tarjeta> buscarTarjeta(String numeroTarjeta);
    List<Tarjeta> buscarBanco(String nombreBanco);

    List<CantidadT> buscarcantidaddetarjetasporbanco();
}
