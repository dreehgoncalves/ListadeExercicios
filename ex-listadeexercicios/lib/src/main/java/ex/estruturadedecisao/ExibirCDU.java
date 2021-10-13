package ex.estruturadedecisao;

import javax.swing.JOptionPane;

public class ExibirCDU {
    public static void main(String[] args) {
        /*
         * Faça um Programa que leia um número inteiro menor que 1000 e imprima a
         * quantidade de centenas, dezenas e unidades do mesmo. Observando os termos no
         * plural a colocação do "e", da vírgula entre outros. Exemplo: 326 = 3
         * centenas, 2 dezenas e 6 unidades 12 = 1 dezena e 2 unidades Testar com: 326,
         * 300, 100, 320, 310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16
         */

        String n = JOptionPane.showInputDialog("Informe um numero (menor que 1000):");
        int num = Integer.parseInt(n);

        int c = num / 100;
        int d = ((num - (c * 100)) / 10);
        int u = (num - (c * 100 + d * 10));

        if (num >= 1000) {
            JOptionPane.showMessageDialog(null, "Valor deve ser menor que 1000");
            System.exit(0);
        } else if (num == 0) {
            JOptionPane.showMessageDialog(null, "Valor é igual a 0");
            System.exit(0);
        }

        if (num < 1000) {
            if (num < 100) {
                if (d < 1 && u == 1) {
                    JOptionPane.showMessageDialog(null, String.format("%d unidade", u));

                } else if (d < 1 && u > 1) {
                    JOptionPane.showMessageDialog(null, String.format("%d unidades", u));

                } else if (d == 1 && u < 1) {
                    JOptionPane.showMessageDialog(null, String.format("%d dezena", d));

                } else if (d > 1 && u < 1) {
                    JOptionPane.showMessageDialog(null, String.format("%d dezenas", d));

                } else if (d == 1 && u == 1) {
                    JOptionPane.showMessageDialog(null, String.format("%d dezena e %d unidade", d, u));

                } else if (d > 1 && u == 1) {
                    JOptionPane.showMessageDialog(null, String.format("%d dezenas e %d unidade", d, u));

                } else if (d > 1 && u > 1) {
                    JOptionPane.showMessageDialog(null, String.format("%d dezenas e %d unidades", d, u));

                }
            } else if (num >= 100) {

                if (c == 1 && d < 1 && u < 1) {
                    JOptionPane.showMessageDialog(null, String.format("%d centena", c));

                } else if (c > 1 && d < 1 && u < 1) {
                    JOptionPane.showMessageDialog(null, String.format("%d centenas", c));

                } else if (c == 1 && d == 1 && u < 1) {
                    JOptionPane.showMessageDialog(null, String.format("%d centena e %d dezena", c, d));

                } else if (c > 1 && d > 1 && u < 1) {
                    JOptionPane.showMessageDialog(null, String.format("%d centenas e %d dezenas", c, d));

                } else if (c > 1 && d < 1 && u > 1) {
                    JOptionPane.showMessageDialog(null, String.format("%d centenas e %d unidades", c, u));

                } else if (c == 1 && d < 1 && u == 1) {
                    JOptionPane.showMessageDialog(null, String.format("%d centena e %d unidade", c, u));

                } else if (c == 1 && d == 1 && u == 1) {
                    JOptionPane.showMessageDialog(null, String.format("%d centena, %d dezena e %d unidade", c, d, u));

                } else if (c > 1 && d == 1 && u == 1) {
                    JOptionPane.showMessageDialog(null, String.format("%d centenas, %d dezena e %d unidade", c, d, u));

                } else if (c > 1 && d > 1 && u == 1) {
                    JOptionPane.showMessageDialog(null, String.format("%d centenas, %d dezenas e %d unidade", c, d, u));

                } else if (c > 1 && d > 1 && u > 1) {
                    JOptionPane.showMessageDialog(null,
                            String.format("%d centenas, %d dezenas e %d unidades", c, d, u));

                }
            }
        }
    }
}
