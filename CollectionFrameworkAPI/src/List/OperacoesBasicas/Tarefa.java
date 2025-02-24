package List.OperacoesBasicas;

public class Tarefa {
	//atributo
	private String descricao;
	
	//Criado um construtor:
	public  Tarefa(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return descricao;
	}

	
	
}
