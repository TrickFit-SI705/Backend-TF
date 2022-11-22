package pe.edu.upc.trickfit.servicesinterfaces;

import pe.edu.upc.trickfit.entities.Dieta_Receta;

import java.util.List;
import java.util.Optional;

public interface IDieta_RecetaService {
    public boolean insertar(Dieta_Receta dieta_receta);
    public void eliminar(int idDieta_Receta);
    List<Dieta_Receta> listar();
    Optional<Dieta_Receta> listarId(int idDieta_Receta);
    List<Dieta_Receta> buscarDieta(String tituloDieta);
    List<Dieta_Receta> buscarReceta(String tituloReceta);
}
