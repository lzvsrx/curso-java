package br.com.dio.patterns.facade;

import br.com.dio.patterns.strategy.Pagamento;
import br.com.dio.patterns.strategy.ProcessadorPagamento;

public class LojaFacade {

    private final ProcessadorPagamento processador;

    public LojaFacade() {

        processador =
                new ProcessadorPagamento();
    }

    public void realizarCompra(
            double valor,
            Pagamento pagamento
    ) {

        System.out.println(
                "\n=== PROCESSANDO COMPRA ==="
        );

        System.out.println(
                "Valor da compra: R$ " +
                valor
        );

        processador.setEstrategiaPagamento(
                pagamento
        );

        processador.processar(valor);

        System.out.println(
                "Compra finalizada com sucesso!"
        );

        System.out.println(
                "=========================="
        );
    }
}