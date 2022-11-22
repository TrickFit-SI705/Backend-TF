package pe.edu.upc.trickfit.servicesinterfaces;

import pe.edu.upc.trickfit.entities.KcalBean;
import pe.edu.upc.trickfit.entities.Receta_Alimento;

import java.util.List;
import java.util.Optional;

public interface IReceta_AlimentoService {
    public boolean insertar(Receta_Alimento receta_alimento);
    public void eliminar(int idReceta_Alimento);
    List<Receta_Alimento> listar();
    Optional<Receta_Alimento> listarId(int idReceta_Alimento);
    List<Receta_Alimento> buscarReceta(String tituloReceta);
    List<Receta_Alimento> buscarAlimento(String nombreAlimento);

    List<KcalBean> obtenerCaloriasReceta();
}
