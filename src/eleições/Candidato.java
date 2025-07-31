package eleições;
//considerando que candidatos tbm podem votar cadidatos eh classe "filha" de Eleitor
public class Candidato extends Eleitor{
	//"id" do candidato para melhor identificação 
	private String id;

	public Candidato(String nome, char sexo, int idade, String rg, String id) {
		super(nome, sexo, idade, rg);
		// TODO Auto-generated constructor stub
		setId(id);
	}
	

	public String getId() {
		return id;
	}

	public void setId(String numero) {
		this.id = numero;
	}

}
