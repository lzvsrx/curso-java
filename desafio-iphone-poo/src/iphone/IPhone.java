package iphone;

public class IPhone implements ReprodutorMusical,
        AparelhoTelefonico,
        NavegadorInternet {

    private final String modelo;
    private final String numero;

    public IPhone(String modelo, String numero) {
        this.modelo = modelo;
        this.numero = numero;
    }

    // Reprodutor Musical

    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    // Aparelho Telefônico

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // Navegador de Internet

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    public String getModelo() {
        return modelo;
    }

    public String getNumero() {
        return numero;
    }
}