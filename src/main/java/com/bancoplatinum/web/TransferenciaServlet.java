package com.bancoplatinum.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bancoplatinum.model.Transaccion;
import com.bancoplatinum.service.BancoService;


@WebServlet("/transferencia")
public class TransferenciaServlet extends HttpServlet {
    private BancoService bancoService = new BancoService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener parámetros del formulario
        String rutCliente = request.getParameter("rutCliente");
        String rutDueno = request.getParameter("rutDueno");
        int idCuenta = Integer.parseInt(request.getParameter("idCuenta"));
        double montoTransferencia = Double.parseDouble(request.getParameter("montoTransferencia"));
        String cuentaDestino = request.getParameter("cuentaDestino");
        String tipoCuenta = request.getParameter("tipoCuenta");

        // Crear objeto de modelo
        Transaccion transaccion = new Transaccion();
        transaccion.setRutCliente(rutCliente);
        transaccion.setRutDueno(rutDueno);
        transaccion.setIdCuenta(idCuenta);
        transaccion.setMontoTransferencia(montoTransferencia);
        transaccion.setCuentaDestino(cuentaDestino);
        transaccion.setTipoCuenta(tipoCuenta);

        // Realizar transferencia
        bancoService.realizarTransferencia(transaccion);

        // Otras operaciones y redirecciones
    }
}
