package exemploPolimorfismo;

import exemploPolimorfismo.AppsPolimorfismo.FacebookMensageiro;
import exemploPolimorfismo.AppsPolimorfismo.TelegramMensageiro;

public class ComputadorMario {
	public static void main(String[] args) {
		ServicoMensagemInstantaneo smi = null;
			//Não sabe qual app
			//Mas qualquer um deverá enviar e receber mensagem
		String appEscolhido="tlg";
		
		if(appEscolhido.equals("fbm"))
			smi = new FacebookMensageiro();
		else if(appEscolhido.equals("tlg"))
			smi = new TelegramMensageiro();
		
		smi.enviarMensagem();
		smi.receberMensagem();
	}
}
