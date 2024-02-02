package model;

public class CaixaEletronico {
	private double valorSaldo;
	
	

	public CaixaEletronico(double valorSaldo) {
		criarConta(valorSaldo);
	}

	public CaixaEletronico criarConta(double valorSaldo) {
		this.valorSaldo = valorSaldo;
		return null;
	}
	
	public double getValorSaldo() {
		return valorSaldo;
	}

	public void setValorSaldo(double valorSaldo) {
		this.valorSaldo = valorSaldo;
	}
	
	
	
}
