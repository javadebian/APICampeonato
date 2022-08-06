package com.isc.api.service;

import com.isc.api.model.Equipo;
import com.isc.api.model.Fixture;
import com.isc.api.repository.EquipoRepository;
import com.isc.api.repository.FixtureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FixtureService {
    @Autowired
    private FixtureRepository fixtureRepository;

    @Autowired
    private EquipoRepository equipoRepository;

    public Fixture editarFixture(Fixture fixture){
        return fixtureRepository.save(fixture);
    }

    public Fixture obtenerPorId(int id){
        return fixtureRepository.getReferenceById(id);
    }

    public List<Fixture> obtenerFixture(int idTorneo){
       return fixtureRepository.obtenerFixture(idTorneo);
    }

    public void generarFixture(int idTorneo,String estado){
        List<Equipo> listEquipos= equipoRepository.listEquipoPorEstado(idTorneo, estado);
    }

}
