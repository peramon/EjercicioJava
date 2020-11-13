package eva1p_aa.useCases;

import eva1p_aa.entities.Cuenta;
import javax.swing.JOptionPane;

public class RegistrarCuentaConfirmacionPassword extends RegistrarCuenta {

    public void registrarCuenta(Cuenta cuenta) {
        if (!cuenta.comprobarExistenciaLoginEmil(cuenta.getLogin(), cuenta.getEmail())) {
        JOptionPane.showMessageDialog(null,"Registrado por confirmación de coontraseña\nNombre:" 
                +cuenta.getNomApe() +"\nUsuario: "+cuenta.getLogin()+ "\nFecha: " + cuenta.getFecha()+
                "\nCorreo: "+cuenta.getEmail());
        }else{
            JOptionPane.showMessageDialog(null,"El login de la cuenta o el correo ya existen, por favor introduzca uno nuevo");
        }
    }

}
