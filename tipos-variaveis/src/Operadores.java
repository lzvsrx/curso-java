public class Operadores {
    public static void main(String[] args){
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);
        String concatenacao = "?";
        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);
        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);
        int numero = 5;
        numero = -numero;
        numero = numero * -1;
        System.out.println(-numero);
        System.out.println(numero);
        boolean variavel = true;
        variavel = !variavel;
        System.out.println(variavel);
        numero++;
        System.out.println(numero);
        System.out.println(++numero);
        System.out.println(numero ++);
        System.out.println(numero --);
        boolean variavel2 = true;
        System.out.println(!variavel2);
        int a, b;
        a = 5;
        b = 6;
        String resultado = "";
        if(a == b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

        System.out.println(resultado);
        String resultado2 = a != b ? "verdadeiro" : "falso";
        System.out.println(resultado2);
    }
}
