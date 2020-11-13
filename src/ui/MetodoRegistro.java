/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import eva1p_aa.entities.Cuenta;
import javax.swing.JOptionPane;

/**
 *
 * @author paul
 */
public class MetodoRegistro {
    
    public void SeleccionarLogueo(){
        int op ;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion para registrarse\n1.- Confirmación password"
                + "\n2.- Confirmación email\n3.- Confirmación admininstrador"));
            switch (op) {
                case 1:
                    NewJFramePassword framePassword = new NewJFramePassword();
                    framePassword.setVisible(true);
                    break;
                case 2:
                    NewJFrameCorreo frameCorreo = new NewJFrameCorreo();
                    frameCorreo.setVisible(true);
                    break;
                case 3:
                    NewJFrameAltaAdministrador frameAdministrador = new NewJFrameAltaAdministrador();
                    frameAdministrador.setVisible(true);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Por favor ingrese una opcion correcta");
            }
        } while (op > 3 || op < 1);
    }
}
