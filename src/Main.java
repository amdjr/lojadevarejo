public class Main {

    public static void main(String[] args) {
        System.out.println("Atividade 1 - Loja de Varejo");

        Clientes cliente1 = new Clientes();
        Vendedores vendedor1 = new Vendedores();
        Vendas venda1 = new Vendas();
        Produtos prod1 = new Produtos();
        Estoque estoque = new Estoque();
        Transportadora trans1 = new Transportadora();
        Fornecedores fornecedor1 = new Fornecedores();

        // Add dados nos objetos

        cliente1.nomeCompleto = "Adilson Monteiro";
        vendedor1.nome = "José Pedro";
        venda1.filial = "Porto Alegre";
        prod1.tipo = "notebook";
        estoque.status = "liberado";
        trans1.nomeEmpresa = "TransPortatudo";
        fornecedor1.endereco = "Rua das Avenidas, 1000";

        // imprimir dados

        System.out.printf(
                "O cliente %s realizou a compra de um %s junto ao vendedor %s na filial %s e o produto esta %s para retirada na transportadora %s no endereço %s",
                cliente1.nomeCompleto, prod1.tipo, vendedor1.nome, venda1.filial, estoque.status, trans1.nomeEmpresa,
                fornecedor1.endereco);
    }
}
