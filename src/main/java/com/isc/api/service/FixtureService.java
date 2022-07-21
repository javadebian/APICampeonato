package com.isc.api.service;

import com.isc.api.model.Fixture;
import com.isc.api.model.Usuario;
import com.isc.api.repository.FixtureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FixtureService {
    @Autowired
    private FixtureRepository fixtureRepository;

    public Fixture crearFixture(Fixture fixture){
        return fixtureRepository.save(fixture);
    }

    public Fixture editarFixture(Fixture fixture){
        return fixtureRepository.save(fixture);
    }

    public void eliminarFixture(Fixture fixture){
        fixtureRepository.delete(fixture);
    }

    public Fixture obtenerPorId(int id){
        return fixtureRepository.getReferenceById(id);
    }
}
