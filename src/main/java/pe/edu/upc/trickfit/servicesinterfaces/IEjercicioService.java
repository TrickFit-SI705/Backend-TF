package pe.edu.upc.trickfit.servicesinterfaces;

import pe.edu.upc.trickfit.entities.Ejercicio;

import java.util.List;
import java.util.Optional;

public interface IEjercicioService {
    public void insert(Ejercicio ejercicio);
    List<Ejercicio>list();
    public Optional<Ejercicio> listarId(int idEjercicio);
    public void delete(int idEjercicio);
    List<Ejercicio> search(String tituloEjercicio);
}
