package br.com.seduc.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SEC-EDUC02
 */
public class FabricaConexao {
   /*
    public static Connection getConnection() throws Exception{
      try{

         Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost/teste", "VICTOR", "GTISEDUCVIC");
      } 

      catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }   
    public static void closeConnection(Connection conn, Statement stmt, ResultSet rs)throws Exception{
        close(conn,stmt,rs);
    }

    public static void closeConnection(Connection conn, Statement stmt)throws Exception{
        close(conn,stmt,null);
    }

    public static void closeConnection(Connection conn)throws Exception{
        close(conn,null,null);
    }

    private static void close(Connection conn, Statement stmt, ResultSet rs) throws Exception{
        try{
            if(rs!=null) rs.close();
            if(stmt!=null)stmt.close();
            if(conn!=null)conn.close();
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }*/
    
    
    private static Connection conexao;
    private static final String URL_CONEXAO = "jdbc:mysql://localhost/teste";
    private static final String USER = "VICTOR";
    private static final String PASSWORD = "GTISEDUCVIC";

    public static Connection getConexao(){
    if(conexao == null){
            try {
                Class.forName("com.msql.jdbc.Driver");
                conexao = DriverManager.getConnection(URL_CONEXAO,USER,PASSWORD);
            } catch (SQLException ex) {
                Logger.getLogger(FabricaConexao.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FabricaConexao.class.getName()).log(Level.SEVERE, null, ex);
            }
    
    }
   
    return conexao;
    
    }
    
    public static void fecharConexao(){
    
        if(conexao != null){
            try {
                conexao.close();
                conexao = null;
            } catch (SQLException ex) {
                Logger.getLogger(FabricaConexao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
