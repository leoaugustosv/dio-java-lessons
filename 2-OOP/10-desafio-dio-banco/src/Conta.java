
public abstract class Conta implements iConta {
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    

    private static int AGENCIA_PADRAO = 101;

    private static int SEQUENCIAL = 1;

    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }


    public int getNumero() {
        return numero;
    }


    public double getSaldo() {
        return saldo;
    }



    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }


    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }


    @Override
    public void transferir(double valor, iConta ContaDestino) {
        this.sacar(valor);
        ContaDestino.depositar(valor);
    }


    protected void imprimirInfosExtrato(){
        System.out.printf("\nTitular da conta: %s\n", this.cliente.getNome());
        System.out.printf("Agência %s\n", this.agencia);
        System.out.printf("Conta %s\n", this.numero);
        System.out.printf("Saldo %.2f\n", this.getSaldo());
    }

}
