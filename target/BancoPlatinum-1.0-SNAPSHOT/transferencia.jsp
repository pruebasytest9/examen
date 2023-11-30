<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Banco Platinum - Transferencia</title>
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
        <div class="container" id="transferencia-container">
            <h1>Realizar Transferencia</h1>
            <form action="TransferenciaServlet" method="post">
                <!-- Campos para la tabla Transacción -->
                <label for="rutCliente">RUT del Cliente:</label>
                <input type="text" id="rutCliente" name="rutCliente" required><br>

                <label for="rutDueno">RUT del Dueño:</label>
                <input type="text" id="rutDueno" name="rutDueno" required><br>

                <label for="idCuenta">ID de la Cuenta:</label>
                <input type="text" id="idCuenta" name="idCuenta" required><br>

                <label for="montoTransferencia">Monto de Transferencia:</label>
                <input type="text" id="montoTransferencia" name="montoTransferencia" required><br>

                <label for="cuentaDestino">Cuenta de Destino:</label>
                <input type="text" id="cuentaDestino" name="cuentaDestino" required><br>

                <label for="tipoCuenta">Tipo de Cuenta:</label>
                <input type="text" id="tipoCuenta" name="tipoCuenta" required><br>

                <input type="submit" value="Realizar Transferencia">
            </form>
        </div>
    </main>
</body>
</html>

