import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        try {
            
        
        

        System.out.println("Digite seu nome: ");
        String nome = sc.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = sc.next();

        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.printf("Seu nome: %s", nome);
        System.out.printf("Seu sobrenome: %s", sobrenome);
        System.out.printf("Sua altura: %s", altura);
        System.out.printf("Sua idade: %s", idade);
        
        
    }
    catch (java.util.InputMismatchException e) {
    System.err.println("---ERRO---\nOs campos de altura e idade precisam ser númericos!");
}
finally{
    sc.close();
}
}
}
