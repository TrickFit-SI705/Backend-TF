package pe.edu.upc.trickfit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trickfit.entities.Ejercicio;

import java.util.List;

@Repository
public interface IEjercicioRepository extends JpaRepository<Ejercicio, Integer> {
    @Query("from Ejercicio j where j.tituloEjercicio like %:tituloEjercicio%")
    List<Ejercicio> search(@Param("tituloEjercicio") String tituloEjercicio);
}
