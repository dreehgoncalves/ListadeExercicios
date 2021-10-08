package ex.estruturadedecisao;

import javax.swing.JOptionPane;

public class ExibirTurno {
    public static void main(String[] args) {

        String turno = JOptionPane
                .showInputDialog("Em que turno você estuda?\nDigite\nM-Matutino ou V-Vespertino ou N - Noturno");

        if (turno.equals("M") || turno.equals("m")) {

            JOptionPane.showMessageDialog(null, "Bom Dia!");

        } else if (turno.equals("V") || turno.equals("v")) {

            JOptionPane.showMessageDialog(null, "Boa Tarde!");

        } else if (turno.equals("N") || turno.equals("n")) {

            JOptionPane.showMessageDialog(null, "Boa Noite!");

        } else {

            JOptionPane.showMessageDialog(null, "Valor Inválido!");

        }
    }
}
