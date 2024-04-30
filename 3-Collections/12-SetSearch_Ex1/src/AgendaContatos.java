import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> setContatos;

    public AgendaContatos() {
        this.setContatos = new HashSet<>();
    }

    public void adicionarContatos(String nome, int num){
        setContatos.add(new Contato(nome, num));
    }

    public Set<Contato> exibirContatos(){
        return setContatos;
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosEncontrados = new HashSet<>();

        for (Contato contato : setContatos) {
            if(contato.getNome().startsWith(nome)){
                contatosEncontrados.add(contato);
            }

        }

        return contatosEncontrados;
    }

    public Contato atualizarNumeroContato(String nome, int numeroAntigo, int numeroNovo){
        Contato contatoAtt = null;
        for (Contato contato : setContatos) {
            if(contato.getNome().equalsIgnoreCase(nome) && contato.getNumero() == numeroAntigo){
                contato.setNumero(numeroNovo);
                contatoAtt = contato;
                break;
            }
        }
        return contatoAtt;
    }
    
}
