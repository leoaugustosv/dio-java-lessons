import java.util.concurrent.ThreadLocalRandom;
public class EstruturaWhile {

    public static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(0,8);
    }
    public static void main(String[] args) {
        
        double dinheiro = 50;
        int qtdDoces = 0;
        while (dinheiro > 1) {            
            double valorDoce = valorAleatorio();
            if ((valorDoce > dinheiro)){                
                System.out.printf("Joãozinho não pode comprar o doce que custa %.2f pois é muito caro!!!\n", valorDoce);
                System.out.printf("Joãozinho ainda tem R$ %.2f...\n", dinheiro);
                continue;
            }
            else if(valorDoce < dinheiro){
                System.out.printf("Joãozinho comprou um doce que custa %.2f...\n", valorDoce);
                dinheiro -= valorDoce;
                qtdDoces++;
                System.out.printf("Joãozinho agora tem R$ %.2f...\n", dinheiro);
                continue;
            }
            else if(valorDoce == dinheiro){
                System.out.printf("Joãozinho gastou todo o restante de seu dinheiro um doce que custa %.2f!\n", valorDoce);
                dinheiro -= valorDoce;
                qtdDoces++;
                System.out.printf("Joãozinho agora tem R$ %.2f...\n", dinheiro);
                break;
            }
            else{
                break;
            }

        }
        System.out.printf("\nNão dá pra comprar mais nada!\n");
        System.out.printf("Joãozinho foi pra casa com %s doces!!!\n", qtdDoces);
    }

}
