package tests;

import connection.ConexionBD;
import dao.UsuarioDAO;
import static org.mockito.Mockito.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import models.Usuario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mindrot.jbcrypt.BCrypt;

class UsuarioDAOTest {

//    private UsuarioDAO usuarioDAO;
//    private Connection mockConnection;
//    private PreparedStatement mockPreparedStatement;
//    private ResultSet mockResultSet;
//
//    @BeforeEach
//    void setUp() throws Exception {
//        mockConnection = mock(Connection.class);
//        mockPreparedStatement = mock(PreparedStatement.class);
//        mockResultSet = mock(ResultSet.class);
//
//        ConexionBD mockConexionBD = mock(ConexionBD.class);
//        when(mockConexionBD.getConnection()).thenReturn(mockConnection);
//
//        usuarioDAO = new UsuarioDAO();
//    }
//
//    @Test
//    void testRegistrarUsuarioNuevo() throws Exception {
//        // Simular que el usuario no está registrado
//        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
//        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
//        when(mockResultSet.next()).thenReturn(true);
//        when(mockResultSet.getInt(1)).thenReturn(0);
//
//        Usuario nuevoUsuario = new Usuario("John", "Doe", "john.doe@example.com", "password123");
//
//        usuarioDAO.Registrar(nuevoUsuario);
//
//        verify(mockPreparedStatement, times(1)).setString(1, "John");
//        verify(mockPreparedStatement, times(1)).setString(2, "Doe");
//        verify(mockPreparedStatement, times(1)).setString(3, "john.doe@example.com");
//        verify(mockPreparedStatement, times(1)).setString(eq(4), anyString()); // Contraseña encriptada
//        verify(mockPreparedStatement, times(1)).executeUpdate();
//    }
//
//    @Test
//    void testRegistrarUsuarioExistente() throws Exception {
//        // Simular que el usuario ya está registrado
//        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
//        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
//        when(mockResultSet.next()).thenReturn(true);
//        when(mockResultSet.getInt(1)).thenReturn(1);
//
//        Usuario usuarioExistente = new Usuario("Jane", "Doe", "jane.doe@example.com", "password123");
//
//        usuarioDAO.Registrar(usuarioExistente);
//
//        verify(mockPreparedStatement, never()).executeUpdate(); // No debe intentar insertar
//    }
//
//    @Test
//    void testIniciarSesionExitoso() throws Exception {
//        String correo = "test@example.com";
//        String contrasenia = "password123";
//        String hashContrasenia = BCrypt.hashpw(contrasenia, BCrypt.gensalt());
//
//        // Simular que el usuario existe y devolver el hash de la contraseña
//        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
//        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
//        when(mockResultSet.next()).thenReturn(true);
//        when(mockResultSet.getString("contrasenia")).thenReturn(hashContrasenia);
//
//        usuarioDAO.IniciarSesion(correo, contrasenia);
//
//        verify(mockPreparedStatement, times(1)).setString(1, correo);
//        verify(mockPreparedStatement, times(1)).executeQuery();
//    }
//
//    @Test
//    void testIniciarSesionContraseniaIncorrecta() throws Exception {
//        String correo = "test@example.com";
//        String contrasenia = "wrongpassword";
//        String hashContrasenia = BCrypt.hashpw("password123", BCrypt.gensalt());
//
//        // Simular que el usuario existe pero con un hash diferente
//        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
//        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
//        when(mockResultSet.next()).thenReturn(true);
//        when(mockResultSet.getString("contrasenia")).thenReturn(hashContrasenia);
//
//        usuarioDAO.IniciarSesion(correo, contrasenia);
//
//        verify(mockPreparedStatement, times(1)).setString(1, correo);
//        verify(mockPreparedStatement, times(1)).executeQuery();
//    }
}

