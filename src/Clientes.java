public class Clientes {
    private String nomeCompleto;
    private String endereco;
    private String cpf;
    private String telefone;

    public Clientes(String nomeCompleto, String endereco, String cpf, String telefone) {
        this.nomeCompleto = nomeCompleto;
        this.endereco = endereco;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}