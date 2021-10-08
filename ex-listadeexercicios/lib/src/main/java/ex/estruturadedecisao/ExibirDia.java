package ex.estruturadedecisao;

import javax.swing.JOptionPane;

public class ExibirDia {
    public static void main(String[] args) {
        String d = JOptionPane.showInputDialog("Informe um numero entre 1 e 7");
        int dia = Integer.parseInt(d);

        if (dia == 1) {
            JOptionPane.showMessageDialog(null, "Domingo");
        } else if (dia == 2) {
            JOptionPane.showMessageDialog(null, "Segunda");
        } else if (dia == 3) {
            JOptionPane.showMessageDialog(null, "Terça");
        } else if (dia == 4) {
            JOptionPane.showMessageDialog(null, "Quarta");
        } else if (dia == 5) {
            JOptionPane.showMessageDialog(null, "Quinta");
        } else if (dia == 6) {
            JOptionPane.showMessageDialog(null, "Sexta");
        } else if (dia == 7) {
            JOptionPane.showMessageDialog(null, "Sábado");
        } else {
            JOptionPane.showMessageDialog(null, "Valor invalido");
        }
    }
}
