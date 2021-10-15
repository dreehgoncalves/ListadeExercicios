package ex.estruturaderepeticao;

import javax.swing.JOptionPane;

public class ExibirSomaMedia {
    public static void main(String[] args) {

        int a = 1;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        int soma = 0;
        double media = 0;

        while (a <= 5) {

            String n = JOptionPane.showInputDialog("Informe um numero:");
            int num = Integer.parseInt(n);

            if (a == 1) {
                num1 = num;
            } else if (a == 2) {
                num2 = num;
            } else if (a == 3) {
                num3 = num;
            } else if (a == 4) {
                num4 = num;
            } else if (a == 5) {
                num5 = num;
            }
            a++;
        }

        soma = num1 + num2 + num3 + num4 + num5;
        media = soma / 5;
        JOptionPane.showMessageDialog(null, String.format("A soma é: %d\nA média é: %.2f", soma, media));
    }
}
