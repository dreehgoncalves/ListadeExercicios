package ex.estruturaderepeticao;

import javax.swing.JOptionPane;

public class ExibirValorValido {

    public static void main(String[] args) {

        while (validarNota() == 1) {
            JOptionPane.showMessageDialog(null, "Nota Inválida");
            validarNota();
        }
    }

    private static int validarNota() {
        String n = JOptionPane.showInputDialog("Informe uma nota entre 0 e 10");
        int nota = Integer.parseInt(n);
        int inv = 0;

        if (nota < 0 || nota > 10) {
            inv = 1;
        } else {
            JOptionPane.showMessageDialog(null, "Nota: " + nota + " é válida");
            System.exit(0);
        }
        return inv;

    }

}
