package ex.estruturadedecisao;

import javax.swing.JOptionPane;

public class ExibirValorMaior {

	public static void main(String[] args) {
		String n1 = JOptionPane.showInputDialog("Informe o primeiro numero:");
        int num1 = Integer.parseInt(n1);
        
        String n2 = JOptionPane.showInputDialog("Informe o numero:");
        int num2 = Integer.parseInt(n2);
        
        if(num1 > num2) {
        	JOptionPane.showMessageDialog(null, String.format("O numero %d e maior", num1));
        } else {
        	JOptionPane.showMessageDialog(null, String.format("O numero %d e maior", num2));
        }
	}

}
