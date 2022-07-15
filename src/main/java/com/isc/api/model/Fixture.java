package com.isc.api.model;

import javax.persistence.*;

import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "TFixture", schema = "dbCampeonato", catalog = "")
public class Fixture {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "nroFecha")
    private Integer nroFecha;
    @Basic
    @Column(name = "equipo_01")
    private Integer equipo01;
    @Basic
    @Column(name = "golesFavor_01")
    private Integer golesFavor01;
    @Basic
    @Column(name = "golesContra_01")
    private Integer golesContra01;
    @Basic
    @Column(name = "puntos_01")
    private Integer puntos01;
    @Basic
    @Column(name = "equipo_02")
    private Integer equipo02;
    @Basic
    @Column(name = "golesFavor_02")
    private Integer golesFavor02;
    @Basic
    @Column(name = "golesContra_02")
    private Integer golesContra02;
    @Basic
    @Column(name = "puntos_02")
    private Integer puntos02;
    @Basic
    @Column(name = "fecha")
    private Date fecha;
    @Basic
    @Column(name = "hora")
    private Time hora;
    @Basic
    @Column(name = "cancha")
    private String cancha;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNroFecha() {
        return nroFecha;
    }

    public void setNroFecha(Integer nroFecha) {
        this.nroFecha = nroFecha;
    }

    public Integer getEquipo01() {
        return equipo01;
    }

    public void setEquipo01(Integer equipo01) {
        this.equipo01 = equipo01;
    }

    public Integer getGolesFavor01() {
        return golesFavor01;
    }

    public void setGolesFavor01(Integer golesFavor01) {
        this.golesFavor01 = golesFavor01;
    }

    public Integer getGolesContra01() {
        return golesContra01;
    }

    public void setGolesContra01(Integer golesContra01) {
        this.golesContra01 = golesContra01;
    }

    public Integer getPuntos01() {
        return puntos01;
    }

    public void setPuntos01(Integer puntos01) {
        this.puntos01 = puntos01;
    }

    public Integer getEquipo02() {
        return equipo02;
    }

    public void setEquipo02(Integer equipo02) {
        this.equipo02 = equipo02;
    }

    public Integer getGolesFavor02() {
        return golesFavor02;
    }

    public void setGolesFavor02(Integer golesFavor02) {
        this.golesFavor02 = golesFavor02;
    }

    public Integer getGolesContra02() {
        return golesContra02;
    }

    public void setGolesContra02(Integer golesContra02) {
        this.golesContra02 = golesContra02;
    }

    public Integer getPuntos02() {
        return puntos02;
    }

    public void setPuntos02(Integer puntos02) {
        this.puntos02 = puntos02;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String getCancha() {
        return cancha;
    }

    public void setCancha(String cancha) {
        this.cancha = cancha;
    }
}
