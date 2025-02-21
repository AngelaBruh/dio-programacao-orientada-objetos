package exemploAbstracao;

public class FacebookMensagem extends ServicoMessenger{

	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo Facebook");		
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo Mensagem pelo Facebook");		
	}	

}
