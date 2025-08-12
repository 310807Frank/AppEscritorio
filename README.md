# AppEscritorio - Gestión de Tareas

## Descripción
Aplicación de escritorio desarrollada en Java usando Swing para la gestión de tareas. Permite agregar y visualizar tareas almacenadas en una base de datos SQL Server.

## Características
- Visualización dinámica de las tareas almacenadas.
- Añadir nuevas tareas con los campos: ID, Nombre, Fecha, Descripción y Estado.
- Interfaz gráfica simple y funcional con JTable para mostrar datos.
- Control de errores para entradas inválidas (como ID no numérico o campos vacíos).

## Tecnologías
- Java SE 8+ (Swing para GUI)
- JDBC para conexión con SQL Server
- Base de datos: Microsoft SQL Server

## Estructura del proyecto
- `ui`: Clase JFrame con la interfaz gráfica (`FrameEscritorio.java`).
- `controller`: Controlador que maneja la lógica entre la interfaz y el DAO.
- `dao`: Acceso a datos, comunicación con la base de datos.
- `modelo`: Clases modelo que representan las entidades (como `Tarea`).

## Requisitos
- Java JDK instalado.
- SQL Server configurado y ejecutándose.
- Driver JDBC de SQL Server (Microsoft JDBC Driver) agregado al classpath del proyecto.
- Base de datos creada con tabla `Tarea` (ver sección SQL).

## Tabla en base de datos SQL Server

```sql
CREATE TABLE Tarea (
    id INT PRIMARY KEY,
    nombre VARCHAR(50),
    fecha VARCHAR(20),
    descripcion VARCHAR(255),
    estado VARCHAR(20)
);
