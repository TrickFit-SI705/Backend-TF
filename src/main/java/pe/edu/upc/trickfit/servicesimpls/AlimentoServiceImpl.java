package pe.edu.upc.trickfit.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trickfit.entities.Alimento;
import pe.edu.upc.trickfit.repositories.IAlimentoRepository;
import pe.edu.upc.trickfit.servicesinterfaces.IAlimentoService;

import java.util.List;
import java.util.Optional;

@Service
public class AlimentoServiceImpl implements IAlimentoService {
    @Autowired
    private IAlimentoRepository aR;

    @Override
    public void insert(Alimento alimento) {
        aR.save(alimento);
    }

    @Override
    public List<Alimento> list() {
        return aR.findAll();
    }

    @Override
    public Optional<Alimento> listarId(int idAlimento) {
        return aR.findById(idAlimento);
    }

    @Override
    public void delete(int idAlimento) {
        aR.deleteById(idAlimento);
    }

    @Override
    public List<Alimento> search(String nombreAlimento) {
        return aR.search(nombreAlimento);
    }
}
