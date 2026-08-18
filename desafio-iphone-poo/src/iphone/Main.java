package iphone;

public class Main {

    public static void main(String[] args) {

        IPhone iphone = new IPhone(
                "iPhone",
                "(35) 99999-9999"
        );

        System.out.println("=== IPHONE ===");
        System.out.println("Modelo: " + iphone.getModelo());
        System.out.println("Número: " + iphone.getNumero());

        System.out.println("\n=== REPRODUTOR MUSICAL ===");

        iphone.selecionarMusica("Imagine - John Lennon");
        iphone.tocar();
        iphone.pausar();

        System.out.println("\n=== APARELHO TELEFÔNICO ===");

        iphone.ligar("(35) 98888-8888");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("\n=== NAVEGADOR INTERNET ===");

        iphone.exibirPagina("https://www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}