package eva1p_aa.useCases;

import eva1p_aa.entities.Cuenta;
import javax.swing.JOptionPane;

public class RegistrarCuentaConfirmacionEmail extends RegistrarCuenta {

    public void registrarCuenta(Cuenta cuenta) {
        if (!cuenta.comprobarExistenciaLoginEmil(cuenta.getLogin(), cuenta.getEmail())) {
            (new NotificacionEmail()).enviar();
            JOptionPane.showMessageDialog(null, "Email Validado: " + cuenta.getEmail() + "\nRegistrado por confirmación de correo electronico\nNombre:"
                    + cuenta.getNomApe() + "\nUsuario: " + cuenta.getLogin() + "\nFecha: " + cuenta.getFecha());
        } else {
            JOptionPane.showMessageDialog(null, "El login de la cuenta o el correo ya existen, por favor introduzca uno nuevo");
        }

    }

}
