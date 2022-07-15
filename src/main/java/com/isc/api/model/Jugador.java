package com.isc.api.model;

import javax.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "TJugador", schema = "dbCampeonato")
public class Jugador {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "dni")
    private String dni;
    @Basic
    @Column(name = "nombres")
    private String nombres;
    @Basic
    @Column(name = "apellidos")
    private String apellidos;
    @Basic
    @Column(name = "fecNac")
    private Date fecNac;
    @Basic
    @Column(name = "talla")
    private Double talla;
    @Basic
    @Column(name = "nroCamiseta")
    private Integer nroCamiseta;
    @Basic
    @Column(name = "posicion")
    private String posicion;
    @Basic
    @Column(name = "estado")
    private String estado;
    @Basic
    @Column(name = "idEquipo")
    private Integer idEquipo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFecNac() {
        return fecNac;
    }

    public void setFecNac(Date fecNac) {
        this.fecNac = fecNac;
    }

    public Double getTalla() {
        return talla;
    }

    public void setTalla(Double talla) {
        this.talla = talla;
    }

    public Integer getNroCamiseta() {
        return nroCamiseta;
    }

    public void setNroCamiseta(Integer nroCamiseta) {
        this.nroCamiseta = nroCamiseta;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(Integer idEquipo) {
        this.idEquipo = idEquipo;
    }
}
