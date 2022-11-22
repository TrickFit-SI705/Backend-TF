package pe.edu.upc.trickfit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trickfit.entities.Rutina_Ejercicio;

import java.util.List;

@Repository
public interface IRutina_EjercicioRepository extends JpaRepository<Rutina_Ejercicio, Integer> {
    @Query("from Rutina_Ejercicio re where re.rutina.tituloRutina like %:tituloRutina%")
    List<Rutina_Ejercicio> buscarRutina(@Param("tituloRutina") String tituloRutina);

    @Query("from Rutina_Ejercicio re where re.ejercicio.tituloEjercicio like %:tituloEjercicio%")
    List<Rutina_Ejercicio> buscarEjercicio(@Param("tituloEjercicio") String tituloEjercicio);
}
