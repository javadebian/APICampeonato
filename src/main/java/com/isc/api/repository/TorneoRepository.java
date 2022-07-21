package com.isc.api.repository;

import com.isc.api.model.Torneo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TorneoRepository extends JpaRepository<Torneo,Integer> {

    @Query("Select t From Torneo t where t.estado = ?1")
    public List<Torneo> listTorneosPorEstado(String estado);
}
