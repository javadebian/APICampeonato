package com.isc.api.repository;

import com.isc.api.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria,Integer> {
    @Query(value = "select c from Categoria c where c.estado = ?1")
    List<Categoria> listCategoriaEstado(String estado);
}
