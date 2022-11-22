package pe.edu.upc.trickfit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trickfit.entities.KcalBean;
import pe.edu.upc.trickfit.entities.Receta_Alimento;
import pe.edu.upc.trickfit.servicesinterfaces.IReceta_AlimentoService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/recetas-alimentos")
public class Receta_AlimentoController {

    @Autowired
    private IReceta_AlimentoService pService;

    @PostMapping
    public void registrar(@RequestBody Receta_Alimento ra) {
        pService.insertar(ra);
    }

    @GetMapping
    public List<Receta_Alimento> listar() {
        return pService.listar();
    }

    @PutMapping
    public void modificar(@RequestBody Receta_Alimento ra) {
        pService.insertar(ra);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        pService.eliminar(id);
    }

    @PostMapping("/buscar")
    public List<Receta_Alimento> buscar(@RequestBody Receta_Alimento ra) throws ParseException {

        List<Receta_Alimento> listaReceta_Alimentos;
        listaReceta_Alimentos = pService.buscarReceta(ra.getReceta().getTituloReceta());
        /*if (listaReceta_Alimentos.isEmpty()) {

            listaReceta_Alimentos = pService.buscarAlimento(ra.getAlimento().getNombreAlimento());
        }*/
        return listaReceta_Alimentos;

    }
    @GetMapping("/{id}")
    public Optional<Receta_Alimento> listarId(@PathVariable("id") Integer id) {
        return pService.listarId(id);
    }

    @GetMapping("/reporte")
    public  List<KcalBean> obtenerCaloriasReceta()
    {return pService.obtenerCaloriasReceta();}
}
