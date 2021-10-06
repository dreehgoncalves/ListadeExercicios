package ex.estruturasequencial;

import javax.swing.JOptionPane;

//import br.com.softblue.commons.io.Console;

public class CalculePesoIdeal {

	public static void main(String[] args) {
		
		String alt = JOptionPane.showInputDialog("Informe a altura:");
		double altura = Double.parseDouble(alt);
		
		String i  = JOptionPane.showInputDialog("Digite qual opção desejada:  \n 1-Homem: \n 2-Mulher:");
		int HouM = Integer.parseInt(i);
		
		double peso_ideal;
		
		if(HouM == 1) {
			peso_ideal = (72.7*altura) - 58;
			JOptionPane.showMessageDialog(null, "O seu peso ideal e: " + peso_ideal);
		} else {
			peso_ideal = (62.1*altura) - 44.7;
			JOptionPane.showMessageDialog(null, "O seu peso ideal e: " + peso_ideal);
		}
	}

}
