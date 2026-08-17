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
        int numero1 = 1;
        int numero2 = 2;
        boolean simNao = numero1 > numero2;
        boolean simNao2 = numero1 < numero2;
        boolean simNao3 = numero1 >= numero2;
        boolean simNao4 = numero1 <= numero2;
        boolean simNao5 = numero1 == numero2;
        System.out.println("numero1 > numero2 " + simNao);
        System.out.println("numero1 < numero2 " + simNao2);
        System.out.println("numero1 >= numero2 " + simNao3);
        System.out.println("numero1 <= numero2 " + simNao4);
        System.out.println("numero1 == numero2 " + simNao5);
    }
}
