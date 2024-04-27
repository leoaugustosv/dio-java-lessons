public class Produto {

    private String nome;
    private Double preco;
    private int qtd;

    public Produto(String nome, Double preco, int qtd) {

        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + ", qtd=" + qtd + "]";
    }

    

    
}
