package com.isc.api.model;

import javax.persistence.*;

@Entity
@Table(name = "TUsuario", schema = "dbCampeonato", catalog = "")
public class Usuario {
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
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "celular")
    private String celular;
    @Basic
    @Column(name = "clave")
    private String clave;
    @Basic
    @Column(name = "rol")
    private String rol;
    @Basic
    @Column(name = "estado")
    private String estado;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
