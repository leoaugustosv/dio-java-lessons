import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso cursoJavaB = new Curso();
        cursoJavaB.setTitulo("Curso de Java");
        cursoJavaB.setDescricao("Aprenda todos os conceitos básicos sobre a linguagem de programação Java!");
        cursoJavaB.setCargaHoraria(20);

        Curso cursoNET = new Curso();
        cursoNET.setTitulo("Curso de .NET Java");
        cursoNET.setDescricao("Aprenda todos os conceitos sobre o framework .NET em Java!");
        cursoNET.setCargaHoraria(30);

        Curso cursoJavaA = new Curso();
        cursoJavaA.setTitulo("Curso de Java Web");
        cursoJavaA.setDescricao("Aprenda todos os conceitos web sobre a linguagem de programação Java!");
        cursoJavaA.setCargaHoraria(15);

        Mentoria mentoriaJS = new Mentoria();
        mentoriaJS.setTitulo("Mentoria de JavaScript+Java");
        mentoriaJS.setDescricao("Participe da mentoria que traz conceitos básicos sobre JavaScript e Java!");
        mentoriaJS.setData(LocalDateTime.now());

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("GFT START - Java #1");
        bootcamp1.setInicio(LocalDate.now());
        bootcamp1.setFim(bootcamp1.getInicio().plusDays(45));
        List<ConteudoEducacional> conteudosBootcamp = Arrays.asList(cursoJavaB, cursoJavaA, mentoriaJS);
        bootcamp1.setConteudos(conteudosBootcamp);

        Dev john = new Dev();
        john.setNome("John Alves");
        john.inscrever(cursoJavaA);
        john.inscrever(cursoJavaB);
        john.inscrever(bootcamp1);
        john.progredir();
        john.getConteudosInscritos();
        john.getConteudosConcluidos();
        john.calcularXp();
        System.out.printf("\n%s, seu nível é %s! (XP TOTAL: %.1f)\n",john.getNome(),john.getLevel(),john.getTotalXp());

        Dev leo = new Dev();
        leo.setNome("Leo Silveira");
        leo.inscrever(cursoJavaA);
        leo.progredir();
        leo.inscrever(cursoJavaB);
        leo.inscrever(bootcamp1);
        leo.progredir();
        leo.getConteudosInscritos();
        leo.getConteudosConcluidos();
        leo.calcularXp();
        System.out.printf("\n%s, seu nível é %s! (XP TOTAL: %.1f)\n",leo.getNome(),leo.getLevel(),leo.getTotalXp());
    }
}
