package eleições;

public class Candidato extends Eleitor{
	
	private String id;

	public Candidato(String nome, String sexo, int idade, String rg, String id) {
		super(nome, sexo, idade, rg);
		// TODO Auto-generated constructor stub
		this.id= id;
	}

	public String getId() {
		return id;
	}

	public void setId(String numero) {
		this.id = numero;
	}

}
