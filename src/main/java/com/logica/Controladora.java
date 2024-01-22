
package com.logica;

import com.persistencia.ControladoraPersistencia;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Alfonso
 */
public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearCiudadano(String nombreCiudadano, String apellidoCiudadano, String dniCiudadano) {
        controlPersis.crearCiudadano(new Ciudadano(nombreCiudadano, apellidoCiudadano, dniCiudadano));
    }

    public void crearTurno(String tramite, LocalDate fecha, Ciudadano ciudadano, int num) {
        controlPersis.crearTurno(new Turno(fecha,tramite,false, ciudadano, num));
    }

    public List<Ciudadano> traerCiudadanos() {
        return controlPersis.traerCiudadanos();
    }
   
    
    public List<Turno> traerTurnos() {
        return controlPersis.traerTurnos();
    }
    
    
    
    

}
