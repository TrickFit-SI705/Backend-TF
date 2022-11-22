package pe.edu.upc.trickfit.servicesinterfaces;

import pe.edu.upc.trickfit.entities.Alimento;

import java.util.List;
import java.util.Optional;

public interface IAlimentoService {
    public void insert(Alimento alimento);
    List<Alimento>list();
    public Optional<Alimento> listarId(int idAlimento);
    public void delete(int idAlimento);
    List<Alimento> search(String nombreAlimento);
}
