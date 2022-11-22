package pe.edu.upc.trickfit.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trickfit.entities.Ejercicio;
import pe.edu.upc.trickfit.repositories.IEjercicioRepository;
import pe.edu.upc.trickfit.servicesinterfaces.IEjercicioService;

import java.util.List;
import java.util.Optional;

@Service
public class EjercicioServiceImpl implements IEjercicioService {
    @Autowired
    private IEjercicioRepository eR;

    @Override
    public void insert(Ejercicio ejercicio) {
        eR.save(ejercicio);
    }

    @Override
    public List<Ejercicio> list() {
        return eR.findAll();
    }

    @Override
    public Optional<Ejercicio> listarId(int idEjercicio) {
        return eR.findById(idEjercicio);
    }

    @Override
    public void delete(int idEjercicio) {
        eR.deleteById(idEjercicio);
    }

    @Override
    public List<Ejercicio> search(String tituloEjercicio) {
        return eR.search(tituloEjercicio);
    }
}
