package pe.edu.upc.trickfit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trickfit.entities.Receta;
import pe.edu.upc.trickfit.servicesinterfaces.IRecetaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/recetas")
public class RecetaController {
    @Autowired
    private IRecetaService pService;

    @PostMapping
    public void registrar(@RequestBody Receta r) {
        pService.insert(r);
    }

    @GetMapping
    public List<Receta> listar() {
        return pService.list();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        pService.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody Receta receta) {
        pService.insert(receta);
    }

    @PostMapping("/buscar")
    public List<Receta> buscar(@RequestBody Receta receta) {
        List<Receta> lista;
        receta.setTituloReceta(receta.getTituloReceta());
        lista = pService.search(receta.getTituloReceta());
        return lista;
    }

    @GetMapping("/{id}")
    public Optional<Receta> listarId(@PathVariable("id") Integer id) {
        return pService.listarId(id);
    }
}
