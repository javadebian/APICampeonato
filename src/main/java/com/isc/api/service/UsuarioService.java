package com.isc.api.service;

import com.isc.api.model.Usuario;
import com.isc.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario crearUsuario(Usuario usuario){
        String clave= usuarioRepository.encriptarLogin(usuario.getClave());
        usuario.setClave(clave);
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

    public String encriptarLogin(String clave){
     return usuarioRepository.encriptarLogin(clave);
    }

    public Map<String, Object> loginUser(String dni, String passw){
        Map<String, Object> data= new HashMap<String, Object>();
        String clave= usuarioRepository.encriptarLogin(passw);
        Usuario user= usuarioRepository.loginUsuario(dni,clave);
        if(user!=null){
            data.put("id",user.getId());
            data.put("dni",user.getDni());
            data.put("nombres",user.getNombres());
            data.put("apellidos",user.getApellidos());
            data.put("rol",user.getRol());
        }else {
            data.put("id",0);
            data.put("msj","Usuario Y/O Clave incorrecta!!");
        }
        return data;
    }
}
