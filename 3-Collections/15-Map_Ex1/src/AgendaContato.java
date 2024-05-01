import java.util.HashMap;
import java.util.Map;

public class AgendaContato {
    private Map<String,Integer> mapAgenda;

    public AgendaContato() {
        this.mapAgenda = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        mapAgenda.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!mapAgenda.isEmpty()){
            mapAgenda.remove(nome);
        }
        
    }

    public Map<String,Integer> exibirContatos(){
        return mapAgenda;
    }

    public Integer pesquisarContato(String nome){
        
        Integer numeroContato = null;
        if(!mapAgenda.isEmpty()){
            numeroContato = mapAgenda.get(nome);
        }
        return numeroContato;
    }


    
}
