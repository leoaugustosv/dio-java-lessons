import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LivrariaOnline {
    private Map<String, Livro> mapLivraria;

    public LivrariaOnline() {
        this.mapLivraria = new HashMap<String, Livro>();
    }

    public void adicionarLivro(String isbn, Livro livro){
        mapLivraria.put(isbn, livro);
    }

    public void adicionarLivro(String isbn, String nome, String autor, double preco){
        mapLivraria.put(isbn, new Livro(nome, autor, preco));
    }

    public Map<String,Livro> exibirLivrosOrdenadosPreco(){
        List<Map.Entry<String, Livro>> livrosParaOrdenar = new ArrayList<>(mapLivraria.entrySet());

        Collections.sort(livrosParaOrdenar,new LivroComparatorPreco());

        Map<String,Livro> livrosOrdenados = new LinkedHashMap<>();

        for (Map.Entry<String,Livro> livro : livrosParaOrdenar) {
            livrosOrdenados.put(livro.getKey(), livro.getValue());
        }
        return livrosOrdenados;
    }

    public Map<String,Livro> exibirLivrosOrdenadosAutor(){
        List<Map.Entry<String,Livro>> livrosOrdenar = new ArrayList<>(mapLivraria.entrySet());

        Collections.sort(livrosOrdenar,new LivroComparatorAutor());

        Map<String,Livro> livrosOrdenados = new LinkedHashMap<>();
        for (Map.Entry<String,Livro> entry : livrosOrdenar) {
            livrosOrdenados.put(entry.getKey(), entry.getValue());
        }
        return livrosOrdenados;
    }


    public void removerLivro(String isbn, Livro livro){
        mapLivraria.remove(isbn);
    }

    public void removerLivro(String titulo){
        List<Map.Entry<String,Livro>> livrosParaRemover = new ArrayList<>(mapLivraria.entrySet());

        for (Map.Entry<String,Livro> entry : livrosParaRemover) {
            if(entry.getValue().getNome() == titulo){
                mapLivraria.remove(entry.getKey());
            }
        }
    }

    public Map<String,Livro> pesquisarLivrosPorAutor (String autor){

        Map<String,Livro> livrosEncontrados = new LinkedHashMap<>();

        for (Map.Entry<String,Livro> entry : mapLivraria.entrySet()) {

            if (entry.getValue().getAutor().equalsIgnoreCase(autor)) {
                livrosEncontrados.put(entry.getKey(), entry.getValue());
            }
        }
        return livrosEncontrados;
    }

    public Livro pesquisarLivroPorISBN(String isbn){
       return mapLivraria.get(isbn);
    }

    public Livro obterLivroMaisCaro(){
        Livro livroMaisCaro = null;
        double valorLivro = Double.MIN_VALUE;
        for (Map.Entry<String,Livro> entry : mapLivraria.entrySet()) {
            if (entry.getValue().getPreco() > valorLivro) {
                valorLivro = entry.getValue().getPreco();
                livroMaisCaro = entry.getValue();
            }
        }
        return livroMaisCaro;
    }

    public Livro obterLivroMaisBarato(){
        Livro livroMaisBarato = null;
        double valorLivro = Double.MAX_VALUE;
        for (Map.Entry<String,Livro> entry : mapLivraria.entrySet()) {
            if (entry.getValue().getPreco() < valorLivro) {
                valorLivro = entry.getValue().getPreco();
                livroMaisBarato = entry.getValue();
            }
        }
        return livroMaisBarato;
    }

    


    
}

