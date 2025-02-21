package exemploPolimorfismo.AppsPolimorfismo;

import exemploPolimorfismo.ServicoMensagemInstantaneo;

public class FacebookMensageiro extends ServicoMensagemInstantaneo{

	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Facebook");		
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo Mensagem pelo Facebook");		
	}	
	
	public void salvarHistoricoMensagem() {
		System.out.println("Salvando historico de mensagem do Facebook");		
	}
	
}
