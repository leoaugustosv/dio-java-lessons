public class Main {
    public static void main(String[] args) throws Exception {
        Dicionario dicionario1 = new Dicionario();

        dicionario1.adicionarPalavra("Banana", "Fruta amarela.");
        dicionario1.adicionarPalavra("Maçã", "Fruta azul.");
        dicionario1.adicionarPalavra("Maçã", "Fruta vermelha.");
        
        dicionario1.adicionarPalavra("Teclado", "Periférico que permite digitação em computadores.");
        dicionario1.adicionarPalavra("Monitor", "Equipamento que permite exibicação de vídeo em computadores.");

        System.out.println(dicionario1.verDefinicao("Maçã"));
        System.out.println(dicionario1.exibirDicionario());

    }
}
