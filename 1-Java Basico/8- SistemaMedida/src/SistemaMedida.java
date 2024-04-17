import java.util.Scanner;

public class SistemaMedida {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sigla a ser impressa: ");
        String etiqueta = sc.next();

        switch (etiqueta.toUpperCase()) {
            case "PP":
            System.out.println("EXTRA PEQUENO");
            break;
            case "P":
            System.out.println("PEQUENO");
            break;
            case "M":
            System.out.println("MÉDIO");
                break;
            case "G":
            System.out.println("GRANDE");
                break;
            case "GG":
            System.out.println("EXTRA GRANDE");
                break;
            default:
            System.out.println("Sigla incorreta. Tente novamente.");
                break;
        }

        sc.close();

    }
}
