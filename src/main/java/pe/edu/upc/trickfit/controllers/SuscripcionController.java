package pe.edu.upc.trickfit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trickfit.entities.Cantidads;
import pe.edu.upc.trickfit.entities.Suscripcion;
import pe.edu.upc.trickfit.servicesinterfaces.ISuscripcionService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/suscripciones")
public class SuscripcionController {

    @Autowired
    private ISuscripcionService pService;

    @PostMapping
    public void registrar(@RequestBody Suscripcion s) {
        pService.insertar(s);
    }

    @GetMapping
    public List<Suscripcion> listar() {
        return pService.listar();
    }

    @PutMapping
    public void modificar(@RequestBody Suscripcion s) {
        pService.insertar(s);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        pService.eliminar(id);
    }

    @PostMapping("/buscar")
    public List<Suscripcion> buscar(@RequestBody Suscripcion s) throws ParseException {

        List<Suscripcion> listaSuscripciones;
        listaSuscripciones = pService.buscarUsuario(s.getUsuario().getNombreUsuario());
        /*if (listaSuscripciones.isEmpty()) {
            listaSuscripciones = pService.buscarTarjeta(s.getTarjeta().getNumeroTarjeta());
        }
        if (listaSuscripciones.isEmpty()) {
            listaSuscripciones = pService.buscarPlan(s.getPlan().getNombrePlan());
        }*/
        return listaSuscripciones;

    }
    @GetMapping("/{id}")
    public Optional<Suscripcion> listarId(@PathVariable("id") Integer id) {
        return pService.listarId(id);
    }

    @GetMapping("/reporte")
    public List<Cantidads> buscarsuscripcion( ) {
        return pService.buscarcantidadesuscripcionesporplan();
    }
}
