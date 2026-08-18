package br.com.dio.patterns.strategy;

public class ProcessadorPagamento {

    private Pagamento estrategiaPagamento;

    public void setEstrategiaPagamento(
            Pagamento estrategiaPagamento
    ) {

        this.estrategiaPagamento =
                estrategiaPagamento;
    }

    public void processar(double valor) {

        if (estrategiaPagamento == null) {

            System.out.println(
                    "Nenhuma forma de pagamento selecionada."
            );

            return;
        }

        estrategiaPagamento.pagar(valor);
    }
}