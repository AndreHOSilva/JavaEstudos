package lista2Java;

import java.util.Scanner;

public class Exerc�cio1 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in) ;
		
		int numA,numB,numC ;
		
		System.out.println("Escreva o primeiro n�mero A\n");
		numA = x.nextInt() ;
		
		System.out.println("Escreva o segundo n�mero B\n");
		numB = x.nextInt() ;
		
		System.out.println("Escreva o terceiro n�mero C\n");
		numC = x.nextInt() ;
		
		if(numA > numB && numA > numC) {
			System.out.println("Maior numero � o A");
		}
		else if(numB > numA && numB > numC){
			System.out.println("Maior numero � o B");
			
		}
		else {
			System.out.println("Maior numero � o C");
		}
	}

}
