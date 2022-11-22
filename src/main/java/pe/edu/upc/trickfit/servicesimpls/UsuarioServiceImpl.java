package pe.edu.upc.trickfit.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.trickfit.entities.Respuesta_UQ1;
import pe.edu.upc.trickfit.entities.Respuesta_UQ2;
import pe.edu.upc.trickfit.entities.Usuario;
import pe.edu.upc.trickfit.repositories.IUsuarioRepository;
import pe.edu.upc.trickfit.servicesinterfaces.IUsuarioService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    private IUsuarioRepository uR;

    @Override
    @Transactional
    public boolean insertar(Usuario usuario) {
        Usuario objUsuario = uR.save(usuario);
        if(objUsuario==null) {
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    @Transactional
    public void eliminar(int idUsuario) {
        uR.deleteById(idUsuario);
    }

    @Override
    public List<Usuario> listar() {
        return uR.findAll();
    }

    @Override
    public Optional<Usuario> listarId(int idUsuario) {
        return uR.findById(idUsuario);
    }

    @Override
    public List<Usuario> buscarDni(String dni) {
        return uR.findByDNI(dni);
    }

    @Override
    public List<Respuesta_UQ1> buscarUsuarioSobrepeso() {
        List<Respuesta_UQ1> lista = new ArrayList<>();
        uR.buscarUsuarioSobrepeso().forEach(y-> {
            Respuesta_UQ1 rq1 = new Respuesta_UQ1();
            rq1.setDni(y[0]);
            rq1.setNombre(y[1]);
            rq1.setImc(y[2]);
            rq1.setRutinas_asignadas(y[3]);
            lista.add(rq1);
        });
        return lista;
    }

    @Override
    public List<Respuesta_UQ2> buscarAlimentoMasConsumido() {
        List<Respuesta_UQ2> lista = new ArrayList<>();
        uR.buscarUsuarioAlimentoMasConsumido().forEach(y-> {
            Respuesta_UQ2 rq2 = new Respuesta_UQ2();
            rq2.setDni(y[0]);
            rq2.setNombre(y[1]);
            rq2.setAlimento(y[2]);
            rq2.setCantidad(y[3]);
            lista.add(rq2);
        });
        return lista;
    }
}
