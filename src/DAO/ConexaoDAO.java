package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author arizio
 */
public class ConexaoDAO {
    
    // Criando método de conexão
    public Connection conectaBD(){
        

        //Criando variável de conexão com valor nulo
        Connection conn = null;
        
        // Abrindo um try catch para executar a conexão com o banco de dados
        try {
            
            // Variável para armazenar a URL
           String url = "jdbc:mysql://localhost:3306/sistemagestaooficina?useTimezone=true&serverTimezone=UTC&user=root&password=@Rizioneto1392";

            
            // variavel de conexão com o banco de dados
            conn = DriverManager.getConnection(url);
        
            
        } catch (SQLException erro) {
            
            //Mensagem de erro caso der errado a conexão com o BD
            JOptionPane.showMessageDialog(null, "ConexaoDAO" + erro.getMessage());
        }
        
        // retorna o variavel conn por causa do método conexão
        return conn;
     }
       /*
    //fechar conexao
    public static void fecharConexao(Connection conn) {
        if (conn != null) { //se estiver conectado
            try {
                conn.close();
                
            } catch (SQLException ex) {
                throw new RuntimeException("Algo de errado aconteceu com o fechamento com o banco, veja: " + ex);
            }
        }
    }

    //fechar conexão, do tipo quando só estiver conectado 
    public static void fecharConexao(Connection conn, PreparedStatement pstm) {
        if (pstm != null) {
            try {
                pstm.close();
                
            } catch (SQLException ex) {
                throw new RuntimeException("Algo de errado aconteceu com o fechamento com o banco, veja: " + ex);
            }
        }
        fecharConexao(conn);
    }

    //fechar conexão, do tipo quando só estiver conectado 
    public static void fecharConexao(Connection conn, PreparedStatement pstm, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
                
            } catch (SQLException ex) {
                throw new RuntimeException("Algo de errado aconteceu com o fechamento com o banco, veja: " + ex);
            }
        }
    }*/
}
