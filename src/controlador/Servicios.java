/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import modelo.alquiler;
import servicio.Conexion;
import servicio.UsuarioServicios;
import vista.Formulario;
import modelo.Usuario;

/**
 *
 * @author CAMILO
 */
public class Servicios implements ActionListener {

    private Formulario formulario;

    public Servicios() {
    }

    public Servicios(Formulario formulario) {
        this.formulario = formulario;
        actionListener(this);
    }

    private void actionListener(ActionListener controlador) {
        formulario.btnregistrar.addActionListener(controlador);
        formulario.btnlimpiar.addActionListener(controlador);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        try {

            if (evento.getActionCommand().contentEquals("Registrar Alquiler")) {
                String nombre = formulario.txtnombre.getText();
                String identificacion = formulario.txtdocumento.getText();
                String id = identificacion.substring(identificacion.length() - 4, identificacion.length());
                String edad = formulario.txtedad.getText();

                Usuario usuario = new Usuario(id, identificacion, nombre, Integer.parseInt(edad));
                alquiler al = new alquiler();
                al.setUsuario(usuario);

                Servicios servicios = new Servicios();
                servicios.Alquilar(al);

            } else if (evento.getActionCommand().contentEquals("Limpiar")) {
              /*
                formulario.txtnombre.setText(" ");
                formulario.txtdocumento.setText(" ");
                formulario.txtedad.setText(" ");

                formulario.txtsencilla.setText(" ");
                formulario.txtdoble.setText(" ");
                formulario.txtsuite.setText(" ");
               */
            }

        } catch (Exception e) {
        }

    }

    public void Alquilar(alquiler alquiler) {
        try {
            UsuarioServicios us = new UsuarioServicios();
            us.guardar(Conexion.obtener(), alquiler.getUsuario());

        } catch (SQLException | ClassNotFoundException e) {
        }

    }

}
