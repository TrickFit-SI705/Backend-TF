package pe.edu.upc.trickfit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trickfit.entities.Ejercicio;
import pe.edu.upc.trickfit.servicesinterfaces.IEjercicioService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ejercicios")
public class   EjercicioController {
    @Autowired
    private IEjercicioService pService;

    @PostMapping
    public void registrar(@RequestBody Ejercicio e) {
        pService.insert(e);
    }

    @GetMapping
    public List<Ejercicio> listar() {
        return pService.list();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        pService.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody Ejercicio ejercicio) {
        pService.insert(ejercicio);
    }

    @PostMapping("/buscar")
    public List<Ejercicio> buscar(@RequestBody Ejercicio ejercicio) {
        List<Ejercicio> lista;
        ejercicio.setTituloEjercicio(ejercicio.getTituloEjercicio());
        lista = pService.search(ejercicio.getTituloEjercicio());
        return lista;
    }

    @GetMapping("/{id}")
    public Optional<Ejercicio> listarId(@PathVariable("id") Integer id) {
        return pService.listarId(id);
    }
}
