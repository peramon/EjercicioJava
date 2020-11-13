package eva1p_aa.useCases;

import javax.swing.JOptionPane;

public class NotificacionAltaAdministrador implements Notificacion {
    
    public void enviar() {
        JOptionPane.showMessageDialog(null, "Cuenta enviada al administrador, para la validación");
    }
    
    public void enviarNotificacionCliente(){
        JOptionPane.showMessageDialog(null, "Su cuenta ha sido dada de alta por el administrador");
    }

}
