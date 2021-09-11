public class Transportadora {
    private String nomeEmpresa;
    private String telefone;
    private String endereco;
    private String cidade;
    private String estado;

    public Transportadora(String nomeEmpresa, String telefone, String endereco, String cidade, String estado) {
        this.nomeEmpresa = nomeEmpresa;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

}