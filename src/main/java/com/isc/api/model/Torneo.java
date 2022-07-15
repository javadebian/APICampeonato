package com.isc.api.model;

import javax.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "TTorneo", schema = "dbCampeonato")
public class Torneo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "nombreCampeonato")
    private String nombreCampeonato;
    @Basic
    @Column(name = "fechaInicio")
    private Date fechaInicio;
    @Basic
    @Column(name = "fechaFinal")
    private Date fechaFinal;
    @Basic
    @Column(name = "banner")
    private String banner;
    @Basic
    @Column(name = "estado")
    private String estado;
    @Basic
    @Column(name = "idUsuario")
    private Integer idUsuario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreCampeonato() {
        return nombreCampeonato;
    }

    public void setNombreCampeonato(String nombreCampeonato) {
        this.nombreCampeonato = nombreCampeonato;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
}
