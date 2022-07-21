package com.isc.api.service;

import com.isc.api.model.Usuario;
import com.isc.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario crearUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public Usuario editarUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public Usuario eliminarUsuario(Usuario usuario){
        usuario.setEstado("InActivo");
        return usuarioRepository.save(usuario);
    }

    public Usuario obtenerPorId(int id){
        return usuarioRepository.getReferenceById(id);
    }

    public List<Usuario> listarUsuariosPorEstado(String estado){
        return usuarioRepository.listarPorEstado(estado);
    }
}
