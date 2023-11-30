package com.bancoplatinum.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bancoplatinum.model.CtaCorriente;
import com.bancoplatinum.model.Persona;
import com.bancoplatinum.model.Transaccion;
import com.bancoplatinum.model.Usuario;
import com.bancoplatinum.service.BancoService;


@WebServlet("/registro")
public class RegistroServlet extends HttpServlet {
    private BancoService bancoService = new BancoService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener parámetros del formulario
        String nombreUsuario = request.getParameter("nombreUsuario");
        String password = request.getParameter("password");

        String rut = request.getParameter("rut");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String direccion = request.getParameter("direccion");
        String correo = request.getParameter("correo");
        String telefono = request.getParameter("telefono");
        String nombreMascota = request.getParameter("nombreMascota");

        String rutCliente = request.getParameter("rutCliente");
        double monto = Double.parseDouble(request.getParameter("monto"));
        String ejecutivoAtiende = request.getParameter("ejecutivoAtiende");

        // Crear objetos de modelo
        Usuario usuario = new Usuario();
        usuario.setNombreUsuario(nombreUsuario);
        usuario.setPassword(password);

        Persona persona = new Persona();
        persona.setRut(rut);
        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.setDireccion(direccion);
        persona.setCorreo(correo);
        persona.setTelefono(telefono);
        persona.setNombreMascota(nombreMascota);

        CtaCorriente ctaCorriente = new CtaCorriente();
        ctaCorriente.setRutCliente(rutCliente);
        ctaCorriente.setMonto(monto);
        ctaCorriente.setEjecutivoAtiende(ejecutivoAtiende);

        // Registrar usuario y asociar información adicional
        bancoService.insertUsuario(usuario);
        bancoService.insertPersona(persona);
        bancoService.insertCtaCorriente(ctaCorriente);

        // Otras operaciones y redirecciones
    }
}
