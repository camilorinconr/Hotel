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
public class UsuarioServicios {

    public void guardar(Connection conexion, modelo.Usuario usuario) throws SQLException {
        try {
            
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("INSERT INTO usuario (id,identificacion,nombre,edad)" + " VALUES(?,?,?,?)");
            consulta.setString(1, usuario.getId());
            consulta.setString(2, usuario.getIdentificacion());
            consulta.setString(3, usuario.getNombre());
            consulta.setInt(4, usuario.getEdad());
            consulta.executeUpdate();
            /*
            consulta = conexion.prepareStatement("INSERT INTO alquiler(idusuario, idhabitacion,cantidad,fecha)" + "VALUES(?,?,?,?)");
            consulta.setInt(1, alquiler.getId());
            consulta.setInt(2, alquiler.getCantidad());
            consulta.setDate(3, alquiler.getFecha());
            consulta.executeUpdate();
            */
            
        } catch (SQLException ex) {
            throw new SQLDataException(ex);
        }
    }
}
