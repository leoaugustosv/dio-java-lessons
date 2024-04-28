import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> listaPessoas = new ArrayList<Pessoa>();

    public OrdenacaoPessoas() {
        this.listaPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> sortedList = new ArrayList<>(listaPessoas);
        Collections.sort(sortedList);
        return sortedList;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> sortedList = new ArrayList<>(listaPessoas);
        Collections.sort(sortedList, new ComparatorAltura());
        return sortedList;
    }

    public List<Pessoa> exibirLista(){
        return listaPessoas;
    }

}
