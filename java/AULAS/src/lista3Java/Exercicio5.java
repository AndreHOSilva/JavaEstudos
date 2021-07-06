package lista3Java;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in) ;
		
		int num , num2 , soma = 0 ;
		
		do {
			System.out.println("\nDigite o número\n");
			num = x.nextInt() ;
			
			num2 = num ;
			
			soma += num2;
			
			
		}while(num != 0);
		System.out.println("A soma será de : "+soma);
	}

}
