package pe.edu.upc.trickfit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trickfit.entities.Suscripcion;

import java.util.List;

@Repository
public interface ISuscripcionRepository extends JpaRepository<Suscripcion, Integer> {
    @Query("from Suscripcion s where s.plan.nombrePlan like %:nombrePlan%")
    List<Suscripcion> buscarPlan(@Param("nombrePlan") String nombrePlan);
    @Query("from Suscripcion s where s.tarjeta.numeroTarjeta like %:numeroTarjeta%")
    List<Suscripcion> buscarTarjeta(@Param("numeroTarjeta") String numeroTarjeta);

    @Query("from Suscripcion s where s.usuario.nombreUsuario like %:nombreUsuario%")
    List<Suscripcion> buscarUsuario(@Param("nombreUsuario") String nombreUsuario);

    @Query(value="select p.nombre_plan, EXTRACT(MONTH from s.fecha_suscripcion) as mes,count(s.id_suscripcion)\n" +
            "from plan p inner join suscripcion s on p.id_plan=s.id_plan \n" +
            "group by p.nombre_plan, EXTRACT(MONTH from s.fecha_suscripcion)",nativeQuery = true)
    List<String[]>buscarcantidadesuscripcionesporplan();

    List<Suscripcion> findByFechaSuscripcion(String valor);
}
