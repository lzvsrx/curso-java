package banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {

        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {

        contas.add(conta);

        System.out.println(
            "Conta adicionada ao banco com sucesso."
        );
    }

    public void listarContas() {

        System.out.println("\n=== Contas do Banco " + nome + " ===");

        for (Conta conta : contas) {

            System.out.println("--------------------------");

            System.out.println(
                "Cliente: " + conta.getCliente().getNome()
            );

            System.out.println(
                "Agência: " + conta.getAgencia()
            );

            System.out.println(
                "Conta: " + conta.getNumero()
            );

            System.out.printf(
                "Saldo: R$ %.2f%n",
                conta.getSaldo()
            );
        }
    }

    public String getNome() {
        return nome;
    }

    public List<Conta> getContas() {
        return contas;
    }
}