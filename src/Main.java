import eletronico.aparelho.Celular;
import eletronico.funcionalidades.AparelhoTelefonico;
import eletronico.funcionalidades.NavegadorNaInternet;
import eletronico.funcionalidades.ReprodutorMusical;

public class Main {
    public static void main(String[] args) {

        ReprodutorMusical musica = new Celular();
        AparelhoTelefonico telefone = new Celular();
        NavegadorNaInternet internet = new Celular();

        musica.tocar();
        musica.pausar();
        musica.selecionarMusica();

        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorrerioVoz();

        internet.exibirPagina();
        internet.adicionarNovaAba();
        internet.atualizarPagina();
    }
}