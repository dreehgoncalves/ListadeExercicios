package ex.estruturaderepeticao;

import javax.swing.JOptionPane;

public class ExibirFibonacci {

	public static void main(String[] args) {
		String n1 = JOptionPane.showInputDialog("Informe um numero:");
		int n = Integer.parseInt(n1);

		for (long a = 0, i = 0, j = 1; a < n; a++) {
			if (i < 0) {
				i = i * (-1);
			}
			System.out.print(i + "\n");

			i = i + j;
			j = i - j;
		}
	}

}
