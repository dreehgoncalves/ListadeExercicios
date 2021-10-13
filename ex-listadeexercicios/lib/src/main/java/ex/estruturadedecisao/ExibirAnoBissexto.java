package ex.estruturadedecisao;

import javax.swing.JOptionPane;

public class ExibirAnoBissexto {
    public static void main(String[] args) {

        String ano_d = JOptionPane.showInputDialog("Informe o ano:");
        int ano = Integer.parseInt(ano_d);

        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {

            JOptionPane.showMessageDialog(null, String.format("O ano %d é um ano Bissexto", ano));

        } else {

            JOptionPane.showMessageDialog(null, String.format("O ano %d não é um ano Bissexto", ano));

        }
    }
}
