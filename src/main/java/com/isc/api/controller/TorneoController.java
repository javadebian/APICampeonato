package com.isc.api.controller;

import com.isc.api.model.Torneo;
import com.isc.api.model.Usuario;
import com.isc.api.service.TorneoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/torneo", produces = "application/json")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class TorneoController {
    @Autowired
    private TorneoService torneoService;

    @PostMapping("/add")
    public Torneo addTorneo(@RequestBody Torneo torneo){
        return torneoService.crearTorneo(torneo);
    }

    @PutMapping("/edit")
    public Torneo editTorneo(@RequestBody Torneo torneo){
        return torneoService.editarTorneo(torneo);
    }

    @GetMapping("/{id}")
    public Torneo obtenerTorneo(@PathVariable int id){
        return torneoService.obtenerPorId(id);
    }

    @GetMapping("/{estado}")
    public List<Torneo> obtenerTorneos(@PathVariable int idUsuario,@PathVariable String estado){
        return torneoService.listarTorneoPorEstado(idUsuario,estado);
    }

    @DeleteMapping("/remove")
    public Torneo eliminarTorneo(@RequestBody Torneo torneo){
        return torneoService.eliminarTorneo(torneo);
    }
}
