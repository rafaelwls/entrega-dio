package umlQuest;

public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Testando funcionalidade de ReprodutorMusical
        meuIphone.selecionarMusica("Imagine - John Lennon");
        meuIphone.tocar();
        meuIphone.pausar();

        // Testando funcionalidade de AparelhoTelefonico
        meuIphone.ligar("555-1234");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando funcionalidade de NavegadorInternet
        meuIphone.exibirPagina("https://www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
