package ex.estruturaderepeticao;

import javax.swing.JOptionPane;

public class ExibirPotencia {

    public static void main(String[] args) {

        String b = JOptionPane.showInputDialog("Informe a base:");
        int base_i = Integer.parseInt(b);

        String e = JOptionPane.showInputDialog("Informe o expoente:");
        int ex = Integer.parseInt(e);
        int base = base_i;
        int count;

        for (count = 1; count < ex; count++) {
            base = base * base_i;
        }

        System.out.printf("%d ^ %d = %d \n", base_i, ex, base);
    }
}
