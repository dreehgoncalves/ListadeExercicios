package ex.estruturasequencial;

import br.com.softblue.commons.io.Console;

public class CelsiusParaFahrenheit {

	public static void main(String[] args) {
		
		System.out.printf("Informe a temperatura em Celsius:\n");
		double C = Console.readDouble();

		double F = C * 1.8 + 32 ;
		System.out.printf("A temperatura em Fahrenheit e: %.2f", F);

	}

}
