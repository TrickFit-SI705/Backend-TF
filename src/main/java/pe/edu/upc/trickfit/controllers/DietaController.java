package pe.edu.upc.trickfit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trickfit.entities.Dieta;
import pe.edu.upc.trickfit.entities.DietasRecomendadas;
import pe.edu.upc.trickfit.servicesinterfaces.IDietaService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/dietas")
public class DietaController {
    @Autowired
    private IDietaService pService;

    @PostMapping
    private void registrar(@RequestBody Dieta d) {
        pService.insertar(d);
    }

    @GetMapping
    private List<Dieta> listar() {
        return pService.listar();
    }

    @PutMapping
    private void modificar(@RequestBody Dieta d) {
        pService.insertar(d);
    }

    @DeleteMapping("/{id}")
    private void eliminar(@PathVariable("id") Integer id) {
        pService.eliminar(id);
    }

    @PostMapping("/buscar")
    public List<Dieta> buscar(@RequestBody Dieta d) throws ParseException {

        List<Dieta> listaDietas;
        listaDietas = pService.buscarDieta(d.getTituloDieta());
        /*if (listaDietas.isEmpty()) {
            listaDietas = pService.buscarUsuario(d.getUsuario().getNombreUsuario());
            if (listaDietas.isEmpty()) {
                listaDietas = pService.buscarNutricionista(d.getNutricionista().getNombreUsuario());
            }
        }*/
        return listaDietas;

    }
    @GetMapping("/{id}")
    public Optional<Dieta> listarId(@PathVariable("id") Integer id) {
        return pService.listarId(id);
    }

    @GetMapping("/reporte")
    public List<DietasRecomendadas>buscarDietasRecomendadas(){
        return pService.buscarDietasrecomendadasNutricionistas();
    }
}
