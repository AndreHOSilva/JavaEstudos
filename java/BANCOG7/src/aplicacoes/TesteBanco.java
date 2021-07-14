/*package aplicacoes;

import java.util.Scanner;

import entidades.Conta;
import entidades.ContaContaCorrente;
import entidades.ContaEmpresarial;
import entidades.ContaPoupanca;

public class TesteBanco {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String a ,a1,s ;
		int x1,desejo,c ;
		double valor,valor2 ;
		
		//c = 3;
		//System.out.println("Ola Digite seu nome :");
		//a1 = leia.next();
		
		//System.out.println("Agora digite sua idade :");
		//x1=leia.nextInt();
		
		
		
		
		
		for(int xx = 1 ; xx<=6;xx++) {
			ContaPoupanca c2 = new ContaPoupanca("a",2);
			ContaEmpresarial c3 = new ContaEmpresarial("b",2);
			ContaContaCorrente c4 = new ContaContaCorrente("c",3,3);
			
			
			
			
			
			
			//System.out.println("Qual o dia aniversário da conta ?");
			//x = leia.nextInt();
			//c2.setDiaAniversario(x) ;
			for(int x=0;x<=4;x++) {
				System.out.println(c4.getSaldo2());
				//c4.menu();
				System.out.println("Qual op vc deseja fazer ? 1-Depósito 2-Saque");
				desejo = leia.nextInt();
				
				System.out.println("Qual valor gostaria de depositar ?");
				valor=leia.nextInt() ;
				c4.depositar(valor);
				System.out.println("Quer tirar talao ?");
				s = leia.next();
				
				if(s.equals("sim") && c4.getTaloes() >= 1) {
					if(c4.getSaldo2() >=90 ) {
						System.out.println("Quantos taloes deseja ?");
						c=leia.nextInt() ;
						c4.tirarTalao(c);
					}
					else if(c4.getSaldo2() >= 60 && c4.getSaldo2() < 90) {
						System.out.println("Você só pode tirar 2 taloes");
						c4.tirarTalao(2);
					}
					else {
						System.out.println("Seu saldo só permite um talão");
						c4.tirarTalao(1);
					
					}
					System.out.println("Desejar continuar ?");
					s = leia.next();
					if(s.equals("nao")) {
						//c4.extrato();
						
						break;
						
						
					}
				}
				
				
				
				
				
				
			}
			System.out.println("Fim de programa");
			
			
			main(args);
			
		}
		}
		
	
}*/
