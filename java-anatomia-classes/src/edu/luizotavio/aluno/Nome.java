package edu.luizotavio.aluno;
public class Nome {
    static final int ANO_ATUAL = 2024;
    
    public static void main(String[] args) {
        String primeiroNome = "Luiz Otavio";
        String segundoNome = "Valenzi Sousa";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println("Meu nome é: " + nomeCompleto);
        System.out.println("Meu nome é: " + nomeCompleto(primeiroNome, segundoNome));
        System.out.println("O ano atual é: " + ANO_ATUAL);
    }
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}