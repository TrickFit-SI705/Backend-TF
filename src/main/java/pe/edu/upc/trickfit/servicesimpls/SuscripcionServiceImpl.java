package pe.edu.upc.trickfit.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.trickfit.entities.Cantidads;
import pe.edu.upc.trickfit.entities.Suscripcion;
import pe.edu.upc.trickfit.repositories.ISuscripcionRepository;
import pe.edu.upc.trickfit.servicesinterfaces.ISuscripcionService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SuscripcionServiceImpl implements ISuscripcionService {

    @Autowired
    private ISuscripcionRepository sR;

    @Override
    @Transactional
    public boolean insertar(Suscripcion suscripcion) {
        Suscripcion objSuscripcion = sR.save(suscripcion);
        if (objSuscripcion==null) {
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    @Transactional
    public void eliminar(int idSuscripcion) {
        sR.deleteById(idSuscripcion);
    }

    @Override
    public Optional<Suscripcion> listarId(int idSuscripcion) {
        return sR.findById(idSuscripcion);
    }

    @Override
    public List<Suscripcion> listar() {
        return sR.findAll();
    }

    @Override
    public List<Suscripcion> buscarUsuario(String nombreUsuario) {
        return sR.buscarUsuario(nombreUsuario);
    }

    @Override
    public List<Suscripcion> buscarTarjeta(String numeroTarjeta) {
        return sR.buscarTarjeta(numeroTarjeta);
    }

    @Override
    public List<Suscripcion> buscarPlan(String nombrePlan) {
        return sR.buscarPlan(nombrePlan);
    }

    @Override
    public List<Cantidads> buscarcantidadesuscripcionesporplan() {
        List<Cantidads> Lista=new ArrayList<>();
        sR.buscarcantidadesuscripcionesporplan().forEach(y->{
            Cantidads s = new Cantidads();
            s.setPlan(y[0]);
            s.setMes(y[1]);
            s.setCantidad(y[2]);
            Lista.add(s);
        });
        return  Lista;
    }
}
