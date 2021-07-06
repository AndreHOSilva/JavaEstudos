package lista3Java;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in) ;
		
		int numero, contador = 0,numeroPar = 0 , contador2 = 0 , numeroImpar = 0 ;
		
		for(int a = 1; a <=3; a++) {
			System.out.println("Digite um número : ");
			numero = x.nextInt() ;
			
			if(numero % 2 ==0) {
				numeroPar = numero ;
				
				contador++ ;
			}
			else {
				numeroImpar = numero ;
				contador2++ ;
				System.out.printf("\nEsses são os ímpares a baixo, e o total foi de %d:\n" ,contador2);
				System.out.printf("\n%d\n",numeroImpar) ;
			}
		}
		System.out.printf("\nEsses são os pares a baixo, e o total foi de %d:\n" ,contador);
		System.out.printf("\n%d\n",numeroPar) ;
		
		System.out.printf("\nEsses são os ímpares a baixo, e o total foi de %d:\n" ,contador2);
		System.out.printf("\n%d\n",numeroImpar) ;
		
		

	}

}
