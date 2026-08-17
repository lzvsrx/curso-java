/**
 * Classe responsável por realizar operações matemáticas.
 *
 * @author Luizotavio
 * @version 1.0
 * @since 17/08/2026
 */
public class Calculadora {

    /**
     * Realiza a soma de dois números inteiros.
     *
     * @param numeroUm primeiro número
     * @param numeroDois segundo número
     * @return soma dos dois números
     */
    public int somar(int numeroUm, int numeroDois) {
        return numeroUm + numeroDois;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.somar(10, 5);

        System.out.println("Resultado: " + resultado);
    }
}