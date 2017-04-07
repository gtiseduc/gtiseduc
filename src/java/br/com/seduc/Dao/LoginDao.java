package br.com.seduc.Dao;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */




import br.com.seduc.Entidade.Login;
import br.com.seduc.util.FabricaConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;

import javax.faces.context.FacesContext;

/**
 *
 * @author SEC-EDUC02
 */
public class LoginDao {
    
    
    public void salvarLogin(Login login){
    
           
        
        try {
            
            Connection con = FabricaConexao.getConexao();
            PreparedStatement ps = con.prepareCall("INSERT INTO user (nome, senha) "+
                                 "values (?, ?)");
             ps.setString(2, login.getNome());
             ps.setString(3, login.getSenha());
             ps.execute();
             FabricaConexao.fecharConexao();
        } catch (SQLException ex) {
            Logger.getLogger(LoginDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
