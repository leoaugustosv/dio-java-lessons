import java.util.Comparator;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private String matricula;
    private int nota;

    public Aluno(String nome, String matricula, int nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public int getNota() {
        return nota;
    }
    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", matricula=" + matricula + ", nota=" + nota + "]";
    }

    @Override
    public int compareTo(Aluno o) {
        return nome.compareToIgnoreCase(o.getNome());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if (matricula == null) {
            if (other.matricula != null)
                return false;
        } else if (!matricula.equals(other.matricula))
            return false;
        return true;
    }


}

class AlunoComparator implements Comparator<Aluno>{

    @Override
    public int compare(Aluno o1, Aluno o2) {
        int comparacaoNota = Integer.compare(o1.getNota(), o2.getNota());

        if(comparacaoNota == 0){
            return o1.getNome().compareTo(o2.getNome());
        }

        return comparacaoNota;
    }
    
}
