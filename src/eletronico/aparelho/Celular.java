package eletronico.aparelho;

import eletronico.funcionalidades.AparelhoTelefonico;
import eletronico.funcionalidades.NavegadorNaInternet;
import eletronico.funcionalidades.ReprodutorMusical;

public class Celular implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {

    @Override
    public void ligar() {
        System.out.println("ligar");
    }

    @Override
    public void atender() {
        System.out.println("atender");
    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("iniciar correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("exibir pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("adicionar nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizar pagina");
    }

    @Override
    public void tocar() {
        System.out.println("tocar");
    }

    @Override
    public void pausar() {
        System.out.println("pausar");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("selecionar musica");
    }
}
