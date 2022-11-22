package pe.edu.upc.trickfit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trickfit.entities.Dieta_Receta;

import java.util.List;

@Repository
public interface IDieta_RecetaRepository extends JpaRepository<Dieta_Receta, Integer> {
    @Query("from Dieta_Receta dr where dr.dieta.tituloDieta like %:tituloDieta%")
    List<Dieta_Receta> buscarDieta(@Param("tituloDieta") String tituloDieta);

    @Query("from Dieta_Receta dr where dr.receta.tituloReceta like %:tituloReceta%")
    List<Dieta_Receta> buscarReceta(@Param("tituloReceta") String tituloReceta);
}
