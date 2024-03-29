package com.isc.api.controller;

import com.isc.api.model.Equipo;
import com.isc.api.model.Torneo;
import com.isc.api.service.EquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/equipo", produces = "application/json")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class EquipoController {

    @Autowired
    private EquipoService equipoService;

    @PostMapping("/add")
    public Equipo addEquipo(@RequestBody Equipo equipo){
        return equipoService.crearEquipo(equipo);
    }

    @PutMapping("/edit")
    public Equipo editEquipo(@RequestBody Equipo equipo){
        return equipoService.editarEquipo(equipo);
    }

    @GetMapping("/{id}")
    public Equipo obtenerEquipo(@PathVariable int id){
        return equipoService.obtenerPorId(id);
    }

    @GetMapping("/listEquipos")
    public List<Equipo> obtenerEquipos(@RequestParam(name = "idTorneo") int idTorneo,@RequestParam(name = "estado") String estado){
        return equipoService.listarEquipoPorEstado(idTorneo,estado);
    }

    @GetMapping("/listEquiposPorUsuario")
    public List<Equipo> obtenerEquiposPorUsuario(@RequestParam(name = "idUsuario") int idUsuario,@RequestParam(name = "estado") String estado){
        return equipoService.listarEquipoPorUsuario(idUsuario,estado);
    }

    @DeleteMapping("/remove")
    public Equipo eliminarEquipo(@RequestBody Equipo equipo){
        return equipoService.eliminarEquipo(equipo);
    }
}
