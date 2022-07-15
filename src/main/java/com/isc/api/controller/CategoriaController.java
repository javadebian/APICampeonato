package com.isc.api.controller;

import com.isc.api.model.Categoria;
import com.isc.api.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/categoria", produces = "application/json")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @PostMapping("/add")
    public Categoria addCategoria(@RequestBody Categoria categoria){
        return  categoriaService.crearCategoria(categoria);
    }

    @GetMapping("/all")
    public List<Categoria> listCategoria(){
        return categoriaService.listCategoria();
    }
}
