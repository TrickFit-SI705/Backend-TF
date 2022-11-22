package pe.edu.upc.trickfit.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.trickfit.entities.Cita;
import pe.edu.upc.trickfit.repositories.ICitaRepository;
import pe.edu.upc.trickfit.servicesinterfaces.ICitaService;

import java.util.List;
import java.util.Optional;

@Service
public class CitaServiceImpl implements ICitaService {

    @Autowired
    private ICitaRepository cR;

    @Override
    @Transactional
    public boolean insertar(Cita cita) {
        Cita objCita = cR.save(cita);
        if (objCita==null) {
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    @Transactional
    public void eliminar(int idCita) {
        cR.deleteById(idCita);
    }

    @Override
    public List<Cita> listar() {
        return cR.findAll();
    }

    @Override
    public Optional<Cita> listarId(int idCita) {
        return cR.findById(idCita);
    }

    @Override
    public List<Cita> buscarUsuario(String nombreUsuario) {
        return cR.buscarUsuario(nombreUsuario);
    }

    @Override
    public List<Cita> buscarEspecialista(String nombreEspecialista) {
        return cR.buscarEspecialista(nombreEspecialista);
    }
}
