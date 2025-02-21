package exemploPolimorfismo.AppsPolimorfismo;

import exemploPolimorfismo.ServicoMensagemInstantaneo;

public class TelegramMensageiro extends ServicoMensagemInstantaneo{

	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Telegram");		
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo Mensagem pelo Telegram");		
	}
	
	public void salvarHistoricoMensagem() {
		System.out.println("Salvando historico de mensagem do Telegram");		
	}
}
