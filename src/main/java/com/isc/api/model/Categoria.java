package com.isc.api.model;


import javax.persistence.*;

@Entity
@Table(name = "TCategoria", schema = "dbCampeonato")
public class Categoria {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "nombreCategoria")
    private String nombreCategoria;
    @Basic
    @Column(name = "anioInicio")
    private Integer anioInicio;
    @Basic
    @Column(name = "anioFin")
    private Integer anioFin;
    @Basic
    @Column(name = "img")
    private String img;
    @Basic
    @Column(name = "estado")
    private String estado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public Integer getAnioInicio() {
        return anioInicio;
    }

    public void setAnioInicio(Integer anioInicio) {
        this.anioInicio = anioInicio;
    }

    public Integer getAnioFin() {
        return anioFin;
    }

    public void setAnioFin(Integer anioFin) {
        this.anioFin = anioFin;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
