package ex.estruturasequencial;

import br.com.softblue.commons.io.Console;

public class ExibirDobroAreaQuadrado {

	public static void main(String[] args) {
		
		System.out.printf("Informe a medida do lado do quadrado:\n");
		double lado = Console.readDouble();

		double area = (lado * lado) * 2;
		System.out.printf("O dobro da area do quadrado e: %.2f cm²", area);

	}

}
