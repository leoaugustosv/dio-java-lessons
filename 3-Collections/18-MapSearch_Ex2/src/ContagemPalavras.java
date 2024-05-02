import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String,Integer> mapContagem;

    public ContagemPalavras() {
        this.mapContagem = new HashMap<>();
    }

    public void adicionarPalavra(String palavra,Integer contagem){
        mapContagem.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if (!mapContagem.isEmpty()) {
            mapContagem.remove(palavra);
        }
    }

    public Map<String,Integer> exibirContagemPalavras(){
        return mapContagem;
    }

    public Map<String,Integer> exibirPalavraMaisFrequente(){
        Map<String,Integer> palavraFrequenteMap = new HashMap<>();
        String palavraMaisFrequente = null;
        int qtdPalavraFrequente = Integer.MIN_VALUE;
        if (!mapContagem.isEmpty()) {
        for (Map.Entry<String,Integer> palavra : mapContagem.entrySet()) {
            if(palavra.getValue() > qtdPalavraFrequente){
                palavraMaisFrequente = palavra.getKey();
                qtdPalavraFrequente = palavra.getValue();
            }
        }
        palavraFrequenteMap.put(palavraMaisFrequente, qtdPalavraFrequente);
    }
        return palavraFrequenteMap;
    }
    
}
