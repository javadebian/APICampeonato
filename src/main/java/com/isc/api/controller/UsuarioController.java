package com.isc.api.controller;

import com.isc.api.model.Usuario;
import com.isc.api.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/usuario", produces = "application/json")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/add")
    public Usuario addUsuario(@RequestBody Usuario usuario){
        return usuarioService.crearUsuario(usuario);
    }

    @PutMapping("/edit")
    public Usuario editUsuario(@RequestBody Usuario usuario){
        return usuarioService.editarUsuario(usuario);
    }

    @GetMapping("/{id}")
    public Usuario obtenerUsuario(@PathVariable int id){
        return usuarioService.obtenerPorId(id);
    }

    @GetMapping("/listEstado")
    public List<Usuario> obtenerUsuarios(@RequestParam(name = "estado") String estado){
        return usuarioService.listarUsuariosPorEstado(estado);
    }

    @DeleteMapping("/remove")
    public Usuario eliminarUsuario(@RequestBody Usuario usuario){
        return usuarioService.eliminarUsuario(usuario);
    }

    @GetMapping("/login")
    public Map<String, Object> encriptarMD5(@RequestParam(name = "dni") String dni, @RequestParam(name = "clave") String clave){
        return usuarioService.loginUser(dni,clave);
    }
}
