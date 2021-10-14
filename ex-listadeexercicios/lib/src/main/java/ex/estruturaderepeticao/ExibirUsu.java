package ex.estruturaderepeticao;

import javax.swing.JOptionPane;

public class ExibirUsu {
    public static void main(String[] args) {

        while (validarUsuario() == 1) {
            JOptionPane.showMessageDialog(null, "Corrija as informações");
            validarUsuario();
        }
    }

    private static int validarUsuario() {
        String u = JOptionPane.showInputDialog("Informe um nome de usuario");
        String s = JOptionPane.showInputDialog("Informe uma senha");
        int inv = 0;

        if (u.equals(s)) {
            inv = 1;
        } else {
            JOptionPane.showMessageDialog(null, "Cadastro aceito");
            System.exit(0);
        }
        return inv;

    }
}
