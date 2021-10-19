package ex.estruturaderepeticao;

import java.util.Scanner;

public class ExibirMaOuMen {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a quantidade de valores: ");
        int valor[] = new int[sc.nextInt()];
        int soma = 0;

        for (int i = 0; i < valor.length; i++) {
            System.out.print("Informe o " + (i + 1) + "º valor: ");
            valor[i] = sc.nextInt();
            if (valor[i] < 0 || valor[i] > 1000) {
                System.out.print("Os valores devem estar entre 0 e 1000");
                System.exit(0);
            }
        }
        int maior = valor[0];
        for (int i = 1; i < valor.length; i++) {
            if (valor[i] > maior) {
                maior = valor[i];
            }
            soma += valor[i];
        }

        int menor = valor[0];
        for (int i = 1; i < valor.length; i++) {
            if (valor[i] < menor) {
                menor = valor[i];
            }
        }
        int soma2 = maior + menor;

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Soma: " + soma);
        System.out.println("Soma (maior e menor)= " + soma2);
    }
}
