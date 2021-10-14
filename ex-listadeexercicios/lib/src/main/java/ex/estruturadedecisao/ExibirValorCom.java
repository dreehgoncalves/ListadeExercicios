package ex.estruturadedecisao;

import javax.swing.JOptionPane;

public class ExibirValorCom {
    public static void main(String[] args) {
        String l1 = JOptionPane.showInputDialog("Informe Litros vendidos");
        double litros = Double.parseDouble(l1);

        String comb = JOptionPane.showInputDialog("Informe combustível:\nA-álcool, G-gasolina");
        comb = comb.toUpperCase();
        double valor;

        switch (comb) {
            case "A":
                if (litros <= 20) {
                    valor = litros * (1.9 * 0.97);
                } else {
                    valor = litros * (1.9 * 0.95);
                }
                JOptionPane.showMessageDialog(null, String.format("Valor total: %.2f", valor));
                break;

            case "G":
                if (litros <= 20) {
                    valor = litros * (2.5 * 0.94);
                } else {
                    valor = litros * (1.9 * 0.96);
                }
                JOptionPane.showMessageDialog(null, String.format("Valor total: %.2f", valor));
                break;
        }

    }
}
