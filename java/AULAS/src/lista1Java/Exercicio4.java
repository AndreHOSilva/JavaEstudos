package lista1Java;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in) ;
		
		double numeroA,numeroB,numeroC, D , R, S ;
		System.out.println("Digite o numero A :\n");
		numeroA = x.nextInt() ;
		
		System.out.println("Digite o numero B :\n");
		numeroB = x.nextInt() ;
		
		System.out.println("Digite o numero C :\n");
		numeroC = x.nextInt() ;
		
		R = Math.pow((numeroA+numeroB), 2) ;
		
		S = Math.pow((numeroB+numeroC), 2) ;
		
		D = (R + S)/2 ;
		
		System.out.println("O valor de D sera : "+D);
		
		
		
		
		
		
				
				
	}

}
