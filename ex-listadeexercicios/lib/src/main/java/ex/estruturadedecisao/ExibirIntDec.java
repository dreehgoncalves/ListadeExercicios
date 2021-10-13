package ex.estruturadedecisao;

import javax.swing.JOptionPane;

public class ExibirIntDec {
    public static void main(String[] args) {

        String n = JOptionPane.showInputDialog("Informe o número");
        double num = Double.parseDouble(n);

        if (num == (int) num) {
            JOptionPane.showMessageDialog(null, String.format("O numero %.0f é inteiro", num));
        } else {
            JOptionPane.showMessageDialog(null, String.format("O numero %.1f não é inteiro", num));
        }

    }
}
