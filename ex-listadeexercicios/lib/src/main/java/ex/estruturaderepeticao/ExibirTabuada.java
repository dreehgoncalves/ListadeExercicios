package ex.estruturaderepeticao;

import javax.swing.JOptionPane;

public class ExibirTabuada {
    public static void main(String[] args) {

        String n1 = JOptionPane.showInputDialog("Informe um numero:");
        int num1 = Integer.parseInt(n1);

        System.out.printf("Tabuada de %d\n", num1);
        for (int a = 1; a <= 10; a++) {
            int res = num1 * a;
            System.out.printf("%d x %d = %d\n", num1, a, res);
        }
    }
}
