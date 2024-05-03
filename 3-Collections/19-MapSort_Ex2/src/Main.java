public class Main {
    public static void main(String[] args) throws Exception {
        LivrariaOnline livraria1 = new LivrariaOnline();
        livraria1.adicionarLivro("ISBN1", "Livro Bom","Joaquim", 29.99);
        livraria1.adicionarLivro("ISBN2", "Livro Interessante","Paulo", 170.00);
        livraria1.adicionarLivro("ISBN3", "Livro Educativo","Zenon", 61.99);
        livraria1.adicionarLivro("ISBN4", "Livro Científico","Balerdroch", 109.99);
        livraria1.adicionarLivro("ISBN5", "Livro Infantil","Márcia", 19.99);

        //System.out.println(livraria1.exibirLivrosOrdenadosAutor());
        //System.out.println(livraria1.exibirLivrosOrdenadosPreco());
        //System.out.println(livraria1.obterLivroMaisBarato());
        //System.out.println(livraria1.obterLivroMaisCaro());
        //System.out.println(livraria1.pesquisarLivroPorISBN("ISBN3"));
        System.out.println(livraria1.pesquisarLivrosPorAutor("Balerdroch"));
    }
}
