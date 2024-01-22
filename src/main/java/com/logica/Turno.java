/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.logica;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Optional;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Alfonso
 */
@Entity
public class Turno implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    LocalDate fechaTurno;
    int numTurno;
    String descripcionTramite;
    Boolean estadoTramite;
    
    @ManyToOne
    @JoinColumn(name = "ciudadano_id")
    private Ciudadano ciudadano;

    public Turno() {
    }

    public Turno(LocalDate fechaTurno, String descripcionTramite, Boolean estadoTramite, Ciudadano ciudadano, int num) {
        this.fechaTurno = fechaTurno;
        this.descripcionTramite = descripcionTramite;
        this.estadoTramite = estadoTramite;
        this.ciudadano = ciudadano;
        this.numTurno = num;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getFechaTurno() {
        return fechaTurno;
    }

    public void setFechaTurno(LocalDate fechaTurno) {
        this.fechaTurno = fechaTurno;
    }

    public int getNumTurno() {
        return numTurno;
    }

    public void setNumTurno(int numTurno) {
        this.numTurno = numTurno;
    }

    public String getDescripcionTramite() {
        return descripcionTramite;
    }

    public void setDescripcionTramite(String descripcionTramite) {
        this.descripcionTramite = descripcionTramite;
    }

    public Boolean getEstadoTramite() {
        return estadoTramite;
    }

    public void setEstadoTramite(Boolean estadoTramite) {
        this.estadoTramite = estadoTramite;
    }

    public Ciudadano getCiudadano() {
        return ciudadano;
    }

    public void setCiudadano(Ciudadano ciudadano) {
        this.ciudadano = ciudadano;
    }

}
