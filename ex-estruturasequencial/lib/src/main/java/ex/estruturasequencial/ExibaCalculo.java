package ex.estruturasequencial;

//import br.com.softblue.commons.io.Console;
import javax.swing.JOptionPane;

public class ExibaCalculo {

	public static void main(String[] args) {
		
		// Versão com Message e Input Dialog
		
		String num1 = JOptionPane.showInputDialog("Informe o primeiro numero");
		int n1 = Integer.parseInt(num1);
		
		String num2 = JOptionPane.showInputDialog("Informe o segundo numero");
		int n2 = Integer.parseInt(num2);
		
		String num3 = JOptionPane.showInputDialog("Informe o terceiro numero");
		double n3 = Double.parseDouble(num3);
		
		double produto = (n1 * 2) * (n2 / 2);		
		double soma = (n1 * 3) + n3;
		double cubo = Math.pow(n3, 3);
		
		
		JOptionPane.showMessageDialog(null, "O produto do dobro do primeiro com metade do segundo: " + produto + "\n" +
											"A soma do triplo do primeiro com o terceiro: "          + soma + "\n" +
											"O  terceiro elevado ao cubo: "						     + cubo);
		
		// Versão com console
		
		/*System.out.printf("Informe primeiro numero:\n");
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
		System.out.printf("O  terceiro elevado ao cubo: %.2f\n", cubo);*/

	}

}
