package pe.edu.upc.trickfit.servicesinterfaces;

import pe.edu.upc.trickfit.entities.Dieta;
import pe.edu.upc.trickfit.entities.DietasRecomendadas;

import java.util.List;
import java.util.Optional;

public interface IDietaService {
    public boolean insertar(Dieta dieta);
    public void eliminar(int idDieta);
    List<Dieta> listar();
    Optional<Dieta> listarId(int idDieta);
    List<Dieta> buscarDieta(String tituloDieta);
    List<Dieta> buscarUsuario(String nombreUsuario);
    List<Dieta> buscarNutricionista(String nombreNutricionista);

    List<DietasRecomendadas> buscarDietasrecomendadasNutricionistas();
}
