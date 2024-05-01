public class Main {
    public static void main(String[] args) throws Exception {
        AgendaContato agenda1 = new AgendaContato();
        
        agenda1.adicionarContato("Léo", 946990193);
        agenda1.adicionarContato("Léo", 111444);
        agenda1.adicionarContato("Marcos", 913949548);
        System.out.println(agenda1.pesquisarContato("Marcoss"));
        System.out.println(agenda1.exibirContatos());
    }
}
