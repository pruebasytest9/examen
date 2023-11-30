<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Banco Platinum - Ingresar Ejecutivo</title>
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
                    <li class="current"><a href="login.jsp">Ingresar Ejecutivo</a></li>
                </ul>
            </nav>
        </div>
    </header>

    <main>
        <div class="container" id="login-container">
            <h2>Iniciar Sesión</h2>
            <form action="LoginServlet" method="post">
                <label for="rutEjecutivo">RUT Ejecutivo:</label>
                <input type="text" id="rutEjecutivo" name="rutEjecutivo" required>
                
                <label for="password">Contraseña:</label>
                <input type="password" id="password" name="password" required>
                
                <label for="departamento">Departamento:</label>
                <input type="text" id="departamento" name="departamento" required>
                
                <button type="submit">Iniciar Sesión</button>
            </form>
        </div>
    </main>
</body>
</html>

