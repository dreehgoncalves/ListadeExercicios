package ex.estruturaderepeticao;

import javax.swing.JOptionPane;

public class ExibirNumMaior {
    public static void main(String[] args) {
        /* Faça um programa que leia 5 números e informe o maior número */
        int a = 0;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        int maior = 0;

        do {
            a++;
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

            if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
                maior = num1;
            } else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
                maior = num2;
            } else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
                maior = num3;
            } else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
                maior = num4;
            } else if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4) {
                maior = num5;
            }

        } while (a <= 5);
        JOptionPane.showMessageDialog(null, String.format("O numero %d é maior", maior));
    }
}
