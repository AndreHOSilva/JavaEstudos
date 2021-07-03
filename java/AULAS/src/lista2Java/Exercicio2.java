package lista2Java;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in) ;
		
		int numA,numB,numC ;
		
		System.out.println("Escreva o primeiro número");
		numA = x.nextInt() ;
		
		System.out.println("Escreva o segundo número");
		numB = x.nextInt() ;
		
		System.out.println("Escreva o terceiro número");
		numC = x.nextInt();
		
		if(numA < numB && numA < numB && numB < numC ) {
			System.out.printf("A ordem sera %d , %d, %d",numA,numB,numC);
		}
		else if(numB < numA && numB < numC && numA < numC) {
			System.out.printf("A ordem sera %d , %d, %d",numB,numA,numC);
		}
		else if(numC < numA && numC < numB && numB < numA) {
			System.out.printf("A ordem sera %d , %d, %d",numC,numB,numA);
		}
		else if(numA < numB && numA < numB && numC < numB) {
			System.out.printf("A ordem sera %d , %d, %d",numA,numC,numB);
		}
		else if(numB < numA && numB < numC && numC < numA) {
			System.out.printf("A ordem sera %d , %d, %d",numB,numC,numA);
		}
		else {
			System.out.printf("A ordem sera %d , %d, %d",numC,numA,numB);
		}
	}

}
