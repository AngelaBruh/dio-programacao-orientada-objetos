package exemploPilares;

public class Carro extends Veiculo{
		
	public void ligar () {
		confereCambio();
		conferindoCombustivel();
		System.out.println("CARRO LIGADO");
	}
	private void conferindoCombustivel () {
		System.out.println("Conferindo Combustivel");
	}
	private void confereCambio () {
		System.out.println("Conferindo Cambio em P");
	}	
}
