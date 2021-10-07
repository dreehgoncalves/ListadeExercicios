package ex.estruturadedecisao;

import javax.swing.JOptionPane;

public class ExibirFouM {
    public static void main(String[] args) {

        String sexo = JOptionPane.showInputDialog("Informe F ou M");

        if (sexo.equals("F") || sexo.equals("f")) {
            JOptionPane.showMessageDialog(null, "Feminino");
        } else if (sexo.equals("M") || sexo.equals("m")) {
            JOptionPane.showMessageDialog(null, "Masculino");
        } else {
            JOptionPane.showMessageDialog(null, "Sexo Inválido");
        }
    }
}
