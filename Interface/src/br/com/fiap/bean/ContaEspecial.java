package br.com.fiap.bean;

import javax.swing.JOptionPane;

public class ContaEspecial implements ContaBancaria {
	private int numConta;
	private float saldo;
	private float limite;
	
	public ContaEspecial() {
		super();
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	/** 
	 * @author Gustavo Godoi da silva 
	 * @param float valor para sacar
	 * @return Saldo atualizado após o sacar */
	
	public float sacar (float valor) {
		try {
			if (valor <= (saldo + limite)) {
				saldo -= valor;
				
			} else {
				throw new Exception("Saldo insuficiente");
			}
			
		} 
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());	
		}
		return saldo;
	}
	
	/** 
	 * @author Gustavo Godoi da silva 
	 * @param float valor para depositar
	 * @return Saldo atualizado após o saque */
	
	public float depositar(float valor) {
		saldo += valor;
		return saldo;
	}
}
