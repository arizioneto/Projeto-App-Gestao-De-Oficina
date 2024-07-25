package DTO;

/**
 *
 * @author Arizio 
 */
public class cadastroUsuarioDTO {
    private static String NomeUsuarioCadastro ,loginUsuarioCadastro, senhaUsuarioCadastro, Tipo;
    public static String idUsuario;
    
    /**
     * @return the loginUsuarioCadastro
     */
    public String getLoginUsuarioCadastro() {
        return loginUsuarioCadastro;
    }

    /**
     * @param loginUsuarioCadastro the loginUsuarioCadastro to set
     */
    public void setLoginUsuarioCadastro(String loginUsuarioCadastro) {
        this.loginUsuarioCadastro = loginUsuarioCadastro;
    }

    /**
     * @return the senhaUsuarioCadastro
     */
    public String getSenhaUsuarioCadastro() {
        return senhaUsuarioCadastro;
    }

    /**
     * @param senhaUsuarioCadastro the senhaUsuarioCadastro to set
     */
    public void setSenhaUsuarioCadastro(String senhaUsuarioCadastro) {
        this.senhaUsuarioCadastro = senhaUsuarioCadastro;
    }

    /**
     * @return the Tipo
     */
    public String getTipo() {
        return Tipo;
    }

    /**
     * @param Tipo the Tipo to set
     */
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    /**
     * @return the idUsuario
     */
    public String getIdUsuario() {
        return idUsuario;
    }
    
    /**
     * @return the NomeUsuarioCastro
     */
    public String getNomeUsuarioCadastro() {
        return NomeUsuarioCadastro;
    }

    /**
     * @param NomeUsuarioCadastro the NomeUsuarioCastro to set
     */
    public void setNomeUsuarioCadastro(String NomeUsuarioCadastro) {
        this.NomeUsuarioCadastro = NomeUsuarioCadastro;
    }
    
    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    } 
    
}
