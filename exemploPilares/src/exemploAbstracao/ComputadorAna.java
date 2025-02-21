package exemploAbstracao;


public class ComputadorAna {
	public static void main(String [] args) {
		
		System.out.println("Facebook");
		FacebookMensagem fcb = new FacebookMensagem();			
		fcb.enviarMensagem();	
		fcb.receberMensagem();
		
		System.out.println("Telegram");
		TelegramMensagem tlg = new TelegramMensagem();			
		tlg.enviarMensagem();	
		tlg.receberMensagem();
	
	}	
}
