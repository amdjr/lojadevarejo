public class Vendedores {
    private String nome;
    private String cpf;
    private String telefone;
    private String filial;
    private String gerente;

    public Vendedores(String nome, String cpf, String telefone, String filial, String gerente) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.filial = filial;
        this.gerente = gerente;
    }

    public String getNome() {
        return nome;
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

    public String getFilial() {
        return filial;
    }

    public void setFilial(String filial) {
        this.filial = filial;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

}