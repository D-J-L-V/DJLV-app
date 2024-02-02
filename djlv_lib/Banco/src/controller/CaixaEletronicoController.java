package controller;

import java.util.Scanner;

import model.CaixaEletronico;
import view.CaixaEletronicoView;

public class CaixaEletronicoController {
	private CaixaEletronicoView caixaEletronicoView;
	private  CaixaEletronico caixaEletronico;
	Scanner scan = new Scanner(System.in);
	public CaixaEletronicoController() {
		 caixaEletronicoView = new CaixaEletronicoView(); 
	}
	
	
	   public CaixaEletronico criarConta( double valorSaldo) {
	        caixaEletronico =  new CaixaEletronico(valorSaldo);
	        return caixaEletronico;
	    }
	
	public  void exibirSaldo(CaixaEletronico caixaEletronico) {
		caixaEletronicoView.exibirSaldo(caixaEletronico);
			
	}
	
	
	public void depositar(CaixaEletronico caixaEletronico) {
		caixaEletronicoView.depositar();
		double deposito = scan.nextDouble();
		caixaEletronico.setValorSaldo(deposito + caixaEletronico.getValorSaldo());
		caixaEletronicoView.exibirSaldo(caixaEletronico);
		
	}
	
	public void sacar (CaixaEletronico caixaEletronico) {
		caixaEletronicoView.sacar();
		double saque = scan.nextDouble();
		if(saque >= caixaEletronico.getValorSaldo()) {
			caixaEletronico.setValorSaldo(caixaEletronico.getValorSaldo() - saque);	
			caixaEletronicoView.sacarSucesso(saque);
		}
		else {
			caixaEletronicoView.erroSaque();
		}
		
		
	}
	
	
}
