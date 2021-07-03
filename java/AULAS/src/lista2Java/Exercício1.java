package lista2Java;

import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in) ;
		
		int numA,numB,numC ;
		
		System.out.println("Escreva o primeiro número A\n");
		numA = x.nextInt() ;
		
		System.out.println("Escreva o segundo número B\n");
		numB = x.nextInt() ;
		
		System.out.println("Escreva o terceiro número C\n");
		numC = x.nextInt() ;
		
		if(numA > numB && numA > numC) {
			System.out.println("Maior numero é o A");
		}
		else if(numB > numA && numB > numC){
			System.out.println("Maior numero é o B");
			
		}
		else {
			System.out.println("Maior numero é o C");
		}
	}

}
