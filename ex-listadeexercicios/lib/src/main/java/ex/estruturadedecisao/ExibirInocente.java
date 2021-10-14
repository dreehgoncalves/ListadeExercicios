package ex.estruturadedecisao;

import javax.swing.JOptionPane;

public class ExibirInocente {
    public static void main(String[] args) {
        /*
         * Se a pessoa responder positivamente a 2 questões ela deve ser classificada
         * como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso
         * contrário, ele será classificado como "Inocente".
         */
        int i = 0;

        String q1 = JOptionPane.showInputDialog("Telefonou para a vítima?\n S - Sim ou N - Não");
        if (q1.equals("S") || q1.equals("s")) {
            i++;
        }

        String q2 = JOptionPane.showInputDialog("Esteve no local do crime?\n S - Sim ou N - Não");
        if (q2.equals("S") || q2.equals("s")) {
            i++;
        }

        String q3 = JOptionPane.showInputDialog("Mora perto da vítima?\n S - Sim ou N - Não");
        if (q3.equals("S") || q3.equals("s")) {
            i++;
        }

        String q4 = JOptionPane.showInputDialog("Devia para a vítima?\n S - Sim ou N - Não");
        if (q4.equals("S") || q4.equals("s")) {
            i++;
        }

        String q5 = JOptionPane.showInputDialog("Já trabalhou com a vítima?\n S - Sim ou N - Não");
        if (q5.equals("S") || q5.equals("s")) {
            i++;
        }

        switch (i) {
            case 0:
                JOptionPane.showMessageDialog(null, "Inocente");
                break;

            case 1:
                JOptionPane.showMessageDialog(null, "Inocente");
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "Suspeito");
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "Cúmplice");
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "Cúmplice");
                break;

            case 5:
                JOptionPane.showMessageDialog(null, "Assassino");
                break;
        }
    }
}
