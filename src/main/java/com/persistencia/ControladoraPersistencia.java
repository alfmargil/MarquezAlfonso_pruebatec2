/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.persistencia;

import com.logica.Ciudadano;
import com.logica.Turno;
import java.util.List;

/**
 *
 * @author Alfonso
 */
public class ControladoraPersistencia {

    CiudadanoJpaController ciuJPA = new CiudadanoJpaController();
    TurnoJpaController turnoJPA = new TurnoJpaController();

    public void crearCiudadano(Ciudadano ciudadano) {
        ciuJPA.create(ciudadano);
    }

    public void crearTurno(Turno turno) {
        turnoJPA.create(turno);
    }
    
    // Devuelve una lista con todos los ciudadanos almacenados

    public List<Ciudadano> traerCiudadanos() {
        return ciuJPA.findCiudadanoEntities();
    }
    
    // Devuelve una lista con todos los turnos almacenados
    
      public List<Turno> traerTurnos() {
        return turnoJPA.findTurnoEntities();
    }

}
