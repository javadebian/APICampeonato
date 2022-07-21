package com.isc.api.repository;

import com.isc.api.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {

    @Query(value = "Select u From Usuario u where u.estado = ?1")
    public List<Usuario> listarPorEstado(String estado);
}
