package apps;
public class MSNMessenger extends MensagemInstantaneasCore {

	@Override
	public void enviarMensagem() {
		breakLine();
		validarConexaoInternet();
		System.out.println("Enviando mensagem pelo MSN...");
		salvarHistoricoMensagem();
	}

	@Override
	public void receberMensagem() {
		validarConexaoInternet();
		System.out.println("Recebendo mensagem pelo MSN...");
		salvarHistoricoMensagem();
	}

	public void salvarHistoricoMensagem(){
        System.out.println("-> SALVANDO MENSAGEM NO HISTÓRICO DO MSN... OK!");
    };
	
}