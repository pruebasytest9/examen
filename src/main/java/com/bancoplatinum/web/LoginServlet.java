package com.bancoplatinum.web;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bancoplatinum.model.Ejecutivo;
import com.bancoplatinum.model.Transaccion;
import com.bancoplatinum.service.BancoService;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private BancoService bancoService = new BancoService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Lógica de inicio de sesión del ejecutivo
        String rut = request.getParameter("rut");
        String nombre = request.getParameter("nombre");
        String departamento = request.getParameter("departamento");

        Ejecutivo ejecutivo = new Ejecutivo();
        ejecutivo.setRutEjecutivo(rut);
        ejecutivo.setNombre(nombre);
        ejecutivo.setDepartamento(departamento);

        bancoService.insertEjecutivo(ejecutivo);

        // Otras operaciones y redirecciones
    }
}
