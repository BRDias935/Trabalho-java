package eleições;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class Eleitor {
	//dados do eleitor para cadastro e uso direto nas estatisticas(adicionar mais se desejarem)
	private String nome;
	private char sexo;
	private int idade;
	private String rg;
	static Set<Eleitor> listaEleitores = new HashSet<>();
	

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

	public static void novoEleitor(){
		
		System.out.println("entrou no metodo");
		
		Scanner scanner = new Scanner(System.in);
		
		String nome = scanner.nextLine();
		char sexo =scanner.next().charAt(0);
		int idade = scanner.nextInt();
		String rg = scanner.nextLine();
		scanner.close();
		
		
		
		Eleitor  novoEleitor  = new Eleitor(nome,sexo,idade,rg);
		
		listaEleitores.add(novoEleitor);
			
	}
}
