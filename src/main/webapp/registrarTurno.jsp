<%@page import="java.util.List"%>
<%@page import="com.logica.Ciudadano"%>
<%@page import="com.logica.Turno"%>
<%@page import="com.logica.Controladora"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Formulario Ciudadano</title>
        <style>
            body {
                display: flex;
                flex-direction: column;
                align-items: center;
                justify-content: center;
                height: 100vh;
                margin: 0;
            }

            form {
                width: 300px;
                text-align: center;
            }

            label {
                display: block;
                margin-bottom: 8px;
            }

            input {
                width: 100%;
                padding: 8px;
                margin-bottom: 16px;
                box-sizing: border-box;
            }

            button {
                padding: 10px;
                background-color: #4CAF50;
                color: white;
                border: none;
                border-radius: 4px;
                cursor: pointer;
            }
        </style>
    </head>
    <body>

        <form action="SvTurno" method="POST">
           
            <label for="fecha">Fecha</label>
            <input type="date" id="fecha" name="fecha" required>

            <label for="tramite">Tramite:</label>
            <input type="text" id="tramite" name="tramite" required>

            <label for="dni">Selecciona el dni de la persona:</label>
            <select type="text" name="dni" id="dni">
                <%
                    Controladora controladora = new Controladora();
                    List<Ciudadano> ciudadanos = controladora.traerCiudadanos();

                    for (Ciudadano ciudadano : ciudadanos) {
                %>

                <option value="<%= ciudadano.getDni()%>"><%= ciudadano.getDni()%></option>
                <%
                    }
                %>  
            </select>

            <button type="submit">Registrar turno</button>
        </form>

    </body>
</html>
