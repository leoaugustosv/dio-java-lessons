public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);

    }

    public void imprimirExtrato(){
        System.out.printf("=== SALDO DA CONTA CORRENTE: ===");
        super.imprimirInfosExtrato();
    }
}
