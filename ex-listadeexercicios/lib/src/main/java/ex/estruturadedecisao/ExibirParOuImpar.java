package ex.estruturadedecisao;

import javax.swing.JOptionPane;

public class ExibirParOuImpar {
    public static void main(String[] args) {
        String n = JOptionPane.showInputDialog("Informe o número");
        int num = Integer.parseInt(n);

        if ((num % 2) == 0) {
            JOptionPane.showMessageDialog(null, String.format("O número %d é par", num));
        } else {
            JOptionPane.showMessageDialog(null, String.format("O número %d é impar", num));
        }
    }
}
