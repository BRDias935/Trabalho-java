package eleições;

//entrada de dados atraves de metodos sera mais eficiente + swicth case
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		int Opção = dados.nextInt();
		
		while (Opção != 0) {
		System.out.println("  Sistemas de Votação.\n");
		System.out.println("cadastro de Eleitor         1");
		System.out.println("cadastro de Candidato       2");
		System.out.println("votar                       3");
		System.out.println("resultados & Estatisticas   4");
		System.out.println("Sair                        5");
		System.out.print("\nSua escolha: ");
		
		
		
		

		
		
		
		dados.close();
		
		
		
		switch(Opção){
		case 1: ;
		break;
		case 2:; 
		break;
		//case 3: metodoVotar()
		//break;
		//case 4: metodo resultados & Estatisticas()
		//break;
		case 5: break;
		
		
		
	
	}
}
	}}
