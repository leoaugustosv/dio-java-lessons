import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefas> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefas(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefas> tarefasParaRemover = new ArrayList<>();

        for (Tarefas t: tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao))
            tarefasParaRemover.add(t);
        }
        tarefaList.removeAll(tarefasParaRemover);
        
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
        
    }

    public void obterTarefaEspecifica(int index){
        System.out.println(tarefaList.get(index));
    }
    
}
