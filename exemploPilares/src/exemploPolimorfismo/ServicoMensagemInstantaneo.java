package exemploPolimorfismo;

public abstract class ServicoMensagemInstantaneo {
	
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	//Mais um método que todos os filhos deverão implementar
	public abstract void salvarHistoricoMensagem();
	
	//somente os filhos conhecem este método
	protected void validarConectadoInternet() {
		System.out.println("Valindo se está conectado a internet");
	}

}
