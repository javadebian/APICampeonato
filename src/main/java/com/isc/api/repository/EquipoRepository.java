package com.isc.api.repository;

import com.isc.api.model.Equipo;
import com.isc.api.model.Torneo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EquipoRepository extends JpaRepository<Equipo,Integer> {
    @Query("Select e From Equipo e where e.estado = ?1")
    public List<Equipo> listEquipoPorEstado(String estado);
}
