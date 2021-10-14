package ex.estruturaderepeticao;

import javax.swing.JOptionPane;

public class ExibirValorValido {

    public static void main(String[] args) {

        while (extracted() == 1) {
            JOptionPane.showMessageDialog(null, "Nota Inválida");
            extracted();
        }
    }

    private static int extracted() {
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
