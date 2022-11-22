package pe.edu.upc.trickfit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trickfit.entities.Cita;
import pe.edu.upc.trickfit.servicesinterfaces.ICitaService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/citas")
public class CitaController {
    @Autowired
    private ICitaService pService;

    @PostMapping
    public void registrar(@RequestBody Cita c) {
        pService.insertar(c);
    }

    @GetMapping
    public List<Cita> listar() {
        return pService.listar();
    }

    @PutMapping
    public void modificar(@RequestBody Cita c) {
        pService.insertar(c);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        pService.eliminar(id);
    }

    @PostMapping("/buscar")
    public List<Cita> buscar(@RequestBody Cita c) throws ParseException {

        List<Cita> listaCitas;
        listaCitas = pService.buscarUsuario(c.getUsuario().getNombreUsuario());
        /*if (listaCitas.isEmpty()) {

            listaCitas = pService.buscarEspecialista(c.getEspecialista().getNombreUsuario());
        }*/
        return listaCitas;

    }
    @GetMapping("/{id}")
    public Optional<Cita> listarId(@PathVariable("id") Integer id) {
        return pService.listarId(id);
    }
}
