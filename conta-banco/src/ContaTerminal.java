import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        // Criando o Scanner para receber dados pelo terminal
        Scanner scanner = new Scanner(System.in);

        // Solicitar número da conta
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();

        // Limpar o ENTER que ficou no Scanner
        scanner.nextLine();

        // Solicitar agência
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        // Solicitar nome do cliente
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        // Solicitar saldo
        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        // Exibir mensagem final
        System.out.println(
            "Olá " + nomeCliente +
            ", obrigado por criar uma conta em nosso banco, sua agência é " +
            agencia +
            ", conta " +
            numero +
            " e seu saldo R$ " +
            String.format("%.2f", saldo) +
            " já está disponível para saque."
        );

        scanner.close();
    }
}