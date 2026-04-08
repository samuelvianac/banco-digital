public class Main {
    public static void main(String[] args) {
        Cliente samuel = new Cliente();
        samuel.setNome("Samuel Viana");

        Conta cc = new ContaCorrente(samuel);
        Conta poupanca = new ContaPoupanca(samuel);

        cc.depositar(100);
        cc.transferir(40, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
