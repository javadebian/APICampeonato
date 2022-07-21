package com.isc.api.service;

import com.isc.api.model.Torneo;
import com.isc.api.model.Usuario;
import com.isc.api.repository.TorneoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TorneoService{
    @Autowired
    private TorneoRepository torneoRepository;

    public Torneo crearTorneo(Torneo torneo){
        return torneoRepository.save(torneo);
    }

    public Torneo editarTorneo(Torneo usuario){
        return torneoRepository.save(usuario);
    }

    public Torneo eliminarTorneo(Torneo usuario){
        usuario.setEstado("InActivo");
        return torneoRepository.save(usuario);
    }

    public Torneo obtenerPorId(int id){
        return torneoRepository.getReferenceById(id);
    }

    public List<Torneo> listarTorneoPorEstado(String estado){
        return torneoRepository.listTorneosPorEstado(estado);
    }
}
