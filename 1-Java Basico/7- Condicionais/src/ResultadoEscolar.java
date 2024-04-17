import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a nota do estudante: ");
        int nota = sc.nextInt();

        String mensagemResultado = nota >= 7 ? "APROVADO" : nota == 6 ? "DE RECUPERAÇÃO" : "REPROVADO";

        System.out.printf("Aluno %s com nota %s.", mensagemResultado, nota);
        
        sc.close();
    }
}
