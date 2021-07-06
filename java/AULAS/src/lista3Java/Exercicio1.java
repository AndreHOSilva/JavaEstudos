package lista3Java;

import java.util.Scanner;

public class Exercicio1 {
	//Informar todos os números de 1000 a 1999 que quando divididos por 11
	//obtemos resto = 5.

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in) ;
		
		for(int a = 1000 ; a <= 1999 ; a++ ) {
			if(a % 11 == 5) {
				System.out.printf("\n%d\n",a);
			}
			
		}
	}

}
