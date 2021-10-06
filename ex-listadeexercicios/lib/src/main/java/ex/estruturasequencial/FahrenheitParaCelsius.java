package ex.estruturasequencial;

import br.com.softblue.commons.io.Console;

public class FahrenheitParaCelsius {

	public static void main(String[] args) {
		System.out.printf("Informe a temperatura em Fahrenheit:\n");
		double F = Console.readDouble();

		double C = (F-32) / 1.8;
		System.out.printf("A temperatura em Celsius e: %.2f", C);

	}

}
