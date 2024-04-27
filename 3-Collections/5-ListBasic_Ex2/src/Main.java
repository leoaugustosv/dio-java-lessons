public class Main {
    public static void main(String[] args) throws Exception {
        CarrinhoCompras carrefour = new CarrinhoCompras();
        carrefour.adicionarProduto("Arroz", 20.0, 2);
        carrefour.exibirCarrinho();
        carrefour.adicionarProduto("Feijao", 16.0, 3);
        carrefour.adicionarProduto("Batata", 5.0, 5);
        carrefour.exibirCarrinho();
        carrefour.removerProduto("Abóbora");
        carrefour.removerUnidadesProduto("Batata", 5);
        carrefour.exibirCarrinho();
        
        System.out.println("Valor total da compra: R$"+carrefour.calcularValorTotal());

        CarrinhoCompras extra = new CarrinhoCompras();
        extra.adicionarProduto("Carne",80.0,1);
        extra.exibirCarrinho();
    }
}
