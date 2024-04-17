package apps;
public class FacebookMessenger extends MensagemInstantaneasCore {

	@Override
	public void enviarMensagem() {
		breakLine();
		System.out.println("Enviando mensagem pelo FACEBOOK...");
		salvarHistoricoMensagem();
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo FACEBOOK...");
		salvarHistoricoMensagem();
	}

	public void salvarHistoricoMensagem(){
        System.out.println("-> SALVANDO MENSAGEM NO HISTÓRICO DO FACEBOOK... OK!");
    };
	
}