package DAO;

import DTO.cadastroVeiculoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author arizio
 */
public class cadastroVeiculoDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
     ArrayList<cadastroVeiculoDTO> lista = new ArrayList<>();
    
    //Método para cadastrar Veiculos
    public void cadastrarVeiculo(cadastroVeiculoDTO objcadastroVeiculoDTO){
        String sql = "insert into cadastroVeiculo(idPlaca, Marca, Modelo, Ano, idCPF) values(?,?,?,?,?)";
        
        conn = new ConexaoDAO().conectaBD();
        
        try {
            pstm = conn.prepareCall(sql);
            pstm.setString(1, objcadastroVeiculoDTO.getPlaca());
            pstm.setString(2, objcadastroVeiculoDTO.getMarca());
            pstm.setString(3, objcadastroVeiculoDTO.getModelo());
            pstm.setString(4, objcadastroVeiculoDTO.getAno());
            pstm.setString(5, objcadastroVeiculoDTO.getIdCPF());
            pstm.execute();
            pstm.close();
            
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "cadastroVeiculoDAO" + erro);
        }
    }
    
    //Método para listar cadastroVeiculo
  public ArrayList<cadastroVeiculoDTO> listarVeiculo(){
    
        String sql = "SELECT * from cadastroVeiculo";
    
        conn = new ConexaoDAO().conectaBD();
        try {
            
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while (rs.next()){
                cadastroVeiculoDTO objcadastroVeiculoDTO = new cadastroVeiculoDTO();
                objcadastroVeiculoDTO.setPlaca(rs.getString("idPlaca"));
                objcadastroVeiculoDTO.setMarca(rs.getString("Marca"));
                objcadastroVeiculoDTO.setModelo(rs.getString("Modelo"));
                objcadastroVeiculoDTO.setAno(rs.getString("Ano")); 
                objcadastroVeiculoDTO.setIdCPF(rs.getString("idCPF"));
                
                lista.add(objcadastroVeiculoDTO);                
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "cadastroVeiculoDAO: " + erro);
        }
        return lista;       
    }
  
  //Método para Excluir Veiculos
    public void excluirVeiculo(cadastroVeiculoDTO objExcluirVeiculoDTO){
        String sql = "DELETE from cadastroVeiculo where idPlaca = ?";
        
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objExcluirVeiculoDTO.getPlaca());
          
            pstm.execute();
            
            JOptionPane.showMessageDialog(null, "Dados Deletados com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao mostrar no banco de dados! Erro:" + ex);
        }
    }
}
    