package com.isc.api.model;

import javax.persistence.*;

@Entity
@Table(name = "TEquipo", schema = "dbCampeonato", catalog = "")
public class Equipo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "nombreEquipo")
    private String nombreEquipo;
    @Basic
    @Column(name = "escudo")
    private String escudo;
    @Basic
    @Column(name = "estado")
    private String estado;
    @Basic
    @Column(name = "idUsuario")
    private Integer idUsuario;
    @ManyToOne
    @JoinColumn(name = "idCategoria", referencedColumnName = "id", nullable = false)
    private Categoria categoria;
    @ManyToOne
    @JoinColumn(name = "idTorneo", referencedColumnName = "id", nullable = false)
    private Torneo torneo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getEscudo() {
        return escudo;
    }

    public void setEscudo(String escudo) {
        this.escudo = escudo;
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Torneo getTorneo() {
        return torneo;
    }

    public void setTorneo(Torneo torneo) {
        this.torneo = torneo;
    }
}
