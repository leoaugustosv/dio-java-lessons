import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Produto> listaCarrinho;

    public CarrinhoCompras() {
        this.listaCarrinho = new ArrayList<>();
    }

    public void adicionarProduto(String nome, Double preco, int qtd){
        listaCarrinho.add(new Produto(nome, preco, qtd));
    }

    public void removerProduto(String nome){
        List<Produto> produtosRemovidos = new ArrayList<>();
        for (Produto p : listaCarrinho) {
            if(p.getNome().equalsIgnoreCase(nome)){
                produtosRemovidos.add(p);
                System.out.println("Todos os produtos "+nome+" foram removidos do carrinho.");
            }
        }
        
        if(!produtosRemovidos.isEmpty()){
            listaCarrinho.removeAll(produtosRemovidos);
            
        }
        else{
            System.out.println("Produto "+nome+" não encontrado!");
        }
        
    }

    public void removerUnidadesProduto(String nome, int qtd){
        List<Produto> produtosRemovidos = new ArrayList<>();

        for (Produto p : listaCarrinho) {

            if(p.getNome().equalsIgnoreCase(nome) && p.getQtd() >= qtd){
                if(p.getQtd()-qtd > 0){
                    p.setQtd(p.getQtd()-qtd);
                    System.out.println("Foram removidas "+qtd+" quantidades de "+nome+" do carrinho.");
                }
                else{
                    produtosRemovidos.add(p);
                    System.out.println("Todos os produtos "+nome+" foram removidos do carrinho.");
                }
            }

        }
        if(!produtosRemovidos.isEmpty()){
            listaCarrinho.removeAll(produtosRemovidos);
            
        }
        else{
            System.out.println("Produto "+nome+" não encontrado!");
        }
    }

        public double calcularValorTotal(){
            double total = 0;
            for (Produto p : listaCarrinho) {
                total+= p.getPreco()*p.getQtd();
            }
            return total;
        }

        public void exibirCarrinho(){
            System.out.println(listaCarrinho);
        }


}
