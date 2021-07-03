package introducao;

import java.util.Scanner;

public class Testeif {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in) ;
		
		int num ;
		
		System.out.println("Escreva um número");
		num =  x.nextInt() ;
		
		if(num == 0) {
			System.out.println("Numero neutro");
		}
		else {
			if(num%2 == 0) {
				System.out.println("Numero par");
				
			}
			else {
				System.out.println("Numero impar");
			}
		}
	}
}
