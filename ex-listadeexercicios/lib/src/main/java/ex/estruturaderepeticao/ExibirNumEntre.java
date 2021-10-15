package ex.estruturaderepeticao;

import javax.swing.JOptionPane;

public class ExibirNumEntre {

    public static void main(String[] args) {

        String n1 = JOptionPane.showInputDialog("Informe um numero:");
        int num1 = Integer.parseInt(n1);

        String n2 = JOptionPane.showInputDialog("Informe um numero:");
        int num2 = Integer.parseInt(n2);

        for (int inicio = num1 + (1); inicio < num2; inicio++) {
            System.out.printf("%d\n", inicio);
        }
    }
}
