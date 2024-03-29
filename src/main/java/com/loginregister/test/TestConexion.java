package com.loginregister.test;

import com.loginregister.conexion.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TestConexion {

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        try {
            connection = Conexion.getConnection();
            if (connection != null) {
                JOptionPane.showMessageDialog(null, "Conexión completa");
            } else {
                JOptionPane.showMessageDialog(null, "Conexión fallida");
            }
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
//finally {
//            if (connection != null) {
//                connection.close();
//            }
//        }
    }
}
