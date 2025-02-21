package exemploAbstracao;

public class TelegramMensagem extends ServicoMessenger{

	
	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo Telegram");		
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo Mensagem pelo Telegram");		
	}

}
