package eva1p_aa.useCases;

import javax.swing.JOptionPane;

public class NotificacionEmail implements Notificacion {
    
    public void enviar() {
        JOptionPane.showMessageDialog(null, "Su email ha sido enviado para validacion");
    }

}
