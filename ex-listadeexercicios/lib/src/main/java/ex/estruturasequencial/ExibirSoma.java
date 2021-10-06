package ex.estruturasequencial;

import br.com.softblue.commons.io.Console;

public class ExibirSoma {

	public static void main(String[] args) {
		
		System.out.printf("Número 1:\n");
		int n1 = Console.readInt();

		System.out.printf("Número 2:\n");
		int n2 = Console.readInt();
		
		int soma = n1 + n2;
		System.out.printf("A soma dos numeros informados é: %d", soma);
		
		
	}

}
