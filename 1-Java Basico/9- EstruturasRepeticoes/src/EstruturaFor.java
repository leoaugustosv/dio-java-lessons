import java.util.Scanner;

public class EstruturaFor {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de carneirinhos a ser contada: ");
        int qtdCarneiros = sc.nextInt();

        for (int i = 1; i <= qtdCarneiros; i++) {
            if (i == 1) {
                System.out.printf("%s carneirinho já passou pela cerca!\n", i);
            }
            else if (i == qtdCarneiros) {
                System.out.printf("Um total de %s carneirinhos passaram pela cerca!!!\n", i);
            }
            else{
                System.out.printf("%s carneirinhos já passaram pela cerca!\n", i);
            }
        }

        sc.close();

        
    }
}
