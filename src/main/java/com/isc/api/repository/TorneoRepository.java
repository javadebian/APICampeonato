package com.isc.api.repository;

import com.isc.api.model.Torneo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TorneoRepository extends JpaRepository<Torneo,Integer> {

    @Query("Select t From Torneo t where t.idUsuario = ?1 AND t.estado = ?2")
    public List<Torneo> listTorneosPorEstado(int idUsuario,String estado);

    @Query("select t from Torneo t where t.idUsuario = ?1")
    public List<Torneo> listTorneosUsuario(int idUsuario);
}
