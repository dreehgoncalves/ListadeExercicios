package ex.estruturasequencial;

import javax.swing.JOptionPane;

public class ExibirValorTinta {

	public static void main(String[] args) {
		String area_p = JOptionPane.showInputDialog("Informe a area a ser pintada:");
        int area = Integer.parseInt(area_p);
		
		double qtd_tinta = area / 3;
		int preco = 80;
		int cap_lata = 18;
		double lata = Math.ceil(qtd_tinta / cap_lata);
		double total = lata * preco;
		
		if(lata == 1) {
			JOptionPane.showMessageDialog(null, String.format("Sera necessaria: %.0f lata\nPreço total: R$ %.2f", lata, total));
		} else {
			JOptionPane.showMessageDialog(null, String.format("Serao necessarias: %.0f latas\nPreço total: R$ %.2f", lata, total));
		}

	}

}
