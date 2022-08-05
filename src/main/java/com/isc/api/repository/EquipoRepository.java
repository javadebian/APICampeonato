package com.isc.api.repository;

import com.isc.api.model.Equipo;
import com.isc.api.model.Torneo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EquipoRepository extends JpaRepository<Equipo,Integer> {
    @Query("Select e From Equipo e where e.tTorneoByIdTorneo.id = ?1 AND e.estado = ?2")
    public List<Equipo> listEquipoPorEstado(int idTorne,String estado);

    @Query("Select e From Equipo e where e.idUsuario = ?1 AND e.estado = ?2")
    public List<Equipo> listEquipoPorUsuario(int idUasuario,String estado);
}
