package DAO;

import DTO.cadastroUsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Arizio
 */
public class cadastroUsuarioDAO {
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;   
    ArrayList<cadastroUsuarioDTO> lista = new ArrayList<>();
    
    
    //Método para cadastrar usuarios
    public void cadastrarUsuario(cadastroUsuarioDTO objCadastroUsuarioDTO){
        String sql = "insert into cadastroUsuario (Nome,Login, Senha, Tipo) values (?, ?, ?, ?)";
        
        conn = new ConexaoDAO().conectaBD();
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objCadastroUsuarioDTO.getNomeUsuarioCadastro());
            pstm.setString(2, objCadastroUsuarioDTO.getLoginUsuarioCadastro());
            pstm.setString(3, objCadastroUsuarioDTO.getSenhaUsuarioCadastro());
            pstm.setString(4, objCadastroUsuarioDTO.getTipo());
            pstm.execute();
            pstm.close();
            
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null,"UsuarioCadastroDAO: " + error);
        }
    }
    
    //método para listar usuarios
    public ArrayList<cadastroUsuarioDTO> listarUsuario(){
    
        String sql = "SELECT * from cadastroUsuario";
    
        conn = new ConexaoDAO().conectaBD();
        try {
            
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while (rs.next()){
                cadastroUsuarioDTO objcadastroUsuarioDTO = new cadastroUsuarioDTO();
                objcadastroUsuarioDTO.setIdUsuario(rs.getString("idUsuario"));
                objcadastroUsuarioDTO.setNomeUsuarioCadastro(rs.getString("Nome"));
                objcadastroUsuarioDTO.setLoginUsuarioCadastro(rs.getString("Login"));
                objcadastroUsuarioDTO.setSenhaUsuarioCadastro(rs.getString("Senha"));
                objcadastroUsuarioDTO.setTipo(rs.getString("Tipo"));      
                
                lista.add(objcadastroUsuarioDTO);                
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "usuarioCadastroDAO: " + erro);
        }
        return lista;
    } 
    
     //Método para atualizar os dados dos usuarios ja cadastrados
    public void AtualizarUsuario(cadastroUsuarioDTO objUsuarioAtualizaDTO) {
        
        //conexão com o BD
        conn = new ConexaoDAO().conectaBD();

        String sql = "UPDATE cadastroUsuario SET Nome= ?, Login= ?, Senha = ?,"
                + " Tipo = ?"
                + "WHERE idUsuario = ?";


        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objUsuarioAtualizaDTO.getNomeUsuarioCadastro());
            pstm.setString(2, objUsuarioAtualizaDTO.getLoginUsuarioCadastro());
            pstm.setString(3, objUsuarioAtualizaDTO.getSenhaUsuarioCadastro());
            pstm.setString(4, objUsuarioAtualizaDTO.getTipo());
           

            pstm.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao mostrar no banco de dados! Erro:" + ex);
        }
     }
    
    //Método para Excluir os dados já cadastrados
     public void excluirUsuario(cadastroUsuarioDTO objExcluirUsuarioDTO){
        String sql = "DELETE from cadastroCliente where idCPF = ?";
        
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objExcluirUsuarioDTO.getIdUsuario());
          
            pstm.execute();
            
            JOptionPane.showMessageDialog(null, "Dados Deletados com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao mostrar no banco de dados! Erro:" + ex);
        }
    }
}
