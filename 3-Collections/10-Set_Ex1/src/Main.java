public class Main {
    public static void main(String[] args) throws Exception {
        ConjuntoConvidados listaConvidados1 = new ConjuntoConvidados();

        System.out.println(listaConvidados1.exibirConvidados());
        listaConvidados1.adicionarConvidado("Leoncio", 151503015);
        listaConvidados1.adicionarConvidado("Margarida", 384778);
        listaConvidados1.adicionarConvidado("Removildo", 398491);
        listaConvidados1.adicionarConvidado("Mario", 384778);

        System.out.println(listaConvidados1.exibirConvidados());

        listaConvidados1.removerConvidadoPorCodigoConvite(398491);

        System.out.println(listaConvidados1.exibirConvidados());
        System.out.println(listaConvidados1.contarConvidados());
    }
}
