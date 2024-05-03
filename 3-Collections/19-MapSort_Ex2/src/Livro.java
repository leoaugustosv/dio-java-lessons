import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class Livro {
    private String nome, autor;
    private double preco;

    public Livro(String nome, String autor, double preco) {
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Livro [nome=" + nome + ", autor=" + autor + ", preco=R$" + preco + "]";
    }
}

class LivroComparatorPreco implements Comparator<Map.Entry<String, Livro>>{
    @Override
    public int compare(Entry<String, Livro> o1, Entry<String, Livro> o2) {
        return Double.compare(o2.getValue().getPreco(), o1.getValue().getPreco());
    }
}

class LivroComparatorAutor implements Comparator<Map.Entry<String,Livro>>{

    @Override
    public int compare(Entry<String, Livro> o1, Entry<String, Livro> o2) {
        return o1.getValue().getAutor().compareTo(o2.getValue().getAutor());
    }

}