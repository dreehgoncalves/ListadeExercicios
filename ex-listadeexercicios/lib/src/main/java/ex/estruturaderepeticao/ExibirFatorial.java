package ex.estruturaderepeticao;

import javax.swing.JOptionPane;

public class ExibirFatorial {

    public static void main(String[] args) {
        boolean d = true;
        while (d == true) {
            String n1 = JOptionPane.showInputDialog("Informe um numero a ser fatorado:");
            int b = Integer.parseInt(n1);

            if (b < 0 || b > 16) {
                JOptionPane.showMessageDialog(null, "Número inválido");
                break;
            }

            int res = fatorial(b);

            JOptionPane.showMessageDialog(null, String.format("O fatorial de %d é: %d", b, res));
        }
    }

    static int fatorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fatorial(n - 1);
    }
}
