import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Dev {
    private String nome;
    private double totalXp;

    public int getLevel() {

        return (int)totalXp/100;
    }

    public double getTotalXp() {
        return totalXp;
    }


    
    private List<ConteudoEducacional> conteudosInscritos = new ArrayList<>();
    private List<ConteudoEducacional> conteudosConcluidos = new ArrayList<>();

    public void inscrever(ConteudoEducacional conteudo) {
        if(conteudosInscritos.contains(conteudo)){
            System.err.printf("ERRO 1: Você já está inscrito em %s!\n", conteudo.getTitulo());
        }
        else{
            conteudosInscritos.add(conteudo);
            System.out.printf("%s inscrito no curso %s com sucesso!\n",this.getNome(),conteudo.getTitulo());
        }
        
    }

    public void inscrever(Bootcamp bootcamp){
        // ALTERNATIVA 1: Foreach tradicional.
        
         for (ConteudoEducacional conteudoEducacional : bootcamp.getConteudos()) {
             inscrever(conteudoEducacional);
         }
        
        // ALTERNATIVA 2: API de Stream.
        //bootcamp.getConteudos().stream().forEach(this::inscrever);
        
        bootcamp.getDevs().add(this);
    }
    

    public List<ConteudoEducacional> getConteudosInscritos() {
        
        for (ConteudoEducacional insc : conteudosInscritos) {
            System.out.printf("%s -> %s - STATUS: INSCRITO.\n",this.getNome().toUpperCase(),insc.getTitulo());
        }
        return conteudosInscritos;
    }

    public void setConteudosInscritos(List<ConteudoEducacional> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public List<ConteudoEducacional> getConteudosConcluidos() {
        for (ConteudoEducacional conc : conteudosConcluidos) {
            System.out.printf("%s -> %s - STATUS: CONCLUÍDO.\n",this.getNome().toUpperCase(),conc.getTitulo());
        }
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(List<ConteudoEducacional> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    public String getNome() {
        return nome.toUpperCase();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void progredir() {
        Optional<ConteudoEducacional> conteudo = conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            conteudosConcluidos.add(conteudo.get());
            conteudosInscritos.remove(conteudo.get());
        }
        else{
            System.err.println("ERRO 2:Você não possui cursos para concluir. Inscreva-se em um novo curso para concluir!");
        }
    }

    public double calcularXp(){
        return this.totalXp = conteudosConcluidos.stream()
        .mapToDouble(conteudo -> conteudo.calcularXp())
        .sum();
    }
   
}
