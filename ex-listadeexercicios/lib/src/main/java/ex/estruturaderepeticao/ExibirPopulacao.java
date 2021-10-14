package ex.estruturaderepeticao;

import javax.swing.JOptionPane;

public class ExibirPopulacao {

    public static void main(String[] args) {
        String pA = JOptionPane.showInputDialog("Informe a população inicial A:");
        double popA = Double.parseDouble(pA);

        String tA = JOptionPane.showInputDialog("Informe a taxa inicial A:");
        double taxaA = Double.parseDouble(tA);

        String pB = JOptionPane.showInputDialog("Informe a população inicial B:");
        double popB = Double.parseDouble(pB);

        String tB = JOptionPane.showInputDialog("Informe a taxa inicial A:");
        double taxaB = Double.parseDouble(tB);

        for (int ano = 0; popA < popB; ano++) {

            popA += (popA * (taxaA / 100));

            popB += (popB * (taxaB / 100));

            if (popA > popB) {
                System.out.printf(
                        "Levará %d anos para a população A ser maior\nPopulação A: %.0f (Taxa: %.2f)\nPopulação B: %.0f (Taxa: %.2f)",
                        ano, popA, taxaA, popB, taxaB);
            }

        }

    }

}
