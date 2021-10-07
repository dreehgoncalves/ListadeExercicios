package ex.estruturadedecisao;

import javax.swing.JOptionPane;

public class ExibirProduto {
    public static void main(String[] args) {
        // Faça um programa que pergunte o preço de três produtos e informe qual produto
        // você deve comprar,
        // sabendo que a decisão é sempre pelo mais barato.

        String v1 = JOptionPane.showInputDialog("Informe o primeiro valor");
        double valor1 = Double.parseDouble(v1);

        String v2 = JOptionPane.showInputDialog("Informe o segundo valor");
        double valor2 = Double.parseDouble(v2);

        String v3 = JOptionPane.showInputDialog("Informe o terceiro valor");
        double valor3 = Double.parseDouble(v3);

        if (valor1 < valor2 && valor1 < valor3) {
            JOptionPane.showMessageDialog(null, "Você deve comprar o primeiro produto");
        }

        if (valor2 < valor1 && valor2 < valor3) {
            JOptionPane.showMessageDialog(null, "Você deve comprar o segundo produto");
        }

        if (valor3 < valor1 && valor3 < valor2) {
            JOptionPane.showMessageDialog(null, "Você deve comprar o terceiro produto");
        }

    }
}
