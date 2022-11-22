package pe.edu.upc.trickfit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trickfit.entities.Banco;
import pe.edu.upc.trickfit.servicesinterfaces.IBancoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bancos")
public class BancoController {
    @Autowired
    private IBancoService pService;

    @PostMapping
    public void registrar(@RequestBody Banco b) {
        pService.insert(b);
    }

    @GetMapping
    public List<Banco> listar() {
        return pService.list();
    }

    @PutMapping
    public void modificar(@RequestBody Banco banco){
        pService.insert(banco);
    }

    @DeleteMapping("/{id}")
    public  void eliminar(@PathVariable Integer id){pService.delete(id);}

    @PostMapping ("/buscar")
    public List<Banco> buscar(@RequestBody Banco banco){
        List<Banco> lista;
        banco.setNombreBanco(banco.getNombreBanco());
        lista=pService.search(banco.getNombreBanco());
        return lista;
    }

    @GetMapping("/{id}")
    public Optional<Banco> listarId(@PathVariable("id") Integer id) {
        return pService.listarId(id);
    }

}
