<%@page import="com.logica.Turno"%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Listar Turnos</title>
    </head>
    <body>
        <h2>Listado de Turnos</h2>

        <a class="nav-link" href ="index.jsp">Inicio</a>

        <form action="SvTurno" method="GET">
            <label for="fecha">Ingrese la Fecha: </label>
            <input type="date" id="fecha" name="fecha" required>
            <button type="submit">Buscar</button>
        </form>

        <%-- Muestra la lista de turnos si está disponible --%>
        <% if (request.getAttribute("turnos") != null) {%>
        <h3>Turnos para la Fecha: <%= request.getAttribute("fecha")%></h3>

        <table border="1">
            <tr>
                <th>Número de Turno</th>
                <th>Fecha</th>
                <th>Descripción</th>
                <th>Nombre</th>
                <th>Apellido</th>
            </tr>

            <% for (Turno turno : (List<Turno>) request.getAttribute("turnos")) {%>
            <tr>
                <td><%= turno.getNumTurno()%></td>
                <td><%= turno.getFechaTurno()%></td>
                <td><%= turno.getDescripcionTramite()%></td>
                <td><%= turno.getCiudadano().getNombre()%></td>
                <td><%= turno.getCiudadano().getApellido()%></td>
            </tr>
        </table>
        <% }%>
        <% }%>
    </body>
</html>
