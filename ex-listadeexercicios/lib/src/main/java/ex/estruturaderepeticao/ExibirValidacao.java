package ex.estruturaderepeticao;

import javax.swing.JOptionPane;

public class ExibirValidacao {
    public static void main(String[] args) {
        String nome = String.valueOf(validarNome());
        int idade = Integer.valueOf(validarIdade());
        double salario = Double.valueOf(validarSalario());
        String sexo = String.valueOf(validarSexo());
        String estado_civil = String.valueOf(validarEstadoCivil());

        JOptionPane.showMessageDialog(null,
                String.format("Nome: %s\nIdade: %d anos\nSalário: R$ %.2f\nSexo: %s\nEstado civil: %s", nome, idade,
                        salario, sexo, estado_civil));
    }

    public static String validarNome() {
        String nome = JOptionPane.showInputDialog("Informe um nome");
        int nome_inv = 1;

        if (nome.length() < 3) {
            nome_inv = 0;
        }

        while (nome_inv == 0) {
            JOptionPane.showMessageDialog(null, "Corrija as informações");
            validarNome();
        }
        return nome;

    }

    public static int validarIdade() {
        String i = JOptionPane.showInputDialog("Informe a idade");
        int idade = Integer.parseInt(i);

        int idade_inv = 0;
        if (idade < 0 || idade > 150) {
            idade_inv = 1;
        }

        while (idade_inv == 1) {
            JOptionPane.showMessageDialog(null, "Corrija as informações");
            validarIdade();
        }
        return idade;

    }

    public static Double validarSalario() {
        String s = JOptionPane.showInputDialog("Informe o salário");
        double salario = Double.parseDouble(s);

        int sal_inv = 0;
        if (salario < 0) {
            sal_inv = 1;
        }
        while (sal_inv == 1) {
            JOptionPane.showMessageDialog(null, "Corrija as informações");
            validarSalario();
        }
        return salario;

    }

    public static String validarSexo() {
        String s = JOptionPane.showInputDialog("Informe o sexo\n F - Feminino ou M - Masculino");
        s = s.toUpperCase();
        int sexo_inv = 1;

        if (s.equals("F")) {
            sexo_inv = 0;
        } else if (s.equals("M")) {
            sexo_inv = 0;
        }

        while (sexo_inv == 1) {
            JOptionPane.showMessageDialog(null, "Corrija as informações");
            validarSexo();
        }

        return s;
    }

    public static String validarEstadoCivil() {
        String ec = JOptionPane.showInputDialog("Informe o Estado Civil: 'S', 'C', 'V', 'D'");
        ec = ec.toUpperCase();
        int ec_inv = 1;

        if (ec.equals("S")) {
            ec_inv = 0;
            ec = "Solteiro(a)";
        } else if (ec.equals("C")) {
            ec_inv = 0;
            ec = "Casado(a)";
        } else if (ec.equals("V")) {
            ec_inv = 0;
            ec = "Viúvo(a)";
        } else if (ec.equals("D")) {
            ec_inv = 0;
            ec = "Divorciado(a)";
        }

        while (ec_inv == 1) {
            JOptionPane.showMessageDialog(null, "Corrija as informações");
            validarEstadoCivil();
        }

        return ec;
    }
}
