package pe.edu.upc.trickfit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trickfit.entities.Plan;

import java.util.List;

@Repository
public interface IPlanRepository extends JpaRepository<Plan, Integer> {
    @Query("from Plan p where p.nombrePlan like %:nombrePlan%")
    List<Plan> search(@Param("nombrePlan") String nombrePlan);

    @Query(value = "select b.nombre_banco, COUNT(s.id_suscripcion) as QSuscripciones, SUM(pl.precio_plan * pl.tiempo_plan) as Total\n" +
            "from plan pl inner join suscripcion s on pl.id_plan = s.id_plan\n" +
            "inner join tarjeta tr on tr.id_tarjeta = s.id_tarjeta\n" +
            "inner join banco b on b.id_banco = tr.id_banco\n" +
            "group by b.nombre_banco, pl.nombre_plan", nativeQuery = true)
    List<String[]> buscarPrecioPorPlan();
}
