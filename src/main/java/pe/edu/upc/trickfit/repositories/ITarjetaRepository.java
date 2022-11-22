package pe.edu.upc.trickfit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trickfit.entities.Tarjeta;

import java.util.List;

@Repository
public interface ITarjetaRepository extends JpaRepository<Tarjeta, Integer> {

@Query("from Tarjeta t where t.numeroTarjeta like %:numeroTarjeta%")
    List<Tarjeta> buscarTarjeta(@Param("numeroTarjeta") String numeroTarjeta);

    @Query("from Tarjeta t where t.banco.nombreBanco like %:nombreBanco%")
    List<Tarjeta> buscarBanco(@Param("nombreBanco") String nombreBanco);

    @Query(value="select b.nombre_banco,count(t.id_tarjeta) from banco b inner join tarjeta t on b.id_banco=t.id_banco group by b.nombre_banco",nativeQuery = true)
    List<String[]>buscarcantidaddetarjetasporbanco();

    List<Tarjeta> findByBanco(String valor);
}
