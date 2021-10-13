package ex.estruturadedecisao;

import javax.swing.JOptionPane;

public class ExibirDataValida {
    public static void main(String[] args) {

        String d = JOptionPane.showInputDialog("Informe dia:");
        int dia = Integer.parseInt(d);

        String m = JOptionPane.showInputDialog("Informe mês:");
        int mes = Integer.parseInt(m);

        String a = JOptionPane.showInputDialog("Informe ano:");
        int ano = Integer.parseInt(a);

        boolean d_valido = false;
        boolean a_valido = false;

        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            a_valido = true;
        }

        switch (mes) {
            case 1:
                if (dia <= 31) {
                    d_valido = true;
                }

            case 2:
                if (a_valido == true) {
                    if (dia <= 29) {
                        d_valido = true;
                    } else if (dia <= 28) {
                        d_valido = true;
                    }
                }

            case 3:
                if (dia <= 31) {
                    d_valido = true;
                }

            case 4:
                if (dia <= 30) {
                    d_valido = true;
                }

            case 5:
                if (dia <= 31) {
                    d_valido = true;
                }

            case 6:
                if (dia <= 30) {
                    d_valido = true;
                }

            case 7:
                if (dia <= 31) {
                    d_valido = true;
                }

            case 8:
                if (dia <= 31) {
                    d_valido = true;
                }

            case 9:
                if (dia <= 30) {
                    d_valido = true;
                }

            case 10:
                if (dia <= 31) {
                    d_valido = true;
                }

            case 11:
                if (dia <= 30) {
                    d_valido = true;
                }

            case 12:
                if (dia <= 31) {
                    d_valido = true;
                }
        }

        if (d_valido == true) {
            JOptionPane.showMessageDialog(null, String.format("A data %d/%d/%d é valida", dia, mes, ano));
        } else {
            JOptionPane.showMessageDialog(null, String.format("A data %d/%d/%d não é valida", dia, mes, ano));
        }
    }
}
