package banco;

public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco("DIO Bank");

        Cliente luiz = new Cliente("Luiz Otavio");
        Cliente maria = new Cliente("Maria");

        Conta contaCorrente = new ContaCorrente(luiz);
        Conta contaPoupanca = new ContaPoupanca(maria);

        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);

        System.out.println("\n=== DEPÓSITO ===");

        contaCorrente.depositar(1000);

        System.out.println("\n=== TRANSFERÊNCIA ===");

        contaCorrente.transferir(300, contaPoupanca);

        System.out.println("\n=== EXTRATOS ===");

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

        banco.listarContas();
    }
}