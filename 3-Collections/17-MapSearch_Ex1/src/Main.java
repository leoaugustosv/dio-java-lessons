public class Main {
    public static void main(String[] args) throws Exception {
        EstoqueProdutos estoque1 = new EstoqueProdutos();
        
        estoque1.adicionarProduto("1", "Banana", 2.50, 3);
        estoque1.adicionarProduto("2", "Alho", 1.99, 55);
        estoque1.adicionarProduto("3", "Açúcar", 5, 15);
        estoque1.adicionarProduto("4", "Sal", 8, 8);
        estoque1.adicionarProduto("5", "Carne", 69.99, 20);
        estoque1.adicionarProduto("6", "Guardanapos", 2, 125);
        estoque1.adicionarProduto("7", "Ventilador", 159.99, 6);

        //System.out.println(estoque1.exibirProdutos());
        //System.out.println(estoque1.exibirProdutoMaisBarato());
        //System.out.println(estoque1.exibirProdutoMaisCaro());
        //System.out.println(estoque1.obterProdutoComMaisQuantidadeEstoque());
        System.out.println(estoque1.obterProdutoComMaisQTDeValorEstoque());
    }
}
