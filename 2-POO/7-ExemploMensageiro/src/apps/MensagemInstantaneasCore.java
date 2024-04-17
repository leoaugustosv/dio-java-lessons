package apps;
public abstract class MensagemInstantaneasCore {

    public abstract void enviarMensagem();
    public abstract void receberMensagem();
    public abstract void salvarHistoricoMensagem();
    
    protected void breakLine(){
        System.out.println("\n");
    }

    protected void validarConexaoInternet(){
        System.out.println("-> VALIDANDO CONEXÃO COM A INTERNET... OK!");
    };
}
