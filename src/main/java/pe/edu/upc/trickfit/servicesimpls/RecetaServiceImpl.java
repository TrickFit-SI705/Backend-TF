package pe.edu.upc.trickfit.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trickfit.entities.Receta;
import pe.edu.upc.trickfit.repositories.IRecetaRepository;
import pe.edu.upc.trickfit.servicesinterfaces.IRecetaService;

import java.util.List;
import java.util.Optional;

@Service
public class RecetaServiceImpl implements IRecetaService {
    @Autowired
    private IRecetaRepository rR;

    @Override
    public void insert(Receta receta) {
        rR.save(receta);
    }

    @Override
    public List<Receta> list() {
        return rR.findAll();
    }

    @Override
    public Optional<Receta> listarId(int idReceta) {
        return rR.findById(idReceta);
    }

    @Override
    public void delete(int idReceta) {
        rR.deleteById(idReceta);
    }

    @Override
    public List<Receta> search(String tituloReceta) {
        return rR.search(tituloReceta);
    }
}
