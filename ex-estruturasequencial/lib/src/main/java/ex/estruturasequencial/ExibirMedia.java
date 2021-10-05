package ex.estruturasequencial;
import br.com.softblue.commons.io.Console;

public class ExibirMedia {

	public static void main(String[] args) {
		
			System.out.println("Informe a primeira nota:");
			int nota1 = Console.readInt();

			System.out.println("Informe a segunda nota:");
			int nota2 = Console.readInt();
			
			System.out.println("Informe a terceira nota:");
			int nota3 = Console.readInt();
			
			System.out.println("Informe a quarta nota:");
			int nota4 = Console.readInt();

			int media = (nota1 + nota2 + nota3 + nota4) / 4;
			System.out.println("A media é: " + media);
			
			
		}

	}
