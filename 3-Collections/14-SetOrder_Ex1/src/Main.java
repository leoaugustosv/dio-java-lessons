public class Main {
    public static void main(String[] args) throws Exception {
        GerenciadorAlunos escola1 = new GerenciadorAlunos();
        escola1.adicionarAluno("Yan", "12797204069", 8);
        escola1.adicionarAluno("Jonas", "125111348989", 10);
        escola1.adicionarAluno("Carlos", "12992901049", 8);

        System.out.println(escola1.exibirAlunosPorNome());
        System.out.println(escola1.exibirAlunosPorNota());
        
    }
}
