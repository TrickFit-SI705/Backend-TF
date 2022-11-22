package pe.edu.upc.trickfit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trickfit.entities.KcalBean;
import pe.edu.upc.trickfit.entities.Receta_Alimento;

import java.util.List;

@Repository
public interface IReceta_AlimentoRepository extends JpaRepository<Receta_Alimento, Integer> {



}
