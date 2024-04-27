import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> catalogoLivros = new ArrayList<Livro>();

    public CatalogoLivros() {
        this.catalogoLivros = new ArrayList<Livro>();
    }

    public void adicionarLivro(Livro livro){
        catalogoLivros.add(livro);
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosEncontrados = new ArrayList<>();
        for (Livro livro : catalogoLivros) {
            if(livro.getAutor().equalsIgnoreCase(autor)){
                livrosEncontrados.add(livro);
            }
        }
        return livrosEncontrados;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosEncontrados = new ArrayList<>();
        for (Livro livro : catalogoLivros) {
            if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
                livrosEncontrados.add(livro);
            }
        }
        return livrosEncontrados;
    }

    public List<Livro> pesquisarPorTitulo(String titulo){
        List<Livro> livrosEncontrados = new ArrayList<>();
        for (Livro livro : catalogoLivros) {
            if(livro.getTitulo().equalsIgnoreCase(titulo)){
                livrosEncontrados.add(livro);
            }
        }
        return livrosEncontrados;
    }

    public List<Livro> exibirCatalogo(){
        return catalogoLivros;
    }
    

}
