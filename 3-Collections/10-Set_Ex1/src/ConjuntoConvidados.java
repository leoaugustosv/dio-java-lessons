import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados{
    private Set<Convidado> convidadoSet;


    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<Convidado>();
    };

    public void adicionarConvidado(String nome, int codigoConvite) throws Exception{
            convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoRemovido = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoRemovido = c;
                System.out.println("Convidado removido: "+c);
                break;
            }
        }
        if(convidadoRemovido == null){
            System.out.println("Convidado não encontrado!");
        }
        convidadoSet.remove(convidadoRemovido);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public Set<Convidado> exibirConvidados(){
        return convidadoSet;
    }

}