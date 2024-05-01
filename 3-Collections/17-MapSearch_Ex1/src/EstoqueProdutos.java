import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<String, Produto> mapEstoque;

    public EstoqueProdutos() {
        this.mapEstoque = new HashMap<>();
    }

    

    public void adicionarProduto(String cod, String nome, double preco, int quantidade){
        mapEstoque.put(nome, new Produto(nome, preco, quantidade));
    }

    public Map<String, Produto> exibirProdutos(){
        return mapEstoque;
    }

    public double calcularValorEstoque(){
        double valorTotalEstoque = 0;
        for (Produto produto : mapEstoque.values()) {
            valorTotalEstoque+=produto.getPreco()*produto.getQuantidade();
        }
        return valorTotalEstoque;
    }

    public Produto exibirProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!mapEstoque.isEmpty()){
        for (Produto produto : mapEstoque.values()) {
            if(produto.getPreco() > maiorPreco){
                maiorPreco = produto.getPreco();
                produtoMaisCaro = produto;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto exibirProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if(!mapEstoque.isEmpty()){
        for (Produto produto : mapEstoque.values()) {
            if(produto.getPreco() < menorPreco){
                menorPreco = produto.getPreco();
                produtoMaisBarato = produto;
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoComMaisQuantidadeEstoque(){
        Produto produtoComMaisQtd = null;
        int quantidadeProduto = Integer.MIN_VALUE;
        if (!mapEstoque.isEmpty()) {
            for (Produto produto : mapEstoque.values()) {
                if(produto.getQuantidade() > quantidadeProduto){
                    quantidadeProduto = produto.getQuantidade();
                    produtoComMaisQtd = produto;
                }
            }
        }
        return produtoComMaisQtd;
    }

    public Produto obterProdutoComMaisQTDeValorEstoque(){
        Produto produtoComMaisQtdValor = null;
        int quantidadeProduto = Integer.MIN_VALUE;
        double valorProduto = Double.MIN_VALUE;
        if (!mapEstoque.isEmpty()) {
            for (Produto produto : mapEstoque.values()) {

                if(produto.getQuantidade()*produto.getPreco() > quantidadeProduto*valorProduto){
                    quantidadeProduto = produto.getQuantidade();
                    valorProduto = produto.getPreco();
                    produtoComMaisQtdValor = produto;
                }
            }
        }
        return produtoComMaisQtdValor;
    }

    
}
