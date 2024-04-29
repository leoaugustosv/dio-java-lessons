public class Main {
    public static void main(String[] args) throws Exception {
        ConjuntoPalavrasUnicas conjunto1 = new ConjuntoPalavrasUnicas();

        conjunto1.adicionarPalavras("Abraço","Amor","Albergue","Sanduíche","Estádio","Luz");

        conjunto1.exibirPalavras();

        conjunto1.adicionarPalavras("Amor","Amor","Albergue","Ameixa");

        conjunto1.exibirPalavras();

        System.out.println(conjunto1.palavraExiste("Alberguee"));
        
    }
}
