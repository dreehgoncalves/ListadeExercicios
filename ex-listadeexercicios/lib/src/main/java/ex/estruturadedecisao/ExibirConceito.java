package ex.estruturadedecisao;

import javax.swing.JOptionPane;

public class ExibirConceito {
    public static void main(String[] args) {

        String n1 = JOptionPane.showInputDialog("Informe a primeira nota:");
        double nota1 = Double.parseDouble(n1);

        String n2 = JOptionPane.showInputDialog("Informe a segunda nota:");
        double nota2 = Double.parseDouble(n2);

        double media = (nota1 + nota2) / 2;
        String conceito;

        // O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente
        // e a mensagem “APROVADO” se o conceito for A, B ou C ou “REPROVADO” se o
        // conceito for D ou E.

        if (media > 0 && media <= 4) {

            conceito = "E";
            JOptionPane.showMessageDialog(null, String.format("Média: %.1f\nConceito: %s\nREPROVADO", media, conceito));

        } else if (media > 4 && media <= 6) {

            conceito = "D";
            JOptionPane.showMessageDialog(null, String.format("Média: %.1f\nConceito: %s\nREPROVADO", media, conceito));

        } else if (media > 6 && media <= 7.5) {

            conceito = "C";
            JOptionPane.showMessageDialog(null, String.format("Média: %.1f\nConceito: %s\nAPROVADO", media, conceito));

        } else if (media > 7.5 && media <= 9) {

            conceito = "B";
            JOptionPane.showMessageDialog(null, String.format("Média: %.1f\nConceito: %s\nAPROVADO", media, conceito));

        } else if (media > 9 && media <= 10) {

            conceito = "A";
            JOptionPane.showMessageDialog(null, String.format("Média: %.1f\nConceito: %s\nAPROVADO", media, conceito));

        }
    }
}
