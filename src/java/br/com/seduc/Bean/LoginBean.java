/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.seduc.Bean;


import br.com.seduc.Dao.LoginDao;
import br.com.seduc.Entidade.Login;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author SEC-EDUC02
 */
@ManagedBean
public class LoginBean {
    
    private Login login = new Login();
    
    private  List<Login> logins = new ArrayList<Login>();

    public void adicionar(){
    
         
    logins.add(login);
   // new LoginDao().salvarLogin(login);
    login = new Login();
    }
    
    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public List<Login> getLogins() {
        return logins;
    }

    public void setLogins(List<Login> logins) {
        this.logins = logins;
    }
    
    
    
}
