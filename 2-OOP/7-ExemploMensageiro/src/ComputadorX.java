import java.util.Scanner;

import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.MensagemInstantaneasCore;
import apps.Telegram;

public class ComputadorX {
    public static void main(String[] args) {
        boolean mensageiroSelecionado = false;
        MensagemInstantaneasCore svc = null;
        int mensageiroEscolhido;

        Scanner sc = new Scanner(System.in);

        do {
            
        
        System.out.println("Digite a opção númerica correspondente ao mensageiro que deseja utilizar: ");
        System.out.println("\n1-MSN Messenger\n2-Facebook Messenger\n3-Telegram");
        mensageiroEscolhido = sc.nextInt();

        switch (mensageiroEscolhido) {
            case 1:
                mensageiroSelecionado = true;
                svc = new MSNMessenger();
                break;
            case 2:
                mensageiroSelecionado = true;
                svc = new FacebookMessenger();
                break;
            case 3:
                mensageiroSelecionado = true;   
                svc = new Telegram();
                break;
        
            default:
            System.out.printf("---OPÇÃO %s INVÁLIDA, TENTE NOVAMENTE!---\n",mensageiroEscolhido);
                continue;
        }
        } while (!mensageiroSelecionado);
        
        
        svc.enviarMensagem();
        svc.receberMensagem();
        
        sc.close();
    }
}
