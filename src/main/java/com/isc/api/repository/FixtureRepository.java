package com.isc.api.repository;

import com.isc.api.model.Fixture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FixtureRepository extends JpaRepository<Fixture,Integer> {
}
