package ex.estruturadedecisao;

import javax.swing.JOptionPane;

public class ExibirTri {
    public static void main(String[] args) {

        String l1 = JOptionPane.showInputDialog("Informe a medida do primeiro lado:");
        double lado1 = Double.parseDouble(l1);

        String l2 = JOptionPane.showInputDialog("Informe a medida do primeiro lado:");
        double lado2 = Double.parseDouble(l2);

        String l3 = JOptionPane.showInputDialog("Informe a medida do primeiro lado:");
        double lado3 = Double.parseDouble(l3);

        double soma = lado1 + lado2;

        if (soma > lado3) {
            if (lado1 == lado2 && lado1 == lado3) {
                JOptionPane.showMessageDialog(null, "Essas medidas formam um triângulo equilatero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                JOptionPane.showMessageDialog(null, "Essas medidas formam um triângulo isoceles");
            } else if (lado1 != lado2 && lado2 != lado3) {
                JOptionPane.showMessageDialog(null, "Essas medidas formam um triângulo escaleno");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Essas medidas não formam um triângulo");
        }
    }
}
