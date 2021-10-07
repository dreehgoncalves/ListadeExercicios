package ex.estruturadedecisao;

import javax.swing.JOptionPane;

public class ExibirSituacao {
    public static void main(String[] args) {

        String n1 = JOptionPane.showInputDialog("Informe a primeira nota");
        double nota1 = Double.parseDouble(n1);

        String n2 = JOptionPane.showInputDialog("Informe a segunda nota");
        double nota2 = Double.parseDouble(n2);

        double media = (nota1 + nota2) / 2;
        if (media == 10) {
            JOptionPane.showMessageDialog(null, "Aprovado com Distinção");
        } else if (media >= 7) {
            JOptionPane.showMessageDialog(null, "Aprovado");
        } else if (media < 7) {
            JOptionPane.showMessageDialog(null, "Reprovado");
        }
    }
}
