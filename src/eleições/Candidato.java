package eleições;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

//considerando que candidatos tbm podem votar cadidatos eh classe "filha" de Eleitor

public class Candidato extends Eleitor{
	
	private String id; //"id" do candidato para melhor identificação 
	Set<Candidato> listaCandidatos = new HashSet<>();

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
    public static void novoCandidato() {
    	
    }
   
    
}
