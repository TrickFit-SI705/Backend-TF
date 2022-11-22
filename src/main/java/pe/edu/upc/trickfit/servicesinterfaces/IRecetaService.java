package pe.edu.upc.trickfit.servicesinterfaces;

import pe.edu.upc.trickfit.entities.Receta;
import pe.edu.upc.trickfit.entities.Tipo_usuario;

import java.util.List;
import java.util.Optional;

public interface IRecetaService {
    public void insert(Receta receta);
    List<Receta>list();
    public Optional<Receta> listarId(int idReceta);
    public void delete(int idReceta);
    List<Receta> search(String tituloReceta);
}
