public class Main {
    public static void main(String[] args) throws Exception {
        ListaTarefas lista1 = new ListaTarefas();
        System.out.println(lista1.obterNumeroTotalTarefas());
        lista1.adicionarTarefa("Dormir");
        lista1.adicionarTarefa("Acordar");
        System.out.println(lista1.obterNumeroTotalTarefas());
        lista1.obterDescricoesTarefas();
       lista1.obterTarefaEspecifica(1);
        
    }
}
