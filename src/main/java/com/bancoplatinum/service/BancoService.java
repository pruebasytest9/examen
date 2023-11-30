package com.bancoplatinum.service;

import com.bancoplatinum.dao.CtaCorrienteDAO;
import com.bancoplatinum.dao.EjecutivoDAO;
import com.bancoplatinum.dao.PersonaDAO;
import com.bancoplatinum.dao.TransaccionDAO;
import com.bancoplatinum.dao.UsuarioDAO;
import com.bancoplatinum.model.CtaCorriente;
import com.bancoplatinum.model.Ejecutivo;
import com.bancoplatinum.model.Persona;
import com.bancoplatinum.model.Transaccion;
import com.bancoplatinum.model.Usuario;

// Importaciones necesarias

public class BancoService {
    private EjecutivoDAO ejecutivoDAO;
    private UsuarioDAO usuarioDAO;
    private PersonaDAO personaDAO;
    private CtaCorrienteDAO ctaCorrienteDAO;
    private TransaccionDAO transaccionDAO;

    public void insertEjecutivo(Ejecutivo ejecutivo) {
        ejecutivoDAO.insertEjecutivo(ejecutivo);
    }

    public void insertUsuario(Usuario usuario) {
        usuarioDAO.insertUsuario(usuario);
    }

    public void insertPersona(Persona persona) {
        personaDAO.insertPersona(persona);
    }

    public void insertCtaCorriente(CtaCorriente ctaCorriente) {
        ctaCorrienteDAO.insertCtaCorriente(ctaCorriente);
    }

    public void realizarTransferencia(Transaccion transaccion) {
        transaccionDAO.insertTransaccion(transaccion);
    }

    // Otros métodos de servicio
}
