public class Main {
    public static void main(String[] args) throws Exception {
        CatalogoLivros catalogo1 = new CatalogoLivros();

        Livro livro1 = new Livro("Livro1", "Machado de Assis", 2010);
        Livro livro2 = new Livro("Livro2", "Machado de Assis", 2013);
        Livro livro3 = new Livro("Livro3", "Barbosa Siqueira", 2015);
        Livro livro4 = new Livro("Livro4", "Albuquerque Ramos", 2019);

        CatalogoLivros catalogo2 = new CatalogoLivros();

        catalogo1.adicionarLivro(livro1);
        catalogo1.adicionarLivro(livro2);
        catalogo1.adicionarLivro(livro3);
        catalogo1.adicionarLivro(livro4);

        //System.out.println(catalogo1.exibirCatalogo());

        //System.out.println(catalogo1.pesquisarPorIntervaloAnos(2010, 2016));
        //System.out.println(catalogo1.pesquisarPorAutor("Machado de Assis"));

        System.out.println(catalogo1.pesquisarPorTitulo("Livro2"));
        System.out.println(catalogo2.exibirCatalogo());
    }
}
