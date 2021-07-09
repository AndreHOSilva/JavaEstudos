package aplicacoes;

import java.util.Scanner;

import entidades.Conta;
import entidades.ContaPoupanca;

public class TesteBanco {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String a ,a1 ;
		int x,x1,desejo ;
		double valor ;
		
		System.out.println("Ola Digite seu nome :");
		a1 = leia.next();
		
		System.out.println("Agora digite sua idade :");
		x1=leia.nextInt();
		
		Conta c1 = new Conta(a1,1234);
		ContaPoupanca c2 = new ContaPoupanca(a1,x1);
		
		c2.menu();
		System.out.println("Qual op vc deseja fazer ? 1-Depósito 2-Saque");
		desejo = leia.nextInt();
		
		System.out.println("Qual valor gostaria de depositar ?");
		valor=leia.nextInt() ;
		
		System.out.println("Qual o dia aniversário da conta ?");
		x = leia.nextInt();
		c2.setDiaAniversario(x) ;
		
		if(desejo == 1) {
			c2.depositar(valor);
			c2.corrigir();
			c2.extrato();
			//c2.corrigir();
			
		}
		else {
			c2.sacar(valor);
	        c2.extrato();
		}
		
		
		

		
		
		

	}

}
