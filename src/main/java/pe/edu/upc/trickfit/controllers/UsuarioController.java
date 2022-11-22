package pe.edu.upc.trickfit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trickfit.entities.Respuesta_UQ1;
import pe.edu.upc.trickfit.entities.Respuesta_UQ2;
import pe.edu.upc.trickfit.entities.Usuario;
import pe.edu.upc.trickfit.servicesinterfaces.IUsuarioService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private IUsuarioService pService;

    @PostMapping
    public void registrar(@RequestBody Usuario u) {
        pService.insertar(u);
    }

    @GetMapping
    public List<Usuario> listar() {
        return pService.listar();
    }

    @PutMapping
    public void modificar(@RequestBody Usuario u) {
        pService.insertar(u);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        pService.eliminar(id);
    }

    @PostMapping("/buscardni")
    public List<Usuario> buscarDNI(@RequestBody String dni) {
        return pService.buscarDni(dni);
    }

    @GetMapping("/{id}")
    public Optional<Usuario> listarId(@PathVariable("id") Integer id) {
        return pService.listarId(id);
    }

    @GetMapping("/reporte1")
    public List<Respuesta_UQ1> buscarUsuariosSobrepeso() {
        return pService.buscarUsuarioSobrepeso();
    }

    @GetMapping("/reporte2")
    public List<Respuesta_UQ2> buscarAlimentoMasConsumido() {
        return pService.buscarAlimentoMasConsumido();
    }

}
