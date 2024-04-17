import java.util.Locale;
import java.util.Scanner;

public class SobreMim {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Insira seu nome: ");
        String nome = sc.next();

        System.out.println("Insira seu sobrenome: ");
        String sobrenome = sc.next();

        System.out.println("Insira sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Insira sua altura: ");
        double altura = sc.nextDouble();
    

        System.out.println("Seu nome é "+nome+" "+sobrenome+"!");
        System.out.println("Você tem "+idade+" anos.");
        System.out.println("Sua altura é "+altura+"cm.");

        sc.close();

    }
}
