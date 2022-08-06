package com.isc.api.controller;

import com.isc.api.model.Equipo;
import com.isc.api.model.Fixture;
import com.isc.api.service.FixtureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/fixture", produces = "application/json")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class FixtureController {
    @Autowired
    private FixtureService fixtureService;

    @PutMapping("/edit")
    public Fixture editEquipo(@RequestBody Fixture fixture){
        return fixtureService.editarFixture(fixture);
    }

    @GetMapping("/{id}")
    public Fixture obtenerEquipo(@PathVariable int id){
        return fixtureService.obtenerPorId(id);
    }

    @GetMapping("/list")
    public List<Fixture> obtenerFixtures(@RequestParam(name = "idTorneo") int idTorneo){
        return fixtureService.obtenerFixture(idTorneo);
    }
}
