package eleições;

public class Eleitor {
	private String nome;
	private String sexo;
	private int idade;
	private String rg;

	public Eleitor(String nome, String sexo, int idade, String rg) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.rg =  rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
}
