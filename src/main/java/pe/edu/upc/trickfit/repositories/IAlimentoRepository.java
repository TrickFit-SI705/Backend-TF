package pe.edu.upc.trickfit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trickfit.entities.Alimento;

import java.util.List;

@Repository
public interface IAlimentoRepository extends JpaRepository<Alimento, Integer> {
    @Query("from Alimento a where a.nombreAlimento like %:nombreAlimento%")
    List<Alimento> search(@Param("nombreAlimento") String nombreAlimento);

    List<Alimento> findByNombreAlimento(String valor);
}
