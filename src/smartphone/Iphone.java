package smartphone;

import equipamentos.AparelhoTelefonico;
import equipamentos.NavegadorInternet;
import equipamentos.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    @Override
    public void realizarChamadaTelefonica() {
        System.out.println("REALIZANDO CHAMADA");
    }

    @Override
    public void atenderTelefone() {
        System.out.println("ATENDENDO CHAMADA");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("CORREIO DE VOZ");
    }

    @Override
    public void exibirPagina() {
        System.out.println("EXIBINDO PAGINA WEB");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ABRINDO NOVA ABA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("RECARREGANGANDO PAGINA WEB");
    }

    @Override
    public void tocarMusica() {
        System.out.println("TOCANDO MUSICA SELECIONADA");
    }

    @Override
    public void pausarMusica() {
        System.out.println("PAUSANDO MUSICA");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("SELECIONANDO MUSICA");
    }
}
