package lista1Java;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in) ;
		
		double nota1,nota2,nota3,media;
		System.out.println("Digite a nota 1 :\n");
		nota1 = x.nextDouble() ;
		
		System.out.println("Digite a nota 2 :\n");
		nota2 = x.nextDouble() ;
		
		System.out.println("Digite a nota 3 :\n");
		nota3 = x.nextDouble() ;
		
		media = ((nota1 * 2) + (nota2 * 3) + (nota3* 5))/10 ;
				
		System.out.printf("O valor da média foi de %.2f",media);
	}
			
}
