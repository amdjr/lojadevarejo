import java.time.LocalDate;

public class Vendas {
    private String filial;
    private Produtos tipoDeProduto;
    private String tipoDeVenda;
    private Vendedores vendedor;
    private LocalDate dataDaVenda;

    public Vendas(String filial, Produtos tipoDeProduto, String tipoDeVenda, Vendedores vendedor) {
        this.filial = filial;
        this.tipoDeProduto = tipoDeProduto;
        this.tipoDeVenda = tipoDeVenda;
        this.vendedor = vendedor;
        this.dataDaVenda = LocalDate.now();
    }

    // Getters e Setters

    public String getFilial() {
        return filial;
    }

    public Produtos getTipoDeProduto() {
        return tipoDeProduto;
    }

    public String getTipoDeVenda() {
        return tipoDeVenda;
    }

    public Vendedores getVendedor() {
        return vendedor;
    }

    public LocalDate getDataDaVenda() {
        return dataDaVenda;
    }

}