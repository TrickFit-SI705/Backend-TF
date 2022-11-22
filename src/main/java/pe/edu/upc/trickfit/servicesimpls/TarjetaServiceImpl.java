package pe.edu.upc.trickfit.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.trickfit.entities.CantidadT;
import pe.edu.upc.trickfit.entities.Tarjeta;
import pe.edu.upc.trickfit.repositories.ITarjetaRepository;
import pe.edu.upc.trickfit.servicesinterfaces.ITarjetaService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TarjetaServiceImpl implements ITarjetaService {

    @Autowired
    private ITarjetaRepository tR;

    @Override
    @Transactional
    public boolean insertar(Tarjeta tarjeta) {
        Tarjeta objTarjeta = tR.save(tarjeta);
        if(objTarjeta==null){
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    @Transactional
    public void eliminar(int idTarjeta) {
        tR.deleteById(idTarjeta);
    }

    @Override
    public List<Tarjeta> listar() {
        return tR.findAll();
    }

    @Override
    public Optional<Tarjeta> listarId(int idTarjeta) {
        return tR.findById(idTarjeta);
    }

    @Override
    public List<Tarjeta> buscarTarjeta(String numeroTarjeta) {
        return tR.buscarTarjeta(numeroTarjeta);
    }

    @Override
    public List<Tarjeta> buscarBanco(String nombreBanco) {
        return tR.buscarBanco(nombreBanco);
    }

    @Override
    public List<CantidadT> buscarcantidaddetarjetasporbanco() {
        List<CantidadT> Lista=new ArrayList<>();
        tR.buscarcantidaddetarjetasporbanco().forEach(y->{
            CantidadT c = new CantidadT();
            c.setBanco(y[0]);
            c.setCantidad(y[1]);
            Lista.add(c);
        });
        return  Lista;
    }
}
