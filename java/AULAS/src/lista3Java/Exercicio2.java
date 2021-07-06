package lista3Java;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in) ;
		
		int numero, contador = 0,numeroPar = 0 , contador2 = 0 , numeroImpar = 0 ;
		
		for(int a = 0; a <= 11; a++) {
			System.out.println("Digite um número : ");
			numero = x.nextInt() ;
			a++ ;
			
			if(numero % 2 ==0) {
				
				contador++ ;
			}
			else {
				contador2++ ;
				//System.out.printf("\nEsses são os ímpares a baixo, e o total foi de %d:\n" ,contador2);
				//9
				//System.out.printf("\n%d\n",numeroImpar) ;
			}
		}
		System.out.printf("\nO total de pares foi de %d\n" ,contador);
		
		System.out.printf("\nO total de ímpares foi de %d\n" ,contador2);
		
	}

}
