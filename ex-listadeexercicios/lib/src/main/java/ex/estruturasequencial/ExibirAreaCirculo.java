package ex.estruturasequencial;

import br.com.softblue.commons.io.Console;

public class ExibirAreaCirculo {

	public static void main(String[] args) {

		double area, raio;

		System.out.printf("Informe o raio:\n");
		raio = Console.readDouble();

		area = Math.PI * Math.pow(raio, 2);
		System.out.printf("A area do circulo e: %.2f cm", area);

	}

}
