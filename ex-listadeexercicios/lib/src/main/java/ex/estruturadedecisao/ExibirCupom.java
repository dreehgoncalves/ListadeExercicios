package ex.estruturadedecisao;

import javax.swing.JOptionPane;

public class ExibirCupom {
    public static void main(String[] args) {

        String t = JOptionPane.showInputDialog(
                "------------------Tipo de carne------------------\n 1 - File Duplo, 2 - Alcatra ou 3 - Picanha");
        int tipo = Integer.parseInt(t);
        if (tipo > 3) {
            JOptionPane.showMessageDialog(null, "Valor inválido");
            System.exit(0);
        }

        String c = JOptionPane
                .showInputDialog("A compra será no cartão do mercado?\n------------S - Sim ou N - Não------------");
        c = c.toUpperCase();

        String kg = JOptionPane.showInputDialog("Informe a quantidade (em Kg):");
        double quilos = Double.parseDouble(kg);

        double valor = 0;
        double valor_t = 0;
        double desconto = 0;
        String op = "Sem cartão da loja";

        if (tipo == 1) {
            if (quilos <= 5) {
                valor = quilos * 4.9;
                valor_t = valor - desconto;
            } else if (quilos > 5) {
                valor = quilos * 5.8;
                valor_t = valor - desconto;
            }

            if (c.equals("S")) {
                desconto = valor * 0.05;
                valor_t = valor - desconto;
                op = "Cartão da loja";
            }

            JOptionPane.showMessageDialog(null, String.format(
                    "--------------CUPOM FISCAL--------------\nTipo: File Duplo\nQuantidade : %.2f kg\nPreço total: R$ %.2f\nTipo de pagamento: %s\nValor do desconto: R$ %.2f\nPreço com desconto: R$ %.2f",
                    quilos, valor, op, desconto, valor_t));

        } else if (tipo == 2) {

            if (quilos <= 5) {
                valor = quilos * 5.9;
                valor_t = valor - desconto;
            } else if (quilos > 5) {
                valor = quilos * 6.8;
                valor_t = valor - desconto;
            }

            if (c.equals("S")) {
                desconto = valor * 0.05;
                valor_t = valor - desconto;
                op = "Cartão da loja";
            }

            JOptionPane.showMessageDialog(null, String.format(
                    "--------------CUPOM FISCAL--------------\nTipo: Alcatra\nQuantidade : %.2f kg\nPreço total: R$ %.2f\nTipo de pagamento: %s\nValor do desconto: R$ %.2f\nPreço com desconto: R$ %.2f",
                    quilos, valor, op, desconto, valor_t));

        } else if (tipo == 3) {

            if (quilos <= 5) {
                valor = quilos * 6.9;
                valor_t = valor - desconto;
            } else if (quilos > 5) {
                valor = quilos * 7.8;
                valor_t = valor - desconto;
            }

            if (c.equals("S")) {
                desconto = valor * 0.05;
                valor_t = valor - desconto;
                op = "Cartão da loja";
            }

            JOptionPane.showMessageDialog(null, String.format(
                    "--------------CUPOM FISCAL--------------\nTipo: Picanha\nQuantidade : %.2f kg\nPreço total: R$ %.2f\nTipo de pagamento: %s\nValor do desconto: R$ %.2f\nPreço com desconto: R$ %.2f",
                    quilos, valor, op, desconto, valor_t));

        }

    }
}
