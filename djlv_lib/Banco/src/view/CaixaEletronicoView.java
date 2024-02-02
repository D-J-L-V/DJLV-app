package view;

import model.CaixaEletronico;

public class CaixaEletronicoView {

	public void exibirSaldo(CaixaEletronico caixaEletronico) {
		System.out.println("Saldo "+ caixaEletronico.getValorSaldo());
	}
	
	public void depositar() {
		System.out.println("Insira o valor do deposito: ");
	}
	public void sacar() {
		System.out.println("Insira o valor de saque: ");
	}
	public void erroSaque(){
		System.out.println("Saldo insuficiente!!! ");
		
	}
	
	public void sacarSucesso(double valorSaque) {
		System.out.println("Saque realizado! " + valorSaque + "sacados");
	}
}

