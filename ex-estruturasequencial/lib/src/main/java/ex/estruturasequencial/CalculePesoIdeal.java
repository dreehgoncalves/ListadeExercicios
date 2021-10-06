package ex.estruturasequencial;

import javax.swing.JOptionPane;

//import br.com.softblue.commons.io.Console;

public class CalculePesoIdeal {

	public static void main(String[] args) {
		//Exercicios 12 e 13
		String alt = JOptionPane.showInputDialog("Informe a altura:");
		double altura = Double.parseDouble(alt);
		
		String i  = JOptionPane.showInputDialog("Digite qual opcao desejada:\n 1-Homem 2-Mulher");
		int HouM = Integer.parseInt(i);
		
		double peso_ideal;
		
		if(HouM == 1) {
			peso_ideal = (72.7 * altura) - 58;
			JOptionPane.showMessageDialog(null, String.format("O seu peso ideal e: %.2f kg", peso_ideal));
		} else {
			peso_ideal = (62.1 * altura) - 44.7;
			JOptionPane.showMessageDialog(null, String.format("O seu peso ideal e: %.2f kg", peso_ideal));
		}
	}

}
