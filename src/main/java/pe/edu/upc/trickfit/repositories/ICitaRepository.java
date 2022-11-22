package pe.edu.upc.trickfit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trickfit.entities.Cita;

import java.util.List;

@Repository
public interface ICitaRepository extends JpaRepository<Cita, Integer> {
    @Query("from Cita c where c.usuario.nombreUsuario like %:nombreUsuario%")
    List<Cita> buscarUsuario(@Param("nombreUsuario") String nombreUsuario);

    @Query("from Cita c where c.especialista.nombreUsuario like %:nombreUsuario%")
    List<Cita> buscarEspecialista(@Param("nombreUsuario") String nombreUsuario);

    List<Cita> findByFechaCita(String valor);
}
