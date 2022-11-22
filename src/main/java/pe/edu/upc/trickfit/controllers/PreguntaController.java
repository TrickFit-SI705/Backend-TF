package pe.edu.upc.trickfit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trickfit.entities.Pregunta;
import pe.edu.upc.trickfit.entities.RespuestaEspecialistas;
import pe.edu.upc.trickfit.servicesinterfaces.IPreguntaService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/preguntas")
public class PreguntaController {

    @Autowired
    private IPreguntaService pService;

    @PostMapping
    public void registrar(@RequestBody Pregunta p) {
        pService.insertar(p);
    }

    @GetMapping
    public List<Pregunta> listar() {
        return pService.listar();
    }

    @PutMapping
    public void modificar(@RequestBody Pregunta p) {
        pService.insertar(p);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        pService.eliminar(id);
    }

    @PostMapping("/buscar")
    public List<Pregunta> buscar(@RequestBody Pregunta p) throws ParseException {

        List<Pregunta> listaPreguntas;
        listaPreguntas = pService.buscarPregunta(p.getTituloPregunta());
        /*if (listaPreguntas.isEmpty()) {

            listaPreguntas = pService.buscarUsuario(p.getUsuario().getNombreUsuario());
        }*/
        return listaPreguntas;

    }
    @GetMapping("/{id}")
    public Optional<Pregunta> listarId(@PathVariable("id") Integer id) {
        return pService.listarId(id);
    }

    @GetMapping("/reporte")
    public List<RespuestaEspecialistas>buscarRespuestaEspecialistas(){
        return pService.buscarCantidadPropietario();
    }
}
