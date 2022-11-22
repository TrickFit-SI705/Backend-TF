package pe.edu.upc.trickfit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trickfit.entities.PlanUsuarioBean;
import pe.edu.upc.trickfit.entities.ReporteTipousuario;
import pe.edu.upc.trickfit.entities.Tipo_usuario;
import pe.edu.upc.trickfit.servicesinterfaces.ITipo_usuarioService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tipo_usuarios")
public class Tipo_usuarioController {
    @Autowired
    private ITipo_usuarioService pService;

    @PostMapping
    public void registrar(@RequestBody Tipo_usuario tu) {
        pService.insert(tu);
    }

    @GetMapping
    public List<Tipo_usuario> listar() {
        return pService.list();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        pService.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody Tipo_usuario tipo_usuario){
        pService.insert(tipo_usuario);
    }

    @PostMapping("/buscar")
    public List<Tipo_usuario> buscar(@RequestBody Tipo_usuario tipo_usuario){
        List<Tipo_usuario> lista;
        tipo_usuario.setNombreTipoUsuario(tipo_usuario.getNombreTipoUsuario());
        lista= pService.search(tipo_usuario.getNombreTipoUsuario());
        return lista;
    }

    @GetMapping("/{id}")
    public Optional<Tipo_usuario> listarId(@PathVariable("id") Integer id) {
        return pService.listarId(id);
    }

    @GetMapping({"/reporte1"})
    public List<ReporteTipousuario> BuscarCantidadUsuarios () {
        return this.pService.BuscarCantidadUsuarios ();
    }

    @GetMapping("/reporte2")
    public List<PlanUsuarioBean> obtenerPlanUsuario() {
        return pService.obtenerPlanUsuario();
    }
}
