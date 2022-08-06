package com.isc.api.controller;

import com.isc.api.model.Fixture;
import com.isc.api.model.Jugador;
import com.isc.api.service.JugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/jugador", produces = "application/json")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class JugadorController {
    @Autowired
    private JugadorService jugadorService;

    @PostMapping("/add")
    public Jugador addJugador(@RequestBody Jugador jugador){
        return jugadorService.crearJugador(jugador);
    }

    @PutMapping("/edit")
    public Jugador editJugador(@RequestBody Jugador jugador){
        return jugadorService.editarJugador(jugador);
    }

    @GetMapping("/{id}")
    public Jugador obtenerJugador(@PathVariable int id){
        return jugadorService.obtenerPorId(id);
    }

    @DeleteMapping("/remove")
    public void eliminarJugador(@RequestBody Jugador jugador){
        jugadorService.eliminarJugador(jugador);
    }
}
