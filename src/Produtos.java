import java.time.LocalDate;

public class Produtos {
    private String tipo;
    private String preco;
    private LocalDate dataEntrada;

    public Produtos(String tipo, String preco) {
        this.tipo = tipo;
        this.preco = preco;
        this.dataEntrada = LocalDate.now();

    }

    public String getTipo() {
        return tipo;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return LocalDate return the dataEntrada
     */
    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

}