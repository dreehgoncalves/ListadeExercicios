package ex.estruturaderepeticao;

import javax.swing.JOptionPane;

public class ExibirNumEntre {

    public static void main(String[] args) {

        String n1 = JOptionPane.showInputDialog("Informe um numero:");
        int num1 = Integer.parseInt(n1);

        String n2 = JOptionPane.showInputDialog("Informe um numero:");
        int num2 = Integer.parseInt(n2);
        int soma = 0;

        for (int inicio = num1 + (1); inicio < num2; inicio++) {
            // soma ex - 11
            soma += inicio;

            // ex - 10
            // System.out.printf("%d\n", inicio);
        }
        System.out.printf("%d\n", soma);
    }
}
