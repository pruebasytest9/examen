<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Banco Platinum - Registro</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <header>
        <div class="container">
            <div id="branding">
                <h1><span class="highlight">Banco Platinum</span></h1>
            </div>
            <nav>
                <ul>
                    <li><a href="index.jsp">Inicio</a></li>
               
                </ul>
            </nav>
        </div>
    </header>

    <main>
        <div class="container">
            <h1>Registro</h1>
            <form action="RegistroServlet" method="post">
               <h2>Registro Usuario</h2>
                <label for="nombreUsuario">Nombre de Usuario:</label>
                <input type="text" id="nombreUsuario" name="nombreUsuario" required><br>

                <label for="password">Contraseña:</label>
                <input type="password" id="password" name="password" required><br>

                <h2>Datos Personales</h2>
                <label for="rut">RUT:</label>
                <input type="text" id="rut" name="rut" required><br>

                <label for="nombre">Nombre:</label>
                <input type="text" id="nombre" name="nombre" required><br>

                <label for="apellido">Apellido:</label>
                <input type="text" id="apellido" name="apellido" required><br>

                <label for="direccion">Dirección:</label>
                <input type="text" id="direccion" name="direccion" required><br>

                <label for="correo">Correo:</label>
                <input type="text" id="correo" name="correo" required><br>

                <label for="telefono">Teléfono:</label>
                <input type="text" id="telefono" name="telefono" required><br>

                <label for="nombreMascota">Nombre de Mascota:</label>
                <input type="text" id="nombreMascota" name="nombreMascota" required><br>

               <h2> Cuenta corriente</h2>
                <label for="monto">Monto:</label>
                <input type="text" id="monto" name="monto" required><br>

                <label for="ejecutivo">Ejecutivo:</label>
                <input type="text" id="ejecutivo" name="ejecutivo" required><br>

                <input type="submit" value="Registrar">
            </form>
        </div>
    </main>
</body>
</html>
