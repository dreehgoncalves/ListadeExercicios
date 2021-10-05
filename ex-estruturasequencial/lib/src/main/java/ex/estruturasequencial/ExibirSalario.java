package ex.estruturasequencial;

import br.com.softblue.commons.io.Console;

public class ExibirSalario {

	public static void main(String[] args) {
		
		System.out.printf("Informe o valor por hora:\n");
		double valor_hora = Console.readDouble();
		
		System.out.printf("Informe horas trabalhadas:\n");
		double horas_trabalhadas = Console.readDouble();

		double salario = valor_hora * horas_trabalhadas;
		System.out.printf("O seu salario sera: R$ %.2f", salario);

	}

}
