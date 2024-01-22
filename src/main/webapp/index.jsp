
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Turnero</title>
    <style>
        body {
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: 100vh;
            margin: 0;
        }

        header {
            text-align: left;
            margin-left: 20px;
        }

        p {
            text-align: center;
        }

        .button-container {
            text-align: center;
        }

        .button-container button {
            margin: 10px;
        }
    </style>
</head>
<body>

<header>
    <h1>Turnero</h1>
</header>

<p>Aplicación de turnos para trámites de la ciudadanía.</p>

<div class="button-container">
    <a class="nav-link" href ="registrarCiudadano.jsp">Crear Ciudadano</a>
    <a class="nav-link" href ="registrarTurno.jsp">Registrar Turno</a>
    <a class="nav-link" href ="registrarCiudadano.jsp">Crear Ciudadano</a>
    <a class="nav-link" href ="registrarCiudadano.jsp">Crear Ciudadano</a>
</div>

</body>
</html>
