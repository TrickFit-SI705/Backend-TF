package pe.edu.upc.trickfit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trickfit.entities.PlanUsuarioBean;
import pe.edu.upc.trickfit.entities.Tipo_usuario;

import java.util.List;

@Repository
public interface ITipo_usuarioRepository extends JpaRepository<Tipo_usuario, Integer> {
@Query("from Tipo_usuario p where  p.nombreTipoUsuario like %:nombreTipoUsuario%")
    List<Tipo_usuario> search(@Param("nombreTipoUsuario") String nombreTipoUsuario);

    @Query(value="select tp.nombre_tipo_usuario,count(u.id_usuario) as numerousuarios  from usuario u inner join tipo_usuario tp ON tp.id_tipo_usuario = u.id_tipo_usuario group by tp.nombre_tipo_usuario", nativeQuery = true)
    List<String[]> BuscarCantidadUsuarios();

    @Query(value = "select u.dni, u.nombre_usuario, c.fecha_cita\n" +
            "from tipo_usuario tu inner join usuario u on u.id_tipo_usuario = tu.id_tipo_usuario\n" +
            "inner join cita c on c.id_usuario = u.id_usuario\n" +
            "inner join suscripcion s on s.id_usuario = u.id_usuario\n" +
            "where tu.id_tipo_usuario = 2 and c.fecha_cita > (now()-INTERVAL '1 day')\n" +
            "and c.fecha_cita < (now() + INTERVAL '7 days')",nativeQuery = true )
    List<String[]> obtenerPlanUsuario ();

    List<Tipo_usuario> findByNombreTipoUsuario(String valor);
}
