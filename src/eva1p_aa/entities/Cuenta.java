package eva1p_aa.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class Cuenta {
    
    public String nomApe;
    public String fecha;   
    public String login;
    public String password;
    public String email;
    
    public List<Parqueadero> misParqueaderos = new ArrayList<Parqueadero> ();

    public String getNomApe() {
        return nomApe;
    }

    public void setNomApe(String nomApe) {
        this.nomApe = nomApe;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Parqueadero> getMisParqueaderos() {
        return misParqueaderos;
    }

    public void setMisParqueaderos(List<Parqueadero> misParqueaderos) {
        this.misParqueaderos = misParqueaderos;
    }
    
    public boolean comprobarExistenciaLoginEmil(String login, String email) {
        String loginExiste = "usuario";
        String emailExiste = "usuario@ejemplo.com";
        if(login.equals(loginExiste) || email.equals(emailExiste)){
            return true;
        }else{
            return false;
        }
    }
    
    

}
