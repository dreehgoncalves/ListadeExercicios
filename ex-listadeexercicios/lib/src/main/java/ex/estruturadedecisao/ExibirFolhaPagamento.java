package ex.estruturadedecisao;

import javax.swing.JOptionPane;

public class ExibirFolhaPagamento {
    public static void main(String[] args) {

        String h = JOptionPane.showInputDialog("Informe Horas trabalhadas:");
        double horas_t = Double.parseDouble(h);

        String v = JOptionPane.showInputDialog("Informe o valor por hora:");
        double valor_hora = Double.parseDouble(v);

        double salario = horas_t * valor_hora;
        double ir = 0;
        double inss = salario * 0.1;
        double fgts = salario * 0.11;
        double sindicato = salario * 0.3;
        double total_descontos = ir + inss + sindicato;
        double salario_f = salario - total_descontos;

        if (salario <= 900) {
            JOptionPane.showMessageDialog(null,
                    String.format(
                            "Salário Bruto: R$ %.2f\n" + "(-) IR: ISENTO" + "(-) INSS: R$ %.2f\n" + "FGTS: R$ %.2f\n"
                                    + "Total de descontos: R$ %.2f\n" + "Salário Liquido: R$ %.2f\n",
                            salario, inss, fgts, total_descontos, salario_f));

        } else if (salario > 900 && salario <= 1500) {
            ir = salario * 0.05;
            JOptionPane.showMessageDialog(null,
                    String.format(
                            "Salário Bruto: R$ %.2f\n" + "(-) IR: R$ %.2f\n" + "(-) INSS: R$ %.2f\n" + "FGTS: R$ %.2f\n"
                                    + "Total de descontos: R$ %.2f\n" + "Salário Liquido: R$ %.2f\n",
                            salario, ir, inss, fgts, total_descontos, salario_f));

        } else if (salario > 1500 && salario <= 2500) {

            ir = salario * 0.1;
            JOptionPane.showMessageDialog(null,
                    String.format(
                            "Salário Bruto: R$ %.2f\n" + "(-) IR: R$ %.2f\n" + "(-) INSS: R$ %.2f\n" + "FGTS: R$ %.2f\n"
                                    + "Total de descontos: R$ %.2f\n" + "Salário Liquido: R$ %.2f\n",
                            salario, ir, inss, fgts, total_descontos, salario_f));

        } else if (salario > 2500) {

            ir = salario * 0.2;
            JOptionPane.showMessageDialog(null,
                    String.format(
                            "Salário Bruto: R$ %.2f\n" + "(-) IR: R$ %.2f\n" + "(-) INSS: R$ %.2f\n" + "FGTS: R$ %.2f\n"
                                    + "Total de descontos: R$ %.2f\n" + "Salário Liquido: R$ %.2f\n",
                            salario, ir, inss, fgts, total_descontos, salario_f));

        }
    }
}
