package br.com.dio.patterns;

import br.com.dio.patterns.facade.LojaFacade;
import br.com.dio.patterns.singleton.Configuracao;
import br.com.dio.patterns.strategy.PagamentoBoleto;
import br.com.dio.patterns.strategy.PagamentoCartao;
import br.com.dio.patterns.strategy.PagamentoPix;

public class Main {

    public static void main(String[] args) {

        System.out.println(
                "=== DESAFIO DESIGN PATTERNS ==="
        );

        /*
         * SINGLETON
         */

        Configuracao configuracao =
                Configuracao.getInstancia();

        System.out.println(
                "\nSistema: " +
                configuracao.getNomeSistema()
        );

        /*
         * FACADE + STRATEGY
         */

        LojaFacade loja =
                new LojaFacade();

        loja.realizarCompra(
                150.00,
                new PagamentoPix()
        );

        loja.realizarCompra(
                300.00,
                new PagamentoCartao()
        );

        loja.realizarCompra(
                500.00,
                new PagamentoBoleto()
        );

        /*
         * TESTANDO SINGLETON
         */

        Configuracao outraConfiguracao =
                Configuracao.getInstancia();

        System.out.println(
                "\nAs instâncias Singleton são iguais?"
        );

        System.out.println(
                configuracao ==
                outraConfiguracao
        );
    }
}