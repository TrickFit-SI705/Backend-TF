package pe.edu.upc.trickfit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trickfit.entities.Alimento;
import pe.edu.upc.trickfit.entities.Banco;
import pe.edu.upc.trickfit.servicesinterfaces.IAlimentoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alimentos")
public class AlimentoController {
    @Autowired
    private IAlimentoService pService;

    @PostMapping
    public void registrar(@RequestBody Alimento a) {
        pService.insert(a);
    }

    @GetMapping
    public List<Alimento> listar() {
        return pService.list();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        pService.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody Alimento alimento) {
        pService.insert(alimento);
    }

    @PostMapping ("/buscar")
    public List<Alimento> buscar(@RequestBody Alimento alimento){
        List<Alimento> lista;
        alimento.setNombreAlimento(alimento.getNombreAlimento());
        lista=pService.search(alimento.getNombreAlimento());
        return lista;
    }

    @GetMapping("/{id}")
    public Optional<Alimento> listarId(@PathVariable("id") Integer id) {
        return pService.listarId(id);
    }
}
