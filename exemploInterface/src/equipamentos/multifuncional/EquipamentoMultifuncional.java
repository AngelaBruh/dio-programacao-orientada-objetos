package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

// Em java não é permitido herança multipla, para isso utiliza-se a interface

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{
	public void copiar() {
		System.out.println("Copiando via equipamento multifuncional");
	}
	
	public void digitalizar() {
		System.out.println("Digitalizando via equipamento multifuncional");
	}
	
	public void imprimir() {
		System.out.println("Imprimindo via equipamento multifuncional");
	}
	
}