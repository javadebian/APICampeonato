package com.isc.api.repository;

import com.isc.api.model.Fixture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FixtureRepository extends JpaRepository<Fixture,Integer> {
    @Query("Select f From Fixture f where f.idTorneo = ?1")
    public List<Fixture> obtenerFixture(int idTorneo);
}
