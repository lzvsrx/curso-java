package banco;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {

        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
            return;
        }

        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
            return;
        }

        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {

        if (valor <= 0) {
            System.out.println("Valor de depósito inválido.");
            return;
        }

        saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {

        if (valor <= 0) {
            System.out.println("Valor de transferência inválido.");
            return;
        }

        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
            return;
        }

        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfosComuns() {

        System.out.printf("Titular: %s%n", cliente.getNome());
        System.out.printf("Agência: %d%n", agencia);
        System.out.printf("Número: %d%n", numero);
        System.out.printf("Saldo: R$ %.2f%n", saldo);
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

    public Cliente getCliente() {
        return cliente;
    }
}