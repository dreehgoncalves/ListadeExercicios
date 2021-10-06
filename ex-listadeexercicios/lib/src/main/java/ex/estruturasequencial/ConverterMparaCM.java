package ex.estruturasequencial;

import br.com.softblue.commons.io.Console;

public class ConverterMparaCM {

	public static void main(String[] args) {
		System.out.printf("Informe a medida em metros:\n");
		double metro = Console.readDouble();

		double centimetro = metro * 100;
		System.out.printf("A media é: %.2f", centimetro);

	}

}
