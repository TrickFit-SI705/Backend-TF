package pe.edu.upc.trickfit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trickfit.entities.Receta;

import java.util.List;

@Repository
public interface IRecetaRepository extends JpaRepository<Receta, Integer> {
    @Query("from Receta r where r.tituloReceta like %:tituloReceta%")
    List<Receta> search(@Param("tituloReceta") String tituloReceta);
}
