package entidade;

import java.util.Scanner;

import controller.CaixaEletronicoController;
import model.CaixaEletronico;

public class Main {

	public static void main(String[] args) {
		int menu = -1;
		CaixaEletronicoController caixaEletronicoController = new CaixaEletronicoController();
		CaixaEletronico caixa = caixaEletronicoController.criarConta(0);
		Scanner scan = new Scanner(System.in);
		while (menu != 3) {
			System.out.println("===== Menu =====");
			System.out.println("0 Consultar Saldo");
			System.out.println("1 Sacar ");
			System.out.println("2 Depositar ");
			System.out.println("3 Sair ");

			menu = scan.nextInt();
		

		switch (menu) {
		case 0:
			caixaEletronicoController.exibirSaldo(caixa);
			break;
		case 1:
			caixaEletronicoController.sacar(caixa);
			break;
		case 2:
			break;
		case 3:
			System.out.println("Saindo....");
			break;
		default:
			System.out.println("Opçao invalida!! ");
			break;
		}

	}
	
}
}
