import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> setPalavras;

    public ConjuntoPalavrasUnicas() {
        setPalavras = new HashSet<String>();
    }

    public void adicionarPalavras(String...palavras){
        for (String palavra : palavras) {
            setPalavras.add(palavra);
        }
    }

    public void removerPalavras(String...palavras){
        for (String palavra : palavras) {
            setPalavras.remove(palavra);
        }
    }

    public boolean palavraExiste(String palavra){
        for (String string : setPalavras) {
            if (string.equalsIgnoreCase(palavra)) {
                return true;
            }
        }
        return false;
    }

    public void exibirPalavras(){
        System.out.println(setPalavras);
    }

    
    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas [setPalavras=" + setPalavras + "]";
    }

    
    
}

    
