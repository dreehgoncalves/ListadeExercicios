package ex.estruturasequencial;

import javax.swing.JOptionPane;

public class ExibirVelocidade {

	public static void main(String[] args) {
		
		String u_mb = JOptionPane.showInputDialog("Informe o tamanho do arquivo em Mb:");
        int mb = Integer.parseInt(u_mb);
        
        String v_int = JOptionPane.showInputDialog("Informe a velocidade do link em Mbps:");
        double velocidade = Double.parseDouble(v_int) / 8;
		 
        double download = (mb / velocidade) / 60;
        
        JOptionPane.showMessageDialog(null, String.format("O download ira demorar %.2f minutos", download));

	}

}
