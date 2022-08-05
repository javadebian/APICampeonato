package com.isc.api.service;

import com.isc.api.model.Equipo;
import com.isc.api.model.Usuario;
import com.isc.api.repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipoService {
    @Autowired
    private EquipoRepository equipoRepository;

    public Equipo crearEquipo(Equipo usuario){
        return equipoRepository.save(usuario);
    }

    public Equipo editarEquipo(Equipo usuario){
        return equipoRepository.save(usuario);
    }

    public Equipo eliminarEquipo(Equipo usuario){
        usuario.setEstado("InActivo");
        return equipoRepository.save(usuario);
    }

    public Equipo obtenerPorId(int id){
        return equipoRepository.getReferenceById(id);
    }

    public List<Equipo> listarEquipoPorEstado(int idTorneo, String estado){
        return equipoRepository.listEquipoPorEstado(idTorneo,estado);
    }

    public List<Equipo> listarEquipoPorUsuario(int idUsuario, String estado){
        return equipoRepository.listEquipoPorUsuario(idUsuario,estado);
    }
}
