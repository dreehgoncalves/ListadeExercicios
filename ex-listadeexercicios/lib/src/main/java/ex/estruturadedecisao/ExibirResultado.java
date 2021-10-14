package ex.estruturadedecisao;

import br.com.softblue.commons.io.Console;

public class ExibirResultado {
    public static void main(String[] args) {

        System.out.printf("Informe o primeiro número:\n");
        double num1 = Console.readDouble();

        System.out.printf("Informe o segundo número:\n");
        double num2 = Console.readDouble();

        System.out.printf("Informe a operação:\n");
        String op = Console.readString();

        double res = 0;
        String teste_pi, teste_neg, teste_inteiro;

        if (op.equals("+")) {
            res = num1 + num2;
        } else if (op.equals("-")) {
            res = num1 - num2;
        } else if (op.equals("*")) {
            res = num1 * num2;
        } else if (op.equals("/")) {
            res = num1 / num2;
        }

        if (res % 2 == 0) {
            teste_pi = "Par";
        } else {
            teste_pi = "Impar";
        }

        if (res < 0) {
            teste_neg = "Negativo";
        } else {
            teste_neg = "Positivo";
        }

        if (res == (int) res) {
            teste_inteiro = "Inteiro";
        } else {
            teste_inteiro = "Decimal";
        }

        System.out.printf("O resultado de %.1f %s %.1f eh: %.1f\n", num1, op, num2, res);
        System.out.printf("O resultado eh: %s, %s e %s", teste_pi, teste_neg, teste_inteiro);

    }
}
