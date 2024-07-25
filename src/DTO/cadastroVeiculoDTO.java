package DTO;

/**
 *
 * @author arizio
 */
public class cadastroVeiculoDTO {
    private String Modelo, Marca, Ano, Nome, idCPF;
    public static String idPlaca;
    /**
     * @return the Placa
     */
    public String getPlaca() {
        return idPlaca;
    }

    /**
     * @param Placa the Placa to set
     */
    public void setPlaca(String Placa) {
        this.idPlaca = Placa;
    }

    /**
     * @return the Modelo
     */
    public String getModelo() {
        return Modelo;
    }

    /**
     * @param Modelo the Modelo to set
     */
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    /**
     * @return the Marca
     */
    public String getMarca() {
        return Marca;
    }

    /**
     * @param Marca the Marca to set
     */
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    /**
     * @return the Ano
     */
    public String getAno() {
        return Ano;
    }

    /**
     * @param Ano the Ano to set
     */
    public void setAno(String Ano) {
        this.Ano = Ano;
    }

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
     * @return the idCPF
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
}
