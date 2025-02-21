package exemploHeranca;

public class ComputadorJoazinho {
	public static void main(String [] args) {
	
		System.out.println("Facebook");
		FacebookMessenger fcb = new FacebookMessenger();			
		fcb.enviarMensagem();	
		fcb.receberMensagem();
		
		System.out.println("Telegram");
		TelegramMessenger tlg = new TelegramMessenger();			
		tlg.enviarMensagem();	
		tlg.receberMensagem();
	
	}	
}
