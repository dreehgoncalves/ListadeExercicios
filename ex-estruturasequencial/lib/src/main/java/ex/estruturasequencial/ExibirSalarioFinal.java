package ex.estruturasequencial;

import javax.swing.JOptionPane;

public class ExibirSalarioFinal {

	public static void main(String[] args) {
		
		String val = JOptionPane.showInputDialog("Informe o valor por hora:");
		double val_h = Double.parseDouble(val);
		
		String ht = JOptionPane.showInputDialog("Informe Horas Trabalhadas:");
		double horas_t = Double.parseDouble(ht);
		
		double salario_b = val_h * horas_t;
		double imposto = salario_b * 0.11;
		double inss = salario_b * 0.08;
		double sindicato = salario_b * 0.05;
		double salario_liq= salario_b - (imposto + inss + sindicato);
		
		JOptionPane.showMessageDialog(null, String.format("Seu salario bruto: R$ %.2f\n"
														+ "Imposto de Renda: R$ %.2f\n"
														+ "Sindicato: R$ %.2f\n"
														+ "INSS: R$ %.2f\n"
														+ "Seu salario final: R$ %.2f\n",
															salario_b, imposto , sindicato,
															inss, salario_liq));
	}

}
