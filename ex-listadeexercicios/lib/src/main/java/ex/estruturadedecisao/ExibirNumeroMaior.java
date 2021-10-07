package ex.estruturadedecisao;

import javax.swing.JOptionPane;

public class ExibirNumeroMaior {
    public static void main(String[] args) {

        String n1 = JOptionPane.showInputDialog("Informe o primeiro número");
        int num1 = Integer.parseInt(n1);

        String n2 = JOptionPane.showInputDialog("Informe o segundo número");
        int num2 = Integer.parseInt(n2);

        String n3 = JOptionPane.showInputDialog("Informe o terceiro número");
        int num3 = Integer.parseInt(n3);

        if (num1 > num2 && num1 >= num3) {
            JOptionPane.showMessageDialog(null, String.format("Número %d é maior", num1));
        } else if (num2 > num1 && num2 > num3) {
            JOptionPane.showMessageDialog(null, String.format("Número %d é maior", num2));
        } else if (num3 > num1 && num3 > num2) {
            JOptionPane.showMessageDialog(null, String.format("Número %d é maior", num3));
        }
    }
}
