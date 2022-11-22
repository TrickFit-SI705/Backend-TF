package pe.edu.upc.trickfit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trickfit.entities.Rutina_Ejercicio;
import pe.edu.upc.trickfit.servicesinterfaces.IRutina_EjercicioService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rutinas-ejercicios")
public class Rutina_EjercicioController {

    @Autowired
    private IRutina_EjercicioService pService;

    @PostMapping
    public void registrar(@RequestBody Rutina_Ejercicio re) {
        pService.insertar(re);
    }

    @GetMapping
    public List<Rutina_Ejercicio> listar() {
        return pService.listar();
    }

    @PutMapping
    public void modificar(@RequestBody Rutina_Ejercicio re) {
        pService.insertar(re);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        pService.eliminar(id);
    }

    @PostMapping("/buscar")
    public List<Rutina_Ejercicio> buscar(@RequestBody Rutina_Ejercicio re) throws ParseException {

        List<Rutina_Ejercicio> listaRutinaEjercicios;
        listaRutinaEjercicios = pService.buscarRutina(re.getRutina().getTituloRutina());
        /*if (listaRutinaEjercicios.isEmpty()) {

            listaRutinaEjercicios = pService.buscarEjercicio(re.getEjercicio().getTituloEjercicio());
        }*/
        return listaRutinaEjercicios;

    }
    @GetMapping("/{id}")
    public Optional<Rutina_Ejercicio> listarId(@PathVariable("id") Integer id) {
        return pService.listarId(id);
    }
}
