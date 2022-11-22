package pe.edu.upc.trickfit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trickfit.entities.Dieta_Receta;
import pe.edu.upc.trickfit.servicesinterfaces.IDieta_RecetaService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/dietas-recetas")
public class Dieta_RecetaController {

    @Autowired
    private IDieta_RecetaService pService;

    @PostMapping
    public void registrar(@RequestBody Dieta_Receta dr) {
        pService.insertar(dr);
    }

    @GetMapping
    public List<Dieta_Receta> listar() {
        return pService.listar();
    }

    @PutMapping
    public void modificar(@RequestBody Dieta_Receta dr) {
        pService.insertar(dr);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        pService.eliminar(id);
    }

    @PostMapping("/buscar")
    public List<Dieta_Receta> buscar(@RequestBody Dieta_Receta dr) throws ParseException {

        List<Dieta_Receta> listaDieta_recetas;
        listaDieta_recetas = pService.buscarDieta(dr.getDieta().getTituloDieta());
        if (listaDieta_recetas.isEmpty()) {

            listaDieta_recetas = pService.buscarReceta(dr.getReceta().getTituloReceta());
        }
        return listaDieta_recetas;

    }
    @GetMapping("/{id}")
    public Optional<Dieta_Receta> listarId(@PathVariable("id") Integer id) {
        return pService.listarId(id);
    }

}
