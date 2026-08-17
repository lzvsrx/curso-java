public class ExemploBreakContinue {

    public static void main(String[] args) {

        for (int numero = 1; numero <= 10; numero++) {

            // CONTINUE: pula o número 3
            if (numero == 3) {
                System.out.println("Pulando o número " + numero);
                continue;
            }

            // BREAK: encerra o FOR quando chegar no número 7
            if (numero == 7) {
                System.out.println("Encerrando o laço no número " + numero);
                break;
            }

            System.out.println("Número: " + numero);
        }

        System.out.println("Fim do programa.");
    }
}