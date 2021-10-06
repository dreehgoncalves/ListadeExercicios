package ex.estruturasequencial;

import javax.swing.JOptionPane;

public class ExibirMultaExcesso {

	public static void main(String[] args) {
		
		String peso = JOptionPane.showInputDialog("Informe o peso do dia:");
		double peso_dia = Double.parseDouble(peso);
		
		double excesso = peso_dia - 50;
		double multa;
		
		if(peso_dia > 50) {
			multa = excesso * 4;
			JOptionPane.showMessageDialog(null, String.format("Sua multa sera de: R$ " + multa));
		} else {
			JOptionPane.showMessageDialog(null, "Não sera necessario pagar multas");
		}

	}

}
