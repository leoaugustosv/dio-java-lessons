import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> setTarefas;

    public ListaTarefas() {
        this.setTarefas = new HashSet<Tarefa>();
    }

    public void adicionarTarefa(String descricao){
        setTarefas.add(new Tarefa(descricao, false));
    }

    public void adicionarTarefa(String descricao, boolean isFinished){
        setTarefas.add(new Tarefa(descricao, isFinished));
    }

    public void adicionarTarefa(Tarefa tarefa){
        setTarefas.add(tarefa);
    }

    public void removerTarefa(Tarefa tarefa){
        for (Tarefa t : setTarefas) {
            if(t.getDescricao().equalsIgnoreCase(tarefa.getDescricao())){
                setTarefas.remove(tarefa);
                break;
            }
        }
    }

    public Set<Tarefa> exibirTarefas(){
        return setTarefas;
    }

    public int quantidadeTarefas(){
        return setTarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasObtidas = new HashSet<Tarefa>(); 
        for (Tarefa t : setTarefas) {
            if (t.isFinished()) {
                tarefasObtidas.add(t);
            }
        }
        return tarefasObtidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasObtidas = new HashSet<Tarefa>(); 
        for (Tarefa t : setTarefas) {
            if (!t.isFinished()) {
                tarefasObtidas.add(t);
            }
        }
        return tarefasObtidas;
    }

    public void concluirTarefa(Tarefa tarefa){
        for (Tarefa t : setTarefas) {
            if(t.getDescricao().equalsIgnoreCase(tarefa.getDescricao())){
                t.setFinished(true);
                break;
            }
        }
    }

    public void marcarTarefaPendente(Tarefa tarefa){
        for (Tarefa t : setTarefas) {
            if(t.getDescricao().equalsIgnoreCase(tarefa.getDescricao())){
                t.setFinished(false);
                break;
            }
        }
    }

    public void limparListaTarefas(){
        Set<Tarefa> limparTarefas = new HashSet<Tarefa>();
        for (Tarefa t : setTarefas) {
            limparTarefas.add(t);
            }
            setTarefas.removeAll(limparTarefas);
        }
        
    }





