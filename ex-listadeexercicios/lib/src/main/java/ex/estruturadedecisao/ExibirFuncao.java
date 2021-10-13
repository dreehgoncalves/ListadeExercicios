package ex.estruturadedecisao;

import javax.swing.JOptionPane;

public class ExibirFuncao {
    public static void main(String[] args) {
        double a, b, c, delta, raiz1, raiz2;

        String v_a = JOptionPane.showInputDialog("Informe o valor de A:");
        a = Double.parseDouble(v_a);

        if (a == 0) {
            JOptionPane.showMessageDialog(null, "Esta equação está incompleta");
            System.exit(0);
        }

        String v_b = JOptionPane.showInputDialog("Informe o valor de B:");
        b = Double.parseDouble(v_b);

        String v_c = JOptionPane.showInputDialog("Informe o valor de B:");
        c = Double.parseDouble(v_c);

        if (a != 0) {
            delta = Math.pow(b, 2) - 4 * a * c;

            if (delta == 0) {
                raiz1 = (-b + Math.sqrt(delta)) / (2 * a);

                JOptionPane.showMessageDialog(null, String.format("Delta: 0\nRaiz 1: %.2f\n", delta, raiz1));

            } else if (delta < 0) {

                JOptionPane.showMessageDialog(null, "Delta menor que 0!\nA equação não possui raizes reais");

            } else if (delta > 0) {

                raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                raiz2 = (-b - Math.sqrt(delta)) / (2 * a);

                JOptionPane.showMessageDialog(null,
                        String.format("Delta: 0\nRaiz 1: %.2f\nRaiz 2: %.2f", delta, raiz1, raiz2));

            }
        }
    }
}
