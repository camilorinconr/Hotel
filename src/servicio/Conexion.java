/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.sql.*;

/**
 *
 * @author CAMILO
 */
public class Conexion {

    private static Connection cnx = null;

    public static Connection obtener() throws SQLException, ClassNotFoundException {
        if (cnx == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                cnx = DriverManager.getConnection("jdbc:mysql://localhost/hotel", "root", "");
 
            } catch (SQLException ex) {

                throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
                throw new ClassCastException(ex.getMessage());
            }

        }
        return cnx;

    }

}
    
