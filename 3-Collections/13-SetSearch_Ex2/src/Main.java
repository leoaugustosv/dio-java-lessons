public class Main {
    public static void main(String[] args) throws Exception {
        ListaTarefas lista1 = new ListaTarefas();

        Tarefa comer = new Tarefa("Comer", false);
        Tarefa dormir = new Tarefa("Dormir", false);

        lista1.adicionarTarefa("Beber água");
        lista1.adicionarTarefa("Dormir");
        lista1.adicionarTarefa("Escovar dentes");
        lista1.adicionarTarefa("Limpar quarto");
        lista1.adicionarTarefa("Tomar banho");
        lista1.adicionarTarefa("Comer");

        lista1.concluirTarefa(comer);
        lista1.concluirTarefa(dormir);
        lista1.marcarTarefaPendente(dormir);

        System.out.println(lista1.obterTarefasConcluidas());
        //lista1.limparListaTarefas();
        System.out.println(lista1.quantidadeTarefas());

        System.out.println(lista1.exibirTarefas());
    }
}
