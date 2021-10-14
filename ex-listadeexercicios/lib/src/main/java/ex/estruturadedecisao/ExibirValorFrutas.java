package ex.estruturadedecisao;

import javax.swing.JOptionPane;

public class ExibirValorFrutas {
    public static void main(String[] args) {

        String t = JOptionPane.showInputDialog("Quer comprar 1 ou 2 tipos de frutas?\n 1 ou 2");
        int tipo = Integer.parseInt(t);
        double valor = 0;

        if (tipo == 1) {

            String f = JOptionPane.showInputDialog("Gostaria de comprar:\n MA - Maçã ou MO - Morango");
            f = f.toUpperCase();

            String kg = JOptionPane.showInputDialog("Informe a quantidade (em Kg):");
            double quilos = Double.parseDouble(kg);

            switch (f) {
                case "MA":
                    if (quilos <= 5) {
                        valor = quilos * 1.8;
                    } else if (quilos <= 8) {
                        valor = quilos * 1.5;
                    } else if (quilos > 8) {
                        valor = quilos * (1.5 * 0.9);
                    }
                    JOptionPane.showMessageDialog(null,
                            String.format("Fruta comprada: Maçã\nQuantidade: %.2f\nValor total: %.2f", quilos, valor));
                    break;

                case "MO":
                    if (quilos <= 5) {
                        valor = quilos * 2.5;
                    } else if (quilos <= 8) {
                        valor = quilos * 2.2;
                    } else if (quilos > 8) {
                        valor = quilos * (2.2 * 0.9);
                    }
                    JOptionPane.showMessageDialog(null, String
                            .format("Fruta comprada: Morango\nQuantidade: %.2f\nValor total: %.2f", quilos, valor));
                    break;

            }
        } else if (tipo == 2) {

            String ma_kg = JOptionPane.showInputDialog("Informe a quantidade de Maçãs (em Kg):");
            double ma_quilos = Double.parseDouble(ma_kg);

            String mo_kg = JOptionPane.showInputDialog("Informe a quantidade de Morangos (em Kg):");
            double mo_quilos = Double.parseDouble(mo_kg);

            double quilos_total = ma_quilos + mo_quilos;

            if (quilos_total <= 5) {
                valor = (ma_quilos * 1.8) + (mo_quilos * 2.5);
            } else if (quilos_total <= 8) {
                valor = (ma_quilos * 1.5) + (mo_quilos * 2.2);
            } else if (quilos_total > 8) {
                valor = (ma_quilos * 1.5) + (mo_quilos * 2.2);
                valor = valor * 0.9;
            }
            JOptionPane.showMessageDialog(null, String
                    .format("Frutas: Maçãs e Morangos\nQuantidade: %.2f Kg\nValor total: %.2f", quilos_total, valor));

        }

    }

}
