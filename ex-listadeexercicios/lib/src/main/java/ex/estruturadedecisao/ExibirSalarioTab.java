package ex.estruturadedecisao;

import javax.swing.JOptionPane;

public class ExibirSalarioTab {
    public static void main(String[] args) {

        String s = JOptionPane.showInputDialog("Informe o salario:");
        double salario = Double.parseDouble(s);
        double aumento;
        double salario_f;

        if (salario <= 280) {

            aumento = salario * 0.2;
            salario_f = salario + aumento;
            JOptionPane.showMessageDialog(null, String.format(
                    "Salário antes do reajuste: %.2f\nPercentual de aumento aplicado: 20\nValor do aumento: %.2f\nSalário, após o aumento: %.2f",
                    salario, aumento, salario_f));

        } else if (salario > 280 && salario <= 700) {

            aumento = salario * 0.15;
            salario_f = salario + aumento;
            JOptionPane.showMessageDialog(null,
                    String.format(
                            "Salário antes do reajuste: %.2f\n" + "Percentual de aumento aplicado: 15\n"
                                    + "Valor do aumento: %.2f\n" + "Salário, após o aumento: %.2f",
                            salario, aumento, salario_f));

        } else if (salario > 700 && salario <= 1500) {

            aumento = salario * 0.10;
            salario_f = salario + aumento;
            JOptionPane.showMessageDialog(null,
                    String.format(
                            "Salário antes do reajuste: %.2f\n" + "Percentual de aumento aplicado: 15\n"
                                    + "Valor do aumento: %.2f\n" + "Salário, após o aumento: %.2f",
                            salario, aumento, salario_f));

        } else if (salario > 1500) {

            aumento = salario * 0.05;
            salario_f = salario + aumento;
            JOptionPane.showMessageDialog(null,
                    String.format(
                            "Salário antes do reajuste: %.2f\n" + "Percentual de aumento aplicado: 15\n"
                                    + "Valor do aumento: %.2f\n" + "Salário, após o aumento: %.2f",
                            salario, aumento, salario_f));

        }
    }
}
