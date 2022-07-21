package com.isc.api.service;

import com.isc.api.model.Categoria;
import com.isc.api.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria crearCategoria(Categoria categoria){
        return categoriaRepository.save(categoria);
    }

    public Categoria editarCategoria(Categoria categoria){
        return categoriaRepository.save(categoria);
    }

    public List<Categoria> listCategoria(){
        return categoriaRepository.findAll();
    }

    public List<Categoria> listCategoriaEstado(String estado){
        return categoriaRepository.listCategoriaEstado(estado);
    }
}
