package pe.edu.upc.trickfit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trickfit.entities.Dieta;

import java.util.List;

@Repository
public interface IDietaRepository extends JpaRepository<Dieta, Integer> {
    @Query("from Dieta d where d.tituloDieta like %:tituloDieta%")
    List<Dieta> buscarDieta(@Param("tituloDieta") String tituloDieta);

    @Query("from Dieta d where d.usuario.nombreUsuario like %:nombreUsuario%")
    List<Dieta> buscarUsuario(@Param("nombreUsuario") String nombreUsuario);
    @Query("from Dieta d where d.nutricionista.nombreUsuario like %:nombreUsuario%")
    List<Dieta> buscarNutricionista(@Param("nombreUsuario") String nombreUsuario);

    @Query(value = "select u.nombre_tipo_usuario, us.nombre_usuario, d.titulo_dieta,count(d.titulo_dieta) as Recomendaciones from tipo_usuario u inner join usuario us on us.id_tipo_usuario = u.id_tipo_usuario inner join dieta d on d.id_nutricionista = us.id_usuario where u.nombre_tipo_usuario like '%Nutricionista%' group by u.nombre_tipo_usuario,d.titulo_dieta,us.nombre_usuario",nativeQuery = true)
    List<String[]>buscarDietasrecomendadasNutricionistas();
}
