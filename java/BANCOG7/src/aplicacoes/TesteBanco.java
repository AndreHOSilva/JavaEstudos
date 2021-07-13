package aplicacoes;

import java.util.Scanner;

import entidades.Conta;
import entidades.ContaEmpresarial;
import entidades.ContaPoupanca;

public class TesteBanco {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String a ,a1 ;
		int x1,desejo,c ;
		double valor,valor2 ;
		
		c = 3;
		System.out.println("Ola Digite seu nome :");
		a1 = leia.next();
		
		System.out.println("Agora digite sua idade :");
		x1=leia.nextInt();
		
		ContaPoupanca c2 = new ContaPoupanca(a1,x1);
		ContaEmpresarial c3 = new ContaEmpresarial(a1,x1);
		
		c3.extrato();
		
		
		c3.menu();
		System.out.println("Qual op vc deseja fazer ? 1-Depósito 2-Saque");
		desejo = leia.nextInt();
		
		System.out.println("Qual valor gostaria de depositar ?");
		valor=leia.nextInt() ;
		c3.depositar(valor);
		
		//System.out.println("Qual o dia aniversário da conta ?");
		//x = leia.nextInt();
		//c2.setDiaAniversario(x) ;
		for(int x=0;x<=4;x++) {
			if(c3.getDisponivelEmprestimo()> 0) {
				System.out.println("Emprestimo ?");
				a = leia.next();
				
				if(a.equals("sim")) {
					valor = leia.nextDouble();
					c3.emprestimo(valor);
					
					System.out.println(c3.getDisponivelEmprestimo());
				}
			}else {
				System.out.println("Seu limite de emprestimo ja foi atingido");
				c3.extrato();
				//break ;
			}
			return ;
		}
		c2.extrato();
		
		
		
		

		
		
		
		
	}
	
}
