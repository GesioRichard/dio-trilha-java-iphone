package usuario;

import iphone.Iphone;

public class Usuario {

	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		
		System.out.println("Funções de um reprodutor musical no iphone");
		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica("Believer - Imagine Dragons");
		
		System.out.println("\nFunções de um navegador de internet no iphone");
		iphone.exibirPagina();
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		
		System.out.println("\nFunções de um aparelho telefônico no iphone");
		iphone.ligar(988887777);
		iphone.atender(true);
		iphone.atender(false);
	}

}
