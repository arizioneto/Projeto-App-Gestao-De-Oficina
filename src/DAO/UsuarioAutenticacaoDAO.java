package DAO;

import DTO.UsuarioAutenticacaoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Arizio
 */
public class UsuarioAutenticacaoDAO {
    
    Connection conn;
    
    public ResultSet autenticacaoUsuario(UsuarioAutenticacaoDTO objUsuarioDTO){
        conn = new ConexaoDAO().conectaBD();
        try {
            String sql = "select * from cadastroUsuario where Login = ? and Senha = ?";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objUsuarioDTO.getLoginUsuario());
            pstm.setString(2, objUsuarioDTO.getSenhaUsuario());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"UsuarioDAO: "+ erro);
            return null;
        }
        
    }         
    
}
