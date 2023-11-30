package com.bancoplatinum.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import java.sql.Connection;
import java.sql.SQLException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.bancoplatinum.model.DatabaseConnection;

public class DatabaseConnectionTest {

    private Connection connection;

    @Before
    public void setUp() throws SQLException {
        System.out.println("Configurando la prueba...");
        connection = DatabaseConnection.getConnection();
    }

    @After
    public void tearDown() throws SQLException {
        System.out.println("Limpiando después de la prueba...");
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }

    @Test
    public void testConnectionNotNull() {
        System.out.println("Ejecutando prueba de conexión no nula...");
        assertNotNull("La conexión no debe ser nula", connection);
    }

    @Test
    public void testConnectionIsOpen() throws SQLException {
        System.out.println("Ejecutando prueba de conexión abierta...");
        assertTrue("La conexión debe estar abierta", !connection.isClosed());
    }
}
