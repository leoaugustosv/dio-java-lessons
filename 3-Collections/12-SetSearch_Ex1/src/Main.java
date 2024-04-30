public class Main {
    public static void main(String[] args) throws Exception {
       AgendaContatos agenda1 = new AgendaContatos();
       agenda1.adicionarContatos("Pedro", 944331212);
       agenda1.adicionarContatos("Alberto", 938381238);
       agenda1.adicionarContatos("José", 912341234);
       agenda1.adicionarContatos("Lauro", 940408080);
       System.out.println(agenda1.exibirContatos());

       System.out.println(agenda1.pesquisarPorNome("Lauro"));
       System.out.println(agenda1.atualizarNumeroContato("Lauro", 940408080, 916666644));
       System.out.println(agenda1.exibirContatos());
    }
}
