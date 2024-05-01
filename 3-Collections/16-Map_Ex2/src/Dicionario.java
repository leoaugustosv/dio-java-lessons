import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String,String> mapDicionario;

    public Dicionario() {
        this.mapDicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        mapDicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if(!mapDicionario.isEmpty()){
            mapDicionario.remove(palavra);
        }
    }

    public String verDefinicao(String palavra){
        String definicao = null;
        if(!mapDicionario.isEmpty()){
            definicao = mapDicionario.get(palavra);
        }
        return definicao;
    }

    public Map<String,String> exibirDicionario(){
        return mapDicionario;
    }

    
}
