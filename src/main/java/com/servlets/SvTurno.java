
package com.servlets;

import com.logica.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alfonso
 */
@WebServlet(name = "SvTurno", urlPatterns = {"/SvTurno"})
public class SvTurno extends HttpServlet {

    Controladora controladora = new Controladora();
    boolean estado;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
    
    // Recibe los datos del front y dependiendo de si se ha seleccionado estado o no filtra solo por fecha o por fecha y estado

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        processRequest(request, response);
        LocalDate fecha = LocalDate.parse(request.getParameter("fecha"));

        if (request.getParameter("estado") == null) {

            List<Turno> turnos = new ArrayList<>();
            turnos = controladora.traerTurnos();
            List<Turno> turnosFiltrados = turnos.stream().filter(turno -> turno.getFechaTurno().equals(fecha)).collect(Collectors.toList());
            request.setAttribute("fecha", fecha);
            request.setAttribute("turnos", turnosFiltrados);
            request.setAttribute("estado", "a");
            request.getRequestDispatcher("filtrarTurnos.jsp").forward(request, response);

        } else {

            if (request.getParameter("estado").equalsIgnoreCase("En espera")) {
                estado = false;
            } else if (request.getParameter("estado").equalsIgnoreCase("Ya Atendido")) {
                estado = true;
            }
            List<Turno> turnos = new ArrayList<>();
            turnos = controladora.traerTurnos();
            List<Turno> turnosFiltrados = turnos.stream().filter(turno -> turno.getFechaTurno().equals(fecha) && turno.getEstadoTramite().equals(estado)).collect(Collectors.toList());
            request.setAttribute("fecha", fecha);
            request.setAttribute("turnos", turnosFiltrados);
            request.setAttribute("estado", "acertado");
            request.getRequestDispatcher("filtrarTurnos.jsp").forward(request, response);
        }

    }
    
    // Registra turno en la DB

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        LocalDate fecha = LocalDate.parse(request.getParameter("fecha"));
        String tramite = request.getParameter("tramite");
        String dni = request.getParameter("dni");
        int num = Integer.parseInt(request.getParameter("num"));
        List<Ciudadano> listaCiudadanos = new ArrayList<>();
        listaCiudadanos = controladora.traerCiudadanos();
        Ciudadano ciudadanoEncontrado = listaCiudadanos.stream()
                .filter(ciudadano -> ciudadano.getDni().equals(dni))
                .findFirst().orElse(null);
        controladora.crearTurno(tramite, fecha, ciudadanoEncontrado, num);
        response.sendRedirect("registrarTurno.jsp");

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
