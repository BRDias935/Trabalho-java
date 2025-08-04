package eleições;

//entrada de dados atraves de metodos sera mais eficiente + swicth case
import java.util.Scanner;


public class Main extends Candidato{
	
	//Construtor da clase main... pq sim?.
	public Main(String nome, char sexo, int idade, String rg, String id) {
		super(nome, sexo, idade, rg, id);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int Opção = 1;
		
		
		while (Opção != 0) {
		System.out.println("  Sistemas de Votação.\n");
		System.out.println("cadastro de Eleitor         1");
		System.out.println("cadastro de Candidato       2");
		System.out.println("votar                       3");
		System.out.println("resultados & Estatisticas   4");
		System.out.println("Sair                        5");
		System.out.print("\nSua escolha: ");
		Opção = sc.nextInt();
	
		switch(Opção){
		case 1:
			if Opção {
				novoEleitor();
			}
		case 2:novoCandidato(); 
		case 3:;
		case 4:;
		case 5: Opção= 0; break;
		default: System.out.println("Opção invalida");
	}
		sc.close();
}
	}
	}
