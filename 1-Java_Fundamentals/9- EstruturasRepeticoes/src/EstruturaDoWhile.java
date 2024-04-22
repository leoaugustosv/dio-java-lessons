import java.util.Random;

public class EstruturaDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando ao amiguinho... Pronto!");
        do {
            System.out.println("Chamando...");
        } while (tocando());
        System.out.println("Alô!!!");
    }

    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Já atendeu? "+atendeu);
        return ! atendeu;
    }
}
