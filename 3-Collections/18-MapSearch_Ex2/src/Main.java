public class Main {
    public static void main(String[] args) throws Exception {
        ContagemPalavras contagem1 = new ContagemPalavras();

        contagem1.adicionarPalavra("Avião", 3);
        contagem1.adicionarPalavra("Dado", 5);
        contagem1.adicionarPalavra("Cabra", 11);
        contagem1.adicionarPalavra("Remédio", 2);
        contagem1.adicionarPalavra("Carro", 8);
        contagem1.adicionarPalavra("Porta", 9);
        contagem1.adicionarPalavra("Elevador", 4);

        System.out.println(contagem1.exibirContagemPalavras());
        System.out.println(contagem1.exibirPalavraMaisFrequente());
        contagem1.removerPalavra("Dado");
        System.out.println(contagem1.exibirContagemPalavras());
    }
}
