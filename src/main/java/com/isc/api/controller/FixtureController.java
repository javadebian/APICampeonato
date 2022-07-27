package com.isc.api.controller;

import com.isc.api.model.Equipo;
import com.isc.api.model.Fixture;
import com.isc.api.service.FixtureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/fixture", produces = "application/json")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class FixtureController {
    @Autowired
    private FixtureService fixtureService;

    @PostMapping("/add")
    public Fixture addEquipo(@RequestBody Fixture fixture){
        return fixtureService.crearFixture(fixture);
    }

    @PutMapping("/edit")
    public Fixture editEquipo(@RequestBody Fixture fixture){
        return fixtureService.editarFixture(fixture);
    }

    @GetMapping("/{id}")
    public Fixture obtenerEquipo(@PathVariable int id){
        return fixtureService.obtenerPorId(id);
    }

    @DeleteMapping("/remove")
    public void eliminarEquipo(@RequestBody Fixture fixture){
        fixtureService.eliminarFixture(fixture);
    }
}
