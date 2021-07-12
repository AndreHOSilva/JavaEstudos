package programas;

import java.util.Scanner;

import objeto.Conta;

public class Baking {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Conta cliente1 = new Conta(34);
		
		int op ;
		
		System.out.println("O nuémro da sua conta é "+cliente1.getNumero());
		
		for(int x=0;x<=2;x++) {
			System.out.printf("\nQual operação deseja fazer ? 1-Despósito/2-saque\n");
			op = leia.nextInt();
			if(op ==1) {
				System.out.println("\nQual o valor do depósito ?");
				//double op=leia.nextDouble();
				cliente1.depositar(leia.nextDouble());
				//return ;
				
			}
			else if(op == 2) {
				System.out.println("Qual o valor do saque ?");
				double valorSacar =leia.nextDouble();
				cliente1.sacar(valorSacar);
				//cliente1.imprimirExtrato();
			}
			
			
		}
		System.out.println("Gostaria de ver seu extrato ?");
		
		cliente1.imprimirExtrato();
	}

}
