package pe.edu.upc.trickfit.servicesinterfaces;

import pe.edu.upc.trickfit.entities.Banco;

import java.util.List;
import java.util.Optional;

public interface IBancoService {
    public void insert(Banco banco);
    List<Banco>list();
    public Optional<Banco> listarId(int idBanco);
    public void delete (int idBanco);

    List<Banco> search(String nombreBanco);
}
