public class Fornecedores {
    private String nomeEmpresa;
    private String cnpj;
    private String telefone;
    private String endereco;
    private String tipoProduto;

    public Fornecedores(String nomeEmpresa, String telefone, String endereco, String cnpj, String tipoProduto) {
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.endereco = endereco;
        this.tipoProduto = tipoProduto;
    }

    // Getters e Setters

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public String getCnpj() {
        return cnpj;
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

    public String getTipoProduto() {
        return tipoProduto;
    }

}