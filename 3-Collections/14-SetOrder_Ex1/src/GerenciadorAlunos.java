
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> setAlunos;

    public GerenciadorAlunos() {
        this.setAlunos = new HashSet<Aluno>();
    }

    public void adicionarAluno(Aluno aluno){
        setAlunos.add(aluno);
    }

    public void adicionarAluno(String nome, String matricula, int nota){
        setAlunos.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(Aluno aluno){
        Set<Aluno> alunosEncontrados = new HashSet<Aluno>();
        for (Aluno a : setAlunos) {
            if(a.getMatricula()==aluno.getMatricula()){
            alunosEncontrados.add(a);
            break;
            }
        }
        setAlunos.removeAll(alunosEncontrados);
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosOrdenados = new TreeSet<Aluno>(setAlunos);
        //alunosOrdenados.addAll(setAlunos);
        return alunosOrdenados;
        }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosOrdenados = new TreeSet<Aluno>(new AlunoComparator());
        alunosOrdenados.addAll(setAlunos);
        return alunosOrdenados;
        }

    public Set<Aluno> exibirTodosAlunos(){
        return setAlunos;
    }

}



    

