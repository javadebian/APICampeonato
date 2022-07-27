package com.isc.api.repository;

import com.isc.api.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.NamedNativeQuery;
import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {

    @Query(value = "Select u From Usuario u where u.estado = ?1")
    public List<Usuario> listarPorEstado(String estado);

    @Query(value = "Select md5(sha1(?1))", nativeQuery = true)
    public String encriptarLogin(String clave);

    @Query(value = "Select u From Usuario u where  u.dni = ?1 AND u.clave = ?2 AND u.estado = 'activo'")
    public Usuario loginUsuario(String dni, String clave);
}
