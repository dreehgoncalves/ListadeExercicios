package ex.estruturasequencial;

import br.com.softblue.commons.io.Console;

public class ExibirNumero {

	public static void main(String[] args) {
		
		System.out.printf("Informe um numero:\n");
		int n1 = Console.readInt();
		System.out.printf("O número informado foi %d", n1);
	}

}
