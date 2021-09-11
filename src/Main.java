public class Main {

    public static void main(String[] args) {

        System.out.println("Atividade 1 - Loja de Varejo");

        Clientes cliente1 = new Clientes("Adilson Monteiro", "Rua Aqui de Casa, s/n", "58588285585", "15-5485959");
        Vendedores vendedor1 = new Vendedores("Jose Vejo", "8784848484", "54-4854848", "Alegrete", "Andressa Sacco");
        Produtos prod1 = new Produtos("notebook", "R$2000,00");
        Vendas venda1 = new Vendas("Porto Alegre", prod1, "a vista", vendedor1);
        Estoque estoque = new Estoque("Alegrete", "eletronico", "disponível");
        Fornecedores fornecedor1 = new Fornecedores("Atacadao S/A", "11-9999999", "Av. Num sei o num, s/n",
                "891897184149", "Racao Animal");
        Transportadora trans1 = new Transportadora("TransportaTudo", "85-5485484848", "Av das Avenidas, 1000",
                "Canoa Furada", "Sergipe");

        // imprimir dados

        System.out.printf(
                "O cliente %s realizou a compra de um %s no dia %s junto ao vendedor %s na filial %s. O produto esta %s com o fornecedor %s e será entregue pela transportadora %s no endereço %s.",
                cliente1.getNomeCompleto(), prod1.getTipo(), venda1.getDataDaVenda(), vendedor1.getNome(),
                venda1.getFilial(), estoque.getStatus(), fornecedor1.getNomeEmpresa(), trans1.getNomeEmpresa(),
                cliente1.getEndereco());
    }
}
