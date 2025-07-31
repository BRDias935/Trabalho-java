package eleições;

public class Eleitor {
	//dados do eleitor para cadastro e uso direto nas estatisticas(adicionar mais se desejarem)
	private String nome;
	private char sexo;
	private int idade;
	private String rg;
	

//construtor
	public Eleitor(String nome, char sexo, int idade, String rg) {
		setNome(nome);
		setSexo(sexo);
		setIdade(idade);
		setRg(rg);
	}
//gettes & setters
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
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
