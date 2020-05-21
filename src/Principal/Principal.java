/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import vista.Formulario;
import controlador.Servicios;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author CAMILO
 */
public class Principal {

    public static void main(String[] args) {
       
        Formulario f = new Formulario();

        new Servicios(f);
        
        f.setLocationRelativeTo(f);
        f.setVisible(true);
      
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
}
