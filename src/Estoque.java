
public class Estoque {
    private String filial;
    private String tipoProduto;
    private String status;

    public Estoque(String filial, String tipoProduto, String status) {
        this.filial = filial;
        this.tipoProduto = tipoProduto;
        this.status = status;
    }

    public String getFilial() {
        return filial;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}