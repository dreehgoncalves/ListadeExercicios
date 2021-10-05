package ex.estruturasequencial;

import br.com.softblue.commons.io.Console;

public class ExibirSoma {

	public static void main(String[] args) {
		
		System.out.println("Número 1:");
		int n1 = Console.readInt();

		System.out.println("Número 2:");
		int n2 = Console.readInt();
		
		int soma = n1 + n2;
		System.out.println("A soma dos numeros informados é: " + soma);
		
		
	}

}
