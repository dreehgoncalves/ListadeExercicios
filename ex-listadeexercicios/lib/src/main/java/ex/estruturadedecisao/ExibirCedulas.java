package ex.estruturadedecisao;

import javax.swing.JOptionPane;

public class ExibirCedulas {
    public static void main(String[] args) {

        String n = JOptionPane.showInputDialog("Informe valor do saque:");
        int saque = Integer.parseInt(n);

        int nota_100 = (saque - (saque % 100)) / 100;
        int nota_50 = (saque % 100) / 50;
        int nota_10 = (saque % 50) / 10;
        int nota_5 = (saque % 10) / 5;
        int nota_1 = (saque % 100) % 5;

        if (saque >= 10 && saque <= 600) {
            if (saque < 50) {
                JOptionPane.showMessageDialog(null,
                        String.format("%d nota(s) de R$ 10,00\n%d nota(s) de R$ 5,00\n%d nota(s) de R$ 1,00\n", nota_10,
                                nota_5, nota_1));
            } else {
                JOptionPane.showMessageDialog(null, String.format(
                        "%d nota(s) de R$ 100,00\n%d nota(s) de R$ 50,00\n%d nota(s) de R$ 10,00\n%d nota(s) de R$ 5,00\n%d nota(s) de R$ 1,00\n",
                        nota_100, nota_50, nota_10, nota_5, nota_1));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Valor inválido");
        }

    }
}
