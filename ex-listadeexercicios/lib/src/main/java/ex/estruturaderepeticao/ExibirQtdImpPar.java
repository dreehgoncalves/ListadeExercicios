package ex.estruturaderepeticao;

import javax.swing.JOptionPane;

public class ExibirQtdImpPar {

    public static void main(String[] args) {
        /*
         * Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade
         * de números pares e a quantidade de números impares.
         */
        int a = 0;
        int par = 0;
        int impar = 0;

        for (a = 0; a < 10; a++) {
            String n = JOptionPane.showInputDialog("Informe um numero:");
            int num = Integer.parseInt(n);

            if (num % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        JOptionPane.showMessageDialog(null,
                String.format("Foram digitados %d numeros pares e %d numeros impares", par, impar));
    }
}