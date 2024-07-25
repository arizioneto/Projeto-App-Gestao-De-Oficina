package DAO;

import java.sql.Connection;
import DTO.cadastroClienteDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author arizio
 */
public class CadastroClienteDAO {
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;   
    ArrayList<cadastroClienteDTO> lista = new ArrayList<>();
    
    //Método para cadastrar os clientes
    public void cadastrarCliente(cadastroClienteDTO objCadastroClienteDTO){
        String sql = "insert into cadastroCliente (idCPF, Nome, Telefone, Email, Endereco) values(?,?,?,?,?)";
        
        conn = new ConexaoDAO().conectaBD();
        
        try {
            pstm=conn.prepareStatement(sql);
            pstm.setString(1, objCadastroClienteDTO.getIdCPF());
            pstm.setString(2, objCadastroClienteDTO.getNome());
            pstm.setString(3, objCadastroClienteDTO.getTel());
            pstm.setString(4, objCadastroClienteDTO.getEmail());
            pstm.setString(5, objCadastroClienteDTO.getEndereco());
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "CadastroCliente" + erro);
        }
    }
    
    //método para listar os Clientes
     public ArrayList<cadastroClienteDTO> listarCliente(){
    
        String sql = "SELECT * from cadastroCliente";
    
        conn = new ConexaoDAO().conectaBD(); // Conexão com banco de dados
        try {
            
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while (rs.next()){
                cadastroClienteDTO objcadastroClienteDTO = new cadastroClienteDTO();
                objcadastroClienteDTO.setIdCPF(rs.getString("idCPF"));
                objcadastroClienteDTO.setNome(rs.getString("Nome"));
                objcadastroClienteDTO.setTel(rs.getString("Telefone"));
                objcadastroClienteDTO.setEmail(rs.getString("Email"));
                objcadastroClienteDTO.setEndereco(rs.getString("Endereco"));
                
                lista.add(objcadastroClienteDTO);                
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ClienteListDAO: " + erro);
        }
        return lista;
    }         
     
     //Método para atualizar os dados dos usuarios ja cadastrados
    public void AtualizarUsuario(cadastroClienteDTO objClienteAtualizaDTO) {
        
        //conexão com o BD
        conn = new ConexaoDAO().conectaBD();

        String sql = "UPDATE cadastroUsuario SET idCPF= ?, Nome= ?, Tel= ?,"
                + " Email = ?, Endereco = ?"
                + "WHERE idCPF = ?";


        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(0, objClienteAtualizaDTO.getIdCPF());
            pstm.setString(1, objClienteAtualizaDTO.getNome());
            pstm.setString(2, objClienteAtualizaDTO.getTel());
            pstm.setString(3, objClienteAtualizaDTO.getEmail());
            pstm.setString(4, objClienteAtualizaDTO.getEndereco());
           

            pstm.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao mostrar no banco de dados! Erro:" + ex);
        }
     }
    
    //Método para Excluir Clientes
    public void excluirCliente(cadastroClienteDTO objExcluirClienteDTO){
        String sql = "DELETE from cadastroCliente where idCPF = ?";
        
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objExcluirClienteDTO.getIdCPF());
          
            pstm.execute();
            
            JOptionPane.showMessageDialog(null, "Dados Deletados com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao mostrar no banco de dados! Erro:" + ex);
        }
    }
    
}
