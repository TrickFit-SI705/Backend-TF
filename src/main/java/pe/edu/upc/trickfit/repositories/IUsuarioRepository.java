package pe.edu.upc.trickfit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trickfit.entities.Usuario;

import java.util.List;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
List<Usuario> findByDNI(String valor);

    @Query(value = "select u.dni, u.nombre_usuario, SUM(u.peso_usuario/(u.estatura_usuario/100.0)^2) as IMC,\n" +
            "count(r.id_rutina) as Rutinas_asignadas\n" +
            "from usuario u inner join rutina r ON r.id_usuario = u.id_usuario\n" +
            "group by u.dni, u.nombre_usuario\n" +
            "having SUM(u.peso_usuario/(u.estatura_usuario/100.0)^2) > 25", nativeQuery = true)
    List<String[]> buscarUsuarioSobrepeso();

    /* Vista para buscar alimento más consumido
    create VIEW vw_usuario_alimento as
    select u.dni, u.nombre_usuario, al.nombre_alimento, count(al.nombre_alimento)
    from usuario u inner join dieta d on d.id_usuario = u.id_usuario
    inner join dieta_receta dr on dr.id_dieta = d.id_dieta
    inner join receta r on r.id_receta = dr.id_receta
    inner join receta_alimento ra on ra.id_receta = r.id_receta
    inner join alimento al on al.id_alimento = ra.id_alimento
    group by u.dni, u.nombre_usuario, al.id_alimento
    */
    @Query(value = "select *\n" +
            "from vw_usuario_alimento vw\n" +
            "where vw.count = (select MAX(vw1.count)\n" +
            "\t\t\t\tfrom vw_usuario_alimento vw1\n" +
            "\t\t\t\twhere vw1.dni = vw.dni)", nativeQuery = true)
    List<String[]> buscarUsuarioAlimentoMasConsumido();
}
