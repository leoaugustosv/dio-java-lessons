public class Main {
    public static void main(String[] args) {

        Cliente leo = new Cliente();
        leo.setNome("Leonardo");
        leo.setCpf("34378590041");

        Cliente bia = new Cliente();
        bia.setNome("Bianca");
        bia.setCpf("12421415563");

        iConta cc = new ContaCorrente(leo);

        iConta poupanca = new ContaPoupanca(leo);

        cc.depositar(1000);
        cc.transferir(1000,poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
