package pe.edu.upc.trickfit.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.trickfit.entities.KcalBean;
import pe.edu.upc.trickfit.entities.Receta_Alimento;
import pe.edu.upc.trickfit.entities.Respuesta_UQ2;
import pe.edu.upc.trickfit.repositories.IReceta_AlimentoRepository;
import pe.edu.upc.trickfit.servicesinterfaces.IReceta_AlimentoService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class Receta_AlimentoServiceImpl implements IReceta_AlimentoService {

    @Autowired
    private IReceta_AlimentoRepository raR;

    @Override
    @Transactional
    public boolean insertar(Receta_Alimento receta_alimento) {
        Receta_Alimento objRA = raR.save(receta_alimento);
        if (objRA==null) {
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    @Transactional
    public void eliminar(int idReceta_Alimento) {
        raR.deleteById(idReceta_Alimento);
    }

    @Override
    public List<Receta_Alimento> listar() {
        return raR.findAll();
    }

    @Override
    public Optional<Receta_Alimento> listarId(int idReceta_Alimento) {
        return raR.findById(idReceta_Alimento);
    }
    @Override
    public List<Receta_Alimento> buscarReceta(String tituloReceta) {
        return raR.buscarReceta(tituloReceta);
    }

    @Override
    public List<Receta_Alimento> buscarAlimento(String nombreAlimento) {
        return raR.buscarAlimento(nombreAlimento);
    }

    @Override
    public List<KcalBean> obtenerCaloriasReceta() {
        List<KcalBean> lista = new ArrayList<>();
        raR.obtenerCaloriasReceta().forEach(y-> {
            KcalBean k = new KcalBean();
            k.setIdReceta_Alimento(y[0]);
            k.setTituloReceta(y[1]);
            k.setTotalCal(y[2]);
            lista.add(k);
        });
        return lista;
    }
}
