package pe.edu.upc.trickfit.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trickfit.entities.Plan;
import pe.edu.upc.trickfit.entities.Planquery;
import pe.edu.upc.trickfit.entities.Respuesta_UQ2;
import pe.edu.upc.trickfit.repositories.IPlanRepository;
import pe.edu.upc.trickfit.servicesinterfaces.IPlanService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PlanServiceImpl implements IPlanService {
    @Autowired
    private IPlanRepository pR;

    @Override
    public void insert(Plan plan) {
        pR.save(plan);
    }

    @Override
    public List<Plan> list() {
        return pR.findAll();
    }

    @Override
    public Optional<Plan> listarId(int idPlan) {
        return pR.findById(idPlan);
    }

    @Override
    public void delete(int idPlan) {
        pR.deleteById(idPlan);
    }

    @Override
    public List<Plan> search(String nombrePlan) {
        return pR.search(nombrePlan);
    }

    @Override
    public List<Planquery> buscarTotalMetodosPago() {
        List<Planquery> lista = new ArrayList<>();
        pR.buscarPrecioPorPlan().forEach(y-> {
            Planquery pq = new Planquery();
            pq.setMetodo(y[0]);
            pq.setCantidad(y[1]);
            pq.setTotal(y[2]);
            lista.add(pq);
        });
        return lista;
    }
}
