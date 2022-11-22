package pe.edu.upc.trickfit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trickfit.entities.Banco;

import java.util.List;

@Repository
public interface IBancoRepository extends JpaRepository<Banco, Integer> {
    @Query("from Banco b where b.nombreBanco like %:nombreBanco%")
    List<Banco> search(@Param("nombreBanco") String nombreBanco);

    List<Banco> findByNombreBanco(String valor);
}
