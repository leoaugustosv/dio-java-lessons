package apps;
public class Telegram extends MensagemInstantaneasCore {

	@Override
	public void enviarMensagem() {
		breakLine();
		System.out.println("Enviando mensagem pelo TELEGRAM...");
		salvarHistoricoMensagem();
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo TELEGRAM...");
		salvarHistoricoMensagem();
	}

	public void salvarHistoricoMensagem(){
        System.out.println("-> SALVANDO MENSAGEM NO HISTÓRICO DO TELEGRAM... OK!");
    };
	
}