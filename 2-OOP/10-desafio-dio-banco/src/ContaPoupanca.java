public class ContaPoupanca extends Conta {
    
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato(){
    System.out.printf("=== SALDO DA CONTA POUPANÇA: ===");
        super.imprimirInfosExtrato();
    }
}
