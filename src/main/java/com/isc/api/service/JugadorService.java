package com.isc.api.service;

import com.isc.api.model.Jugador;
import com.isc.api.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JugadorService{
    @Autowired
    private JugadorRepository jugadorRepository;

    public Jugador crearJugador(Jugador jugador){
        return jugadorRepository.save(jugador);
    }

    public Jugador editarJugador(Jugador jugador){
        return jugadorRepository.save(jugador);
    }

    public void eliminarJugador(Jugador jugador){
        jugadorRepository.delete(jugador);
    }

    public Jugador obtenerPorId(int id){
        return jugadorRepository.getReferenceById(id);
    }
}
