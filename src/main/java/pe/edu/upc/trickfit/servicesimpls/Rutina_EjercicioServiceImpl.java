package pe.edu.upc.trickfit.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.trickfit.entities.Rutina_Ejercicio;
import pe.edu.upc.trickfit.repositories.IRutina_EjercicioRepository;
import pe.edu.upc.trickfit.servicesinterfaces.IRutina_EjercicioService;

import java.util.List;
import java.util.Optional;

@Service
public class Rutina_EjercicioServiceImpl implements IRutina_EjercicioService {

    @Autowired
    private IRutina_EjercicioRepository reR;

    @Override
    @Transactional
    public boolean insertar(Rutina_Ejercicio rutina_ejercicio) {
        Rutina_Ejercicio objRE = reR.save(rutina_ejercicio);
        if (objRE==null) {
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    @Transactional
    public void eliminar(int idRutina_Ejercicio) {
        reR.deleteById(idRutina_Ejercicio);
    }

    @Override
    public List<Rutina_Ejercicio> listar() {
        return reR.findAll();
    }

    @Override
    public Optional<Rutina_Ejercicio> listarId(int idRutina_Ejercicio) {
        return reR.findById(idRutina_Ejercicio);
    }

    @Override
    public List<Rutina_Ejercicio> buscarRutina(String tituloRutina) {
        return reR.buscarRutina(tituloRutina);
    }

    @Override
    public List<Rutina_Ejercicio> buscarEjercicio(String tituloEjercicio) {
        return reR.buscarEjercicio(tituloEjercicio);
    }
}
