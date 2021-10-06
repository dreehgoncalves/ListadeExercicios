package ex.estruturasequencial;
import br.com.softblue.commons.io.Console;

public class ExibirMedia {

	public static void main(String[] args) {
		
			System.out.printf("Informe a primeira nota:\n");
			int nota1 = Console.readInt();

			System.out.printf("Informe a segunda nota:\n");
			int nota2 = Console.readInt();
			
			System.out.printf("Informe a terceira nota:\n");
			int nota3 = Console.readInt();
			
			System.out.printf("Informe a quarta nota:\n");
			int nota4 = Console.readInt();

			int media = (nota1 + nota2 + nota3 + nota4) / 4;
			System.out.printf("A media é: %d", media);
			
			
		}

	}
