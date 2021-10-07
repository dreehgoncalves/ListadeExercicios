package ex.estruturadedecisao;

import javax.swing.JOptionPane;

public class ExibirConsoante {
    public static void main(String[] args) {
        // Faça um Programa que verifique se uma letra digitada é vogal ou consoante.

        String letra_digitada = JOptionPane.showInputDialog("Informe uma letra");
        String letra = letra_digitada.toUpperCase();

        if (letra.equals("A") || letra == "E" || letra == "I" || letra == "O" || letra == "U") {
            JOptionPane.showMessageDialog(null, "Vogal");
        } else if (letra.equals("B") || letra.equals("C") || letra.equals("D") || letra.equals("F") || letra.equals("G")
                || letra.equals("H") || letra.equals("J") || letra.equals("K") || letra.equals("L") || letra.equals("M")
                || letra.equals("N") || letra.equals("P") || letra.equals("Q") || letra.equals("R") || letra.equals("S")
                || letra.equals("T") || letra.equals("V") || letra.equals("W") || letra.equals("X") || letra.equals("Y")
                || letra.equals("Z")) {

            JOptionPane.showMessageDialog(null, "Consoante");

        } else {
            JOptionPane.showMessageDialog(null, "Letra inválida");
        }

    }
}
