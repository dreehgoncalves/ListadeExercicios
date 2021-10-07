package ex.estruturadedecisao;

import javax.swing.JOptionPane;

public class ExibirPosNeg {
    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog("Informe um numero");
        int num = Integer.parseInt(numero);

        if (num < 0) {
            JOptionPane.showMessageDialog(null, String.format("O numero %d e negativo", num));
        } else {
            JOptionPane.showMessageDialog(null, String.format("O numero %d e positivo", num));
        }
    }
}
