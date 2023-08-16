package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.bean.ContaEspecial;

public class UsaConta2 {
	
	public static void main(String[] args) {
		ContaEspecial ce = new ContaEspecial();
		String continuar = "sim", aux;
		float saldo, limite;
		int numConta, opcao;
		
		while (continuar.equalsIgnoreCase("sim")) {
			try {
				
			
			aux = JOptionPane.showInputDialog("Digite o Número da conta: ");
			numConta = Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("Digite o saldo da conta: ");
			saldo = Integer.parseInt(aux);
			aux =  JOptionPane.showInputDialog("Informe o limite:  ");
			limite = Integer.parseInt(aux);
			
			ce.setNumConta(numConta);
			ce.setSaldo(saldo);
			ce.setLimite(limite);
			
		aux = JOptionPane.showInputDialog("Qual Operação deseja execultar: "
				+ "(1) Sacar"
				+ "(2) Depositar");
		
		opcao = Integer.parseInt(aux);
		switch (opcao) {
		case 1:
			aux = JOptionPane.showInputDialog("Digite o valor do saque:  ");
			JOptionPane.showMessageDialog(null, "\nNumConta: " + ce.getNumConta()
			+ "\nSaldo: " + ce.getSaldo()
			+ "\nLimite: " + ce.getLimite()
			+ "\nSaldo Atual: " + ce.sacar(limite));
			break;
		case 2: 
			aux = JOptionPane.showInputDialog("Digite o valor do deposito:  ");
			JOptionPane.showMessageDialog(null, "\nNumConta: " + ce.getNumConta()
			+ "\nSaldo: " + ce.getSaldo()
			+ "\nLimite: " + ce.getLimite()
			+ "\nSaldo Atual: " + ce.depositar(limite));
		
			default:
				JOptionPane.showMessageDialog(null, "Opção invalida");
		}
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		continuar = JOptionPane.showInputDialog("Deseja continuar? ");
		}
		JOptionPane.showMessageDialog(null, " *_* Programa finalizado *_* ");
	}
		

}
