package aplicacoes;

import java.util.Scanner;

import entidades.ContaContaCorrente;
import entidades.ContaEmpresarial;
import entidades.ContaEspecial;
import entidades.ContaEstudantil;
import entidades.ContaPoupanca;
import entidades.Layout;

public class Banco {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in) ;
		Layout menus = new Layout();
		ContaPoupanca c1 = new ContaPoupanca(12,0,10) ;
		ContaContaCorrente c2 = new ContaContaCorrente(0,2,3);
		ContaEspecial c3 = new ContaEspecial(0,15,1000);
		ContaEmpresarial c4 = new ContaEmpresarial(0,25,10000);
		ContaEstudantil c5 = new ContaEstudantil(0,30,5000);
		
		int op,x = 0;
		double valor ;
		for(int y=0;y<=9999;y++) {
			
			
			int opInicial;
			
			//menus.menu();
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ &@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*@@@@@@@\r\n"
					+ "@@@@@@@@@@@@@@@*  .@@@@@@@@@@     .@@@@@@@@@@@  .%@     %#   @@@@@@@@#   @@@@@@@@@@     &@@@  ,@@@@@@@@@@@@@@@@@@@@@@@@     @,  @@@@@(       @*@@@@@@@\r\n"
					+ "@@@@@@@@@@@@@#      @@@@@@@@@      @@@@@&.  @@@@@@@     #@@@(@@@@@@&      &@@@@@@@@     %@@@@ @@@@@@@@@@@@@@@@@@@@@@@*     @@@/&@*@@@@@@@@  @@*@@@@@@@\r\n"
					+ "@@@@@@@@@@@@ @@(     @@@@@@@@     .@@@@@%@@@@@@@@@@     %@@@@@@@@@ &@&     &@@@@@@@     /@@@% @@@@@@@@@@@@@@@@@@@@@@@(     %@    .@@@@@@   @@@*@@@@@@@\r\n"
					+ "@@@@@@@@@&  &@@@*     @@@@@@@     .@@@@@@@@@@@@@@@@     #@@@@@@@  (@@@(     &@@@@@@@&       (@@@@@@@@@@@@@@@@@@@@@@@@@@     @.  , @@@@&    @@@*@@@@@@@\r\n"
					+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*@@@@@@@\r\n"
					+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*@@@@@@@");
			menus.pularLinha();
			menus.menuInicio();
			menus.pularLinha();
			
			System.out.println("\nQual tipo de conta o senhor(a) deseja ?");
			opInicial = leia.nextInt();
			
			
			if(opInicial ==1) {
				for(int w = 0; w<=10;w++) {
					
				
				
				menus.menu1();
				
				System.out.println("Qual operação deseja fazer?");
				System.out.println("[1]DEPÓSITO [2]SAQUE [3]EXTRATO");
				op = leia.nextInt();
				
				if(op == 1) {
					System.out.println("Qual o valor do depósito ?");
					valor = leia.nextDouble();
					x++ ;
					c1.depositar(valor);
					if(x <= 1) {
						c1.corrigir();
						
					}
					
					
				}else if(op == 2) {
					System.out.println("Qual o valor do Saque ?");
					valor = leia.nextDouble();
					c1.sacar(valor);
				}else {
					c1.extrato();
				}
				
				System.out.println("\nDeseja continuar ? [1]Sim [2]Não");
				op = leia.nextInt();
				menus.pularLinha();
				
				if(op == 2) {
					//c1.setSaldo6(c1.getSaldo6());
					//main(args);
					break;
				}
				
				}
			}
			else if(opInicial == 2) {
				for(int z=0;z<=10;z++) {
					menus.menu2();
					System.out.println(" Qual operação deseja fazer?  ");
					System.out.println("[1]Depósito [2]Saque [3]Talões [4]Extrato");
					op = leia.nextInt();
					
					if(op == 1) {
						System.out.println("Qual o valor do depósito ?");
						valor = leia.nextDouble();
						c2.depositar(valor);
						
						
					}else if(op == 2) {
						System.out.println("Qual o valor do Saque ?");
						valor = leia.nextDouble();
						c2.sacar(valor);
					}
					else if(op ==3) {
						System.out.println("Qual a quantidade de talões desejada ?\n");
						System.out.println("Lembre que você tem "+c2.getTaloes()+" de talões");
						x = leia.nextInt() ;
						c2.tirarTalao(x);
					}
					else {
						c2.extrato();
					}
					
					System.out.println("\nDeseja continuar ? 1-Sim 2-Não");
					op = leia.nextInt();
					menus.pularLinha();
					
					if(op == 2) {
						//c1.setSaldo6(c1.getSaldo6());
						//main(args);
						break;
					}
				}
				
				
				
			}
			else if(opInicial == 3) {
				for(int b=0;b<=10;b++) {
					menus.menu3();
					System.out.println("Qual operação deseja fazer?");
					System.out.println("[1]Deposito [2]Saque [3]Extrato");
					System.out.println("Você tem R$"+c3.getLimite()+ " de limite");
					op = leia.nextInt();
					
					if(op == 1 || op ==2) { 
						System.out.println("Qual o valor do depósito/saque ?");
					   
					}
					 
						
					
					if(op == 1) {
						valor = leia.nextDouble();
						c3.depositar(valor);
						
						
					}
					else if(op == 2) {
						valor = leia.nextDouble();
						c3.sacar(valor);
					}
					else {
						c3.extrato();
					}
					System.out.println("\nDeseja continuar ?");
					System.out.println("[1]Sim [2]não");
					op = leia.nextInt();
					menus.pularLinha();
					
					if(op == 2) {
						//c1.setSaldo6(c1.getSaldo6());
						//main(args);
						break;
					}
				}
				
			}
			else if(opInicial == 4) {
				for(int b=0;b<=10;b++) {
					menus.menu4();
					System.out.println("Qual operação deseja fazer ?");
					System.out.println("[1]Depósito [2]Saque [3]Empréstimo [4]Extrato");
					System.out.println("Lembre-se você tem um valor de R$"+c4.getDisponivelEmprestimo()+" para empréstimo");
					op = leia.nextInt();
					
					if(op == 1) {
						System.out.println("Qual o valor do depósito ?");
						valor = leia.nextDouble();
						c4.depositar(valor);
						
						
					}else if(op == 2) {
						System.out.println("Qual o valor do Saque ?");
						valor = leia.nextDouble();
						c4.sacar(valor);
					}
					else if(op ==3) {
						System.out.println("Qual o valor do empréstimo");
						valor = leia.nextDouble();
						c4.emprestimo(valor);
					}
					else {
						c4.extrato();
					}
					System.out.println("\nDeseja continuar ?");
					System.out.println("[1]Sim [2]Não");
					op = leia.nextInt();
					menus.pularLinha();
					
					if(op == 2) {
						//c1.setSaldo6(c1.getSaldo6());
						//main(args);
						break;
					}
				}
				
			}
			else if(opInicial == 5) {
				for(int b=0;b<=10;b++) {
					menus.menu5();
					System.out.println("Qual operação deseja fazer ?");
					System.out.println("[1]Depósito [2]Saque [3]Empréstimo [4]Extrato");
					System.out.println("Lembre-se você tem um valor de R$"+c5.getDisponivelEmprestimoEstudantil()+" para empréstimo");
					op = leia.nextInt();
					
					if(op == 1) {
						System.out.println("Qual o valor do depósito ?");
						valor = leia.nextDouble();
						c5.depositar(valor);
						
						
					}else if(op == 2) {
						System.out.println("Qual o valor do Saque ?");
						valor = leia.nextDouble();
						c5.sacar(valor);
					}
					else if(op ==3) {
						System.out.println("Qual o valor do empréstimo");
						valor = leia.nextDouble();
						c5.emprestimo(valor);
					}
					else {
						c5.extrato();
					}
					
					System.out.println("Deseja continuar ?");
					System.out.println("[1]Sim [2]Não");
					op = leia.nextInt();
					menus.pularLinha();
					
					if(op == 2) {
						//c1.setSaldo6(c1.getSaldo6());
						//main(args);
						break;
					}
				}
			}
			
		
		}

	}
}
