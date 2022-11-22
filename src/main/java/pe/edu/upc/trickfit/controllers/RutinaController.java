package pe.edu.upc.trickfit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trickfit.entities.ReporteEntrenador;
import pe.edu.upc.trickfit.entities.Rutina;
import pe.edu.upc.trickfit.servicesinterfaces.IRutinaService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rutinas")
public class RutinaController {

    @Autowired
    private IRutinaService pService;

    @PostMapping
    public void registrar(@RequestBody Rutina r) {
        pService.insertar(r);
    }

    @GetMapping
    public List<Rutina> listar() {
        return pService.listar();
    }

    @PutMapping
    public void modificar(@RequestBody Rutina r) {
        pService.insertar(r);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        pService.eliminar(id);
    }

    @PostMapping("/buscar")
    public List<Rutina> buscar(@RequestBody Rutina r) throws ParseException {

        List<Rutina> listaRutinas;
        listaRutinas = pService.buscarRutina(r.getTituloRutina());
        /*if (listaRutinas.isEmpty()) {
            listaRutinas = pService.buscarUsuario(r.getUsuario().getNombreUsuario());
            if (listaRutinas.isEmpty()) {
                listaRutinas = pService.buscarEntrenador(r.getEntrenador().getNombreUsuario());
            }
        }*/
        return listaRutinas;

    }
    @GetMapping("/{id}")
    public Optional<Rutina> listarId(@PathVariable("id") Integer id) {
        return pService.listarId(id);
    }

    @GetMapping ("/reporte")
    public List <ReporteEntrenador> ReporteRutinaEntrenadores () {
        return this.pService.ReporteRutinaEntrenadores();
    }
}
