package iphone;

import aparelhoTelefonico.AparelhoTelefonico;
import navegadorInternet.NavegadorInternet;
import reprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

	@Override
	public void tocar() {
		System.out.println("TOCANDO MÚSICA");

	}

	@Override
	public void pausar() {
		System.out.println("MÚSICA PAUSADA");

	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("MÚSICA SELECIONADA: " + musica);

	}

	@Override
	public void exibirPagina() {
		System.out.println("EXIBINDO PÁGINA");

	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("NOVA ABA ADICIONADA");

	}

	@Override
	public void atualizarPagina() {
		System.out.println("PÁGINA ATUALIZADA");

	}

	@Override
	public void ligar(long numero) {
		System.out.println("LIGANDO PARA " + numero);

	}

	@Override
	public void atender(boolean atendido) {
		if (atendido) {
			System.out.println("LIGAÇÃO ATENDIDA");
		}else {
			iniciarCorreioVoz();
		}
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("CORREIO DE VOZ INICIADO");

	}

}
