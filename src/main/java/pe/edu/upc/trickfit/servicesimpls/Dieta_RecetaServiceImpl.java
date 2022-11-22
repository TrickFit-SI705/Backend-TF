package pe.edu.upc.trickfit.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.trickfit.entities.Dieta_Receta;
import pe.edu.upc.trickfit.repositories.IDieta_RecetaRepository;
import pe.edu.upc.trickfit.servicesinterfaces.IDieta_RecetaService;

import java.util.List;
import java.util.Optional;

@Service
public class Dieta_RecetaServiceImpl implements IDieta_RecetaService {

    @Autowired
    IDieta_RecetaRepository drR;

    @Override
    @Transactional
    public boolean insertar(Dieta_Receta dieta_receta) {
        Dieta_Receta objDR = drR.save(dieta_receta);
        if (objDR == null) {
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    @Transactional
    public void eliminar(int idDieta_Receta) {
        drR.deleteById(idDieta_Receta);
    }

    @Override
    public List<Dieta_Receta> listar() {
        return drR.findAll();
    }

    @Override
    public Optional<Dieta_Receta> listarId(int idDieta_Receta) {
        return drR.findById(idDieta_Receta);
    }

    @Override
    public List<Dieta_Receta> buscarDieta(String tituloDieta) {
        return drR.buscarDieta(tituloDieta);
    }

    @Override
    public List<Dieta_Receta> buscarReceta(String tituloReceta) {
        return drR.buscarReceta(tituloReceta);
    }
}
