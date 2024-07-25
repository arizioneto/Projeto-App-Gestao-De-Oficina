package DTO;

/**
 *
 * @author arizio
 */
public class cadastroClienteDTO {
    public static String idCPF, Nome, Email, Endereco, Tel;
    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the Endereco
     */
    public String getEndereco() {
        return Endereco;
    }

    /**
     * @param Endereco the Endereco to set
     */
    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    /**
     * @return the CPF
     */
    public String getIdCPF() {
        return idCPF;
    }

    /**
     * @param idCPF the idCPF to set
     */
    public void setIdCPF(String idCPF) {
        this.idCPF = idCPF;
    }

    /**
     * @return the Tel
     */
    public String getTel() {
        return Tel;
    }

    /**
     * @param Tel the Tel to set
     */
    public void setTel(String Tel) {
        this.Tel = Tel;
    }

   
    
    
}
