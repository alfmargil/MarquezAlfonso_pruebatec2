# Prueba Técnica 2: Aplicación de Gestión de Turnos

Este proyecto consiste en el desarrollo de una aplicación de gestión de turnos en Java, haciendo uso de Servlets, JSP (JavaServer Pages), y JPA (Java Persistence API) para interactuar con una base de datos.

## Descripción del Proyecto

La aplicación de gestión de turnos permite a los usuarios realizar las siguientes operaciones:

1. **Agregar un nuevo ciudadano:** Los usuarios pueden ingresar información detallada sobre un nuevo ciudadano.

2. **Agregar un nuevo turno:** Los usuarios pueden ingresar información detallada sobre un nuevo turno, incluyendo número, fecha, descripción del trámite y asignación a un ciudadano.

2. **Listar turnos:** La aplicación permite la visualización de la lista de todos los turnos junto con los ciudadanos asignados, en base a una fecha brindada por el usuario.

3. **Filtrado de turnos:** Los usuarios pueden seleccionar si desean ver los turnos "En Espera" o "Ya Atendidos", además de filtrar por la fecha indicada por el usuario.

## Tecnologías Utilizadas

- **IDE:** NetBeans 17
- **Java:** JDK 17
- **Servlets y JSP** para el desarrollo del frontend
- **JPA (Java Persistence API)** para el acceso a la base de datos
- **MySQL** para la base de datos

## Estructura del Proyecto

- **src/main/java/com/logica/:** Contiene la lógica principal del proyecto
- **src/main/java/com/servlets/:** Contiene los servlets
- **src/main/java/com/persistencia/:** Contiene la persistencia del proyecto
- **src/main/webapp/:** Contiene las páginas JSP

## Configuración

1. **Requisitos previos:** Asegúrate de tener instalado Java 17.

2. **Configuración de la base de datos:** Importa el archivo SQL del repositorio con la base de datos inicial.

3. **Ejecución del proyecto:** Abre el proyecto en NetBeans, importa la base de datos y ejecuta.

## Casos Supuestos

- **Num. Turno:** El numero de turno lo introduce el usuario, y no está marcado como unico en la BD por lo que podría duplicarse.

## Documentación

Apenas he comentado los métodos, ya que la mayoría se puede saber que hacen por su nombre. Algún método más complejo si ha sido comentado.
