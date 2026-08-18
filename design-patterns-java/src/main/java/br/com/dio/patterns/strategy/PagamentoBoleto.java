package br.com.dio.patterns.strategy;

public class PagamentoBoleto implements Pagamento {

    @Override
    public void pagar(double valor) {

        System.out.println(
                "Boleto no valor de R$ " +
                valor +
                " gerado com sucesso."
        );
    }
}