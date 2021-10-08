package ex.estruturadedecisao;

import javax.swing.JOptionPane;

public class ExibirNumOrD {
    public static void main(String[] args) {

        String n1 = JOptionPane.showInputDialog("Informe o primeiro número");
        int num1 = Integer.parseInt(n1);

        String n2 = JOptionPane.showInputDialog("Informe o segundo número");
        int num2 = Integer.parseInt(n2);

        String n3 = JOptionPane.showInputDialog("Informe o terceiro número");
        int num3 = Integer.parseInt(n3);

        int primeiro = num1;
        int segundo = 0;
        int terceiro = 0;

        if (num1 < num2 && num1 < num3) {
            primeiro = num1;
        } else if (num2 < primeiro && num2 < num3) {
            primeiro = num2;
        } else if (num3 < primeiro && num3 < num2) {
            primeiro = num3;
        }

        if (num1 > num2 && num1 > num3) {
            terceiro = num1;
        } else if (num2 > primeiro && num2 > num3) {
            terceiro = num2;
        } else if (num3 > primeiro && num3 > num2) {
            terceiro = num3;
        }

        if (num1 > primeiro && num1 < terceiro) {
            segundo = num1;
        } else if (num2 > primeiro && num2 < terceiro) {
            segundo = num2;
        } else if (num3 > primeiro && num3 < terceiro) {
            segundo = num3;
        }

        JOptionPane.showMessageDialog(null,
                String.format("Em ordem decrescente:\n%d\n%d\n%d\n", terceiro, segundo, primeiro));

    }

}
