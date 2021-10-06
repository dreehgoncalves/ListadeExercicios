package ex.estruturasequencial;

import br.com.softblue.commons.io.Console;

public class ExibaCalculo {

	public static void main(String[] args) {
		System.out.printf("Informe primeiro numero:\n");
		int n1 = Console.readInt();
		
		System.out.printf("Informe o segundo numero:\n");
		int n2 = Console.readInt();
		
		System.out.printf("Informe o terceiro numero:\n");
		double n3 = Console.readDouble();
		
		double produto = (n1 * 2) * (n2 / 2);
		System.out.printf("O produto do dobro do primeiro com metade do segundo: %.2f\n", produto);
		
		double soma = (n1 * 3) + n3;
		System.out.printf("A soma do triplo do primeiro com o terceiro: %.2f\n", soma);

		double cubo = Math.pow(n3, 3);
		System.out.printf("O  terceiro elevado ao cubo: %.2f\n", cubo);

	}

}
